
package Model;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import  java.time.YearMonth;
import java.time.format.DateTimeFormatter;  
import java.time.temporal.ChronoField;
import java.time.Period;
import java.util.InputMismatchException;

/**
 *
 * @author Sofia Moreno y Ricardo Barrios
 */
public abstract class Medicamento {
    protected String codigoMedicamento;
    protected String nombreMedicamento;
    protected double costoMedicamento;
    protected double precioVenta;
    protected int unidadesVendidas;
    protected int unidadesExistentes;
    protected String fechaVencimiento;
    protected String numeroLote;
    protected String vigenciaMedicamento;
    private int mes, ano;   
    boolean descu = false;
    
    YearMonth fecha = YearMonth.now();
    String fechaActual = fecha.format(DateTimeFormatter.ofPattern("MM/yyyy"));
    
    int anoActual = fecha.get(ChronoField.YEAR);  
    int mesActual = fecha.get(ChronoField.MONTH_OF_YEAR);
    
    
    Scanner datos = new Scanner(System.in);
    Scanner cadenas = new Scanner(System.in);
    
    public Medicamento(){
        codigoMedicamento = "";
        nombreMedicamento = "";
        costoMedicamento = 0.0;
        precioVenta = 0.0;
        unidadesVendidas = 0;
        unidadesExistentes = 0;
        fechaVencimiento = "";
        numeroLote = "";
        vigenciaMedicamento = "";
    }

    public Medicamento(String codigoMedicamento, String nombreMedicamento, double costoMedicamento, double precioVenta, int unidadesVendidas, int unidadesExistentes, String fechaVencimiento, String numeroLote, String vigenciaMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
        this.nombreMedicamento = nombreMedicamento;
        this.costoMedicamento = costoMedicamento;
        this.precioVenta = precioVenta;
        this.unidadesVendidas = unidadesVendidas;
        this.unidadesExistentes = unidadesExistentes;
        this.fechaVencimiento = fechaVencimiento;
        this.numeroLote = numeroLote;
        this.vigenciaMedicamento = vigenciaMedicamento;
    }
    
    public boolean validarExpresionesRegulares(String patron, String cadena){
        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }
    
    public double precioAPagar(){
        double costo;
        costo = (costoMedicamento*20)/100 + costoMedicamento;
        return costo;
    }
    
    public void validarCodigo(){
        String codigo;
        boolean boleano;
        do{
            System.out.print("Introduzca el codigo del Medicamento (LLL-NNNNN): ");
            codigo = cadenas.nextLine();
            boleano = validarExpresionesRegulares("^([A-Z]{3})(\\-)([0-9]{5})$",codigo);
            if(!boleano){
                System.out.println("ERROR: debe ingresar un codigo en el siguiente formato LLL-NNNNN.");
            }
        }while(!boleano);
        codigoMedicamento = codigo;
    }
    
    public void validarLote(){
        String numero;
        boolean boleano;
        do{
            System.out.print("Introduzca el numero de lote del Medicamento (LLNNN): ");
            numero = cadenas.nextLine();
            boleano = validarExpresionesRegulares("^([A-Z]{2})([0-9]{3})$",numero);
            if(!boleano){
                System.out.println("ERROR: debe ingresar un numero de lote en el siguiente formato LLNNN.");
            }
        }while(!boleano);
        numeroLote = numero;
    }
    
    public void vencimiento(){
        String fecha;
        boolean boleano;
        do{
            System.out.println("Introduzca la fecha de vencimiento: ");
            System.out.println("(Nota: la fecha debe ser bajo este formato mm/aaaa, el mes se encuentra en el rango 1-12 y el año en el rango de 2024-2030.)");
            System.out.print("Fecha: ");
            fecha = cadenas.nextLine();
            boleano = validarExpresionesRegulares("^(0[1-9]|1[012])(\\/)(202[4-9])", fecha);
            if(!boleano){
                System.out.println("ERROR: la fecha debe ingresarse con el siguiente formato mm/aaaa, ingresela nuevamente.");
            }
        }while(!boleano);
        fechaVencimiento = fecha;
    }
    
    public String validarVigencia(){
        String vigencia;
        do{
            System.out.println("Introduzca el tipo de vigencia del medicamento: ");
            System.out.println("0. No se encuentra disponible en el mercado.");
            System.out.println("1. Si se encuentra disponible en el mercado.");
            System.out.println("2. Fue retirado del mercado.");
            vigencia = cadenas.nextLine();
            if(!"0".equals(vigencia) && !"1".equals(vigencia) && !"2".equals(vigencia)){
                System.out.println("ERROR: usted a ingresado la opcion "+vigencia+", la misma no existe, ingresela nuevamente.");
            }
        }while(!"0".equals(vigencia) && !"1".equals(vigencia) && !"2".equals(vigencia));
        return vigencia;
    }
    
    public void validarVendidos(){
        boolean boleano=true;
        int unidades=0;
        do{
            try{
                System.out.print("Introduzca la cantidad de unidades Vendidas: ");
                unidades = datos.nextInt();
                if(unidades>unidadesExistentes){
                System.out.println("ERROR: usted a incresado una cantidad de medicamentos vendidos mayor a la existente("+unidadesExistentes+"), ingreselo nuevamente.");
                }
                boleano=false;
            }
            catch(InputMismatchException exception1){
                System.out.println("ERROR: tipo de dato incompatible, ingreselo nuevamente.");
                System.out.print("Precione enter para continuar...");
                datos.nextLine();
                datos.nextLine();
            }
        }while(unidades>unidadesExistentes || boleano);
        unidadesVendidas = unidades;
    }
    
    public void validarCosto(){
        boolean boleano=true;
        double costo = 0;
        do{
            try{
                System.out.print("Introduzca el costo inicial: ");
                costo = datos.nextDouble();
                boleano=false;
            }
            catch(InputMismatchException exception1){
                System.out.println("ERROR: tipo de dato incompatible, ingreselo nuevamente.");
                System.out.print("Precione enter para continuar...");
                datos.nextLine();
                datos.nextLine();
            }
        }while(boleano);
        costoMedicamento = costo;
    }
    
    public void validarUnidades(){
        boolean boleano=true;
        int dato=0;
        do{
            try{
                System.out.print("Introduzca introduzca la cantidad de Unidades Existentes: ");
                dato = datos.nextInt();
                boleano=false;
            }
            catch(InputMismatchException exception1){
                System.out.println("ERROR: tipo de dato incompatible, ingreselo nuevamente.");
                System.out.print("Precione enter para continuar...");
                datos.nextLine();
                datos.nextLine();
            }
        }while(boleano);
        unidadesExistentes = dato;
    }
    
    public void leerDatos(){
        System.out.println("*****INTRODUZCA DATOS DEL MEDICAMENTO*****");
        validarCodigo();
        validarLote();
        System.out.print("Introduzca el nombre del Medicamento: ");
        nombreMedicamento = cadenas.nextLine();
        validarCosto();
        precioVenta = precioAPagar();
        validarUnidades();
        validarVendidos();
        vencimiento();
        
        vigenciaMedicamento = validarVigencia();
    }
    
    public void reponerInventario(){
        if(unidadesExistentes<5){
            System.out.println("Reponer: La cantidad de unidades existentes de este medicamento es menor a 5, te sugerimos reponer el inventario.");
        }
        else{
            System.out.println("Reponer: Hay una buena cantidad de unidades, no es necesario reponerlo.");
        }
    }
    
    public void cambiarVigencia(){
        if("1".equals(vigenciaMedicamento)){
                vigenciaMedicamento = "2";
        }
    }
    
    public void cambiarNombre(){
        String aux, aux2;
        System.out.println("Desea cambiar el nombre del medicamento? ");
        System.out.println("1. Si ");
        System.out.println("2. No ");
        aux = cadenas.nextLine();
        if("1".equals(aux)){
            System.out.print("Introduzca nuevo nombre: ");
            aux2= cadenas.nextLine();
            nombreMedicamento = aux2;
        }
    }
    
    public void cambiarCosto(){
        String aux;
        double aux2;
        System.out.println("Desea cambiar el costo del medicamento? ");
        System.out.println("1. Si ");
        System.out.println("2. No ");
        aux = cadenas.nextLine();
        if("1".equals(aux)){
            System.out.print("Introduzca nuevo costo: ");
            aux2= datos.nextDouble();
            costoMedicamento = aux2;
        }
    }
    
    public void cambiarUnidadesExistentes(){
        String aux;
        int aux2;
        System.out.println("Desea cambiar las unidades existentes del medicamento? ");
        System.out.println("1. Si ");
        System.out.println("2. No ");
        aux = cadenas.nextLine();
        if("1".equals(aux)){
            System.out.print("Introduzca las nuevas unidades existentes: ");
            aux2= datos.nextInt();
            unidadesExistentes = aux2;
        }
    }
    
    public void cambiarNumeroLote(){
        String aux, aux2;
        System.out.println("Desea cambiar el numero de lote del medicamento? ");
        System.out.println("1. Si ");
        System.out.println("2. No ");
        aux = cadenas.nextLine();
        if("1".equals(aux)){
            System.out.print("Introduzca nuevo numero de lote: ");
            aux2= cadenas.nextLine();
            numeroLote = aux2;
        }
    }
    
    public void informacionVencido(){
        System.out.println("Informacion de vencimiento: Fecha: "+fechaVencimiento+".");
        System.out.println("                            Codigo: "+codigoMedicamento+".");
        System.out.println("                            Nombre: "+nombreMedicamento+".");
    }
    
    public void determinarVencido(){
        ano = Integer.parseInt((String) fechaVencimiento.substring(fechaVencimiento.length() - 4));
        mes = Integer.parseInt((String) fechaVencimiento.subSequence(0,2));
        LocalDate fecha1 = LocalDate.of(anoActual, mesActual, 1);
        LocalDate fecha2 = LocalDate.of(ano, mes, 1);
        Period periodo = Period.between(fecha1, fecha2);
        int meses = periodo.getYears() * 12 + periodo.getMonths();
        if(ano==anoActual){
            if(mes<=mesActual){
                System.out.println("Vencimiento: Este lote de medicamentos ya esta vencido.");
                informacionVencido();
                System.out.println("Descuento: Se aplica descuento.");
                colocarOferta(50);
            }
            else{
                System.out.println("Vencimiento: Este lote de medicamentos no esta vencido.");
                System.out.println("Descuento: No se aplica descuento.");
            }
        }
        else if(ano<anoActual){
            System.out.println("Vencimiento: Este lote de medicamentos ya esta vencido.");
            informacionVencido();
            System.out.println("Descuento: Se aplica descuento.");
            colocarOferta(50);
        }
        else if(meses<=3){
            System.out.println("Vencimiento: Este lote de medicamentos vence en 3 meses.");
            informacionVencido();
            System.out.println("Descuento: Se aplica descuento.");
            colocarOferta(30);
        }
        else{
            System.out.println("Vencimiento: Este lote de medicamentos no esta vencido.");
            System.out.println("Descuento: No se aplica descuento.");
        }
    }
    
    public void colocarOferta(int porcentaje){
        precioVenta = precioVenta - (precioVenta*porcentaje)/100;
        descu = true;
    }
    
    public String imprimirVigencia(){
        String vigencia = "";
        if(null != vigenciaMedicamento)switch (vigenciaMedicamento) {
            case "0" -> vigencia="No se encuentra disponible en el mercado";
            case "1" -> vigencia="Si se encuentra disponible en el mercado";
            case "2" -> vigencia="Fue retirado del mercado";
            default -> {
            }
        }
        return vigencia;
    }
    
    public void imprimirInfo(){
        System.out.println("**********INFORMACION MEDICAMENTO**********");
        System.out.println("Codigo: "+codigoMedicamento+".");
        System.out.println("Nombre: "+nombreMedicamento+".");
        System.out.println("Numero de Lote: "+numeroLote+".");
        System.out.println("Fecha de Vencimiento: "+fechaVencimiento+".");
        System.out.println("Vigencia: "+imprimirVigencia()+".");
        System.out.println("Unid. Existentes: "+unidadesExistentes+".");
        System.out.println("Unid. Vendidas: "+unidadesVendidas+".");
        System.out.println("Costo Base: "+costoMedicamento+"$.");
        System.out.println("Precio de venta: "+precioVenta+"$.");
    }
    
    public void mostrarInformacion(){
        imprimirInfo();
        System.out.println("**********OBSERVACIONES**********************");
        reponerInventario();
        determinarVencido();
        if(descu==true){
            System.out.println("Precio de Venta con Descuento: "+precioVenta+".");
        }
    }
    
    /**
     *
     * @param nom
     * @return
     */
    public abstract double vender(String nom);
    
    /**
     *
     * @param max
     * @param min
     * @param tem
     */
    public abstract void refrigeracionMedicamento(double max, double min, String tem);
    
    public String getCodigoMedicamento() {
        return codigoMedicamento;
    }

    public void setCodigoMedicamento(String codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public double getCostoMedicamento() {
        return costoMedicamento;
    }

    public void setCostoMedicamento(double costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public int getUnidadesExistentes() {
        return unidadesExistentes;
    }

    public void setUnidadesExistentes(int unidadesExistentes) {
        this.unidadesExistentes = unidadesExistentes;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getVigencia() {
        return vigenciaMedicamento;
    }

    public void setVigencia(String vigenciaMedicamento) {
        this.vigenciaMedicamento = vigenciaMedicamento;
    }
}
