
package Model;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;

/**
 *
 * @author Sofia Moreno y Ricardo Barrios
 */
public class Refrigerado extends Medicamento{
    private double temperaturaMaxima;
    private double temperaturaMinima;
    private int tiempoAbierto;
    private int tiempoExpuesto;
    private double recargo;
    private ArrayList lista;
    
    public Refrigerado(){
        super();
        temperaturaMaxima=14;
        temperaturaMinima=0;
        tiempoAbierto = 0;
        tiempoExpuesto=0;
        lista  =  new ArrayList <>();
    }

    public Refrigerado(double temperaturaMaxima, double temperaturaMinima, int tiempoAbierto, int tiempoExpuesto, double recargo, String codigoMedicamento, String nombreMedicamento, double costoMedicamento, double precioVenta, int unidadesVendidas, int unidadesExistentes, String fechaVencimiento, String numeroLote, String vigenciaMedicamento) {
        super(codigoMedicamento, nombreMedicamento, costoMedicamento, precioVenta, unidadesVendidas, unidadesExistentes, fechaVencimiento, numeroLote, vigenciaMedicamento);
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.tiempoAbierto = tiempoAbierto;
        this.tiempoExpuesto = tiempoExpuesto;
        this.recargo = recargo;
    }

    
    
    
    public void calcularRecargo(){
        double venta = getPrecioVenta();
        venta = venta + (venta*25)/100;
        recargo = venta;
    }
    
    @Override
    public void refrigeracionMedicamento(double max, double min, String tem) {
        boolean boleano=true;
        double grado=0;
        do{
            try{
                System.out.print("Introduzca Temperatura "+tem+": ");
                grado = datos.nextDouble();
                if(grado<temperaturaMinima || grado>temperaturaMaxima){
                    System.out.println("ERROR: el grado ingresado debe estar entre 14-0.");
                }
                boleano=false;
            }
            catch(InputMismatchException exception1){
                System.out.println("ERROR: tipo de dato incompatible, ingreselo nuevamente.");
                System.out.print("Precione enter para continuar...");
                datos.nextLine();
                datos.nextLine();
            }
        }while(grado<temperaturaMinima || grado>temperaturaMaxima || boleano);
        if("Maxima".equals(tem)){
            temperaturaMaxima=grado;
        }
        else if("Minima".equals(tem)){
            temperaturaMinima=grado;
        }
    }
    
    public void registrarMedicamento(Refrigerado med){
        lista.add(med);
    }
    
    public void registrarTiempoAbierto(){
        boolean boleano=true;
        int tiempo=0;
        do{
            try{
                System.out.print("Introduce el tiempo maximo que puede durar refrigerado luego de abierto en meses (0-6): ");
                tiempo = datos.nextInt();
                if(tiempo<=0 || tiempo>6){
                    System.out.println("ERROR: usted a ingresado una cantidad fuera de rango, el rango es de 1 mes a 6 meses.");
                }
                boleano=false;
            }
            catch(InputMismatchException exception1){
                System.out.println("ERROR: tipo de dato incompatible, ingreselo nuevamente.");
                System.out.print("Precione enter para continuar...");
                datos.nextLine();
                datos.nextLine();
            }
        }while(tiempo<=0 || tiempo>6 || boleano);
        tiempoAbierto = tiempo;
    }
    
    public void registrarTiempoExpuesto(){
        boolean boleano=true;
        int tiempo=0;
        do{
            try{
                System.out.print("Indica el tiempo de exposición a temperaturas fuera de rango (0-30min): ");
                tiempo = datos.nextInt();
                if(tiempo<=0 || tiempo>30){
                    System.out.println("ERROR: usted a ingresado una cantidad fuera de rango, el rango es de 0 a 30 minutos.");
                }
                boleano=false;
            }
            catch(InputMismatchException exception1){
                System.out.println("ERROR: tipo de dato incompatible, ingreselo nuevamente.");
                System.out.print("Precione enter para continuar...");
                datos.nextLine();
                datos.nextLine();
            }
        }while(tiempo<=0 || tiempo>30 || boleano);
        tiempoExpuesto=tiempo;
    }
    
    @Override
    public void leerDatos(){
        super.leerDatos();
        refrigeracionMedicamento(temperaturaMaxima, temperaturaMinima, "Maxima");
        refrigeracionMedicamento(temperaturaMaxima, temperaturaMinima, "Minima");
        registrarTiempoAbierto();
        registrarTiempoExpuesto();
        Refrigerado refri = new Refrigerado( temperaturaMaxima,  temperaturaMinima, tiempoAbierto, tiempoExpuesto,  recargo,  codigoMedicamento,  nombreMedicamento, costoMedicamento, precioVenta, unidadesVendidas,unidadesExistentes, fechaVencimiento, numeroLote, vigenciaMedicamento);
        registrarMedicamento(refri);
        temperaturaMaxima=14;
        temperaturaMinima=0;
    }
    
    @Override
    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Temperatura Maxima: "+temperaturaMaxima+".");
        System.out.println("Temperatura Minima: "+temperaturaMinima+".");
        System.out.println("Tiempo maximo desspues de abierto: "+tiempoAbierto+" meses.");
        System.out.println("Tiempo expuesto sin refrigeracion: "+tiempoExpuesto+" min.");
    }
    
    public void imprimirTodoslosMedicamentos(){
        Iterator<Refrigerado> it=lista.iterator();
        System.out.println("Lista de Medicamentos Refrigerados : ");
        while (it.hasNext()){
            it.next().mostrarInformacion();
        }          
    }
    
    public void modificarMedicamento(String cod){
       boolean continuar = false;
        for (int i=0; i < lista.size();i++)
         { Refrigerado medi = (Refrigerado) lista.get(i); 
           if (medi.getCodigoMedicamento().equalsIgnoreCase(cod))
            {  
               medi.cambiarNombre();
               medi.cambiarCosto();
               medi.precioVenta = medi.precioAPagar();
               medi.cambiarUnidadesExistentes();
               medi.validarVendidos();
               medi.vencimiento();
               medi.cambiarNumeroLote();
               medi.vigenciaMedicamento = validarVigencia(); 
               i=lista.size(); 
               continuar = true;               
            }          
         }
        if(continuar == false)
              System.out.println("El medicamento de codigo "+cod+" no esta registrado");
    }
    
    public void eliminar(Refrigerado ref){
        lista.remove(ref);
    }
    
    public void eliminarMedicamento(String cod){
        boolean continuar = false;
        Iterator<Refrigerado> it=lista.iterator();
        while (it.hasNext() && continuar == false){
            if (it.next().getCodigoMedicamento().equalsIgnoreCase(cod))
              {
                it.remove();
                System.out.println("El medicamento de codigo "+cod+" fue retirado con exito ");
                continuar=true;
              }  
        }
        if ( continuar == false)
            System.out.println("El medicamento de codigo "+cod+" no esta registrado");
    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        calcularRecargo();
        System.out.println("Precio de Venta con Recargo: "+recargo+"$.");
    }
    public void retirarLote(String lot){
       boolean continuar = false;
        for (int i=0; i < lista.size();i++)
         { Refrigerado medi = (Refrigerado) lista.get(i); 
           if (medi.getNumeroLote().equalsIgnoreCase(lot))
            {  
               medi.cambiarVigencia();
               System.out.println("El lote "+lot+" ha sido retirado con exito");
               i=lista.size(); 
               continuar = true;               
            }          
         }
        if(continuar == false)
              System.out.println("El lote "+lot+" no esta registrado");
    }
    
    @Override
    public double vender(String nom){
        double venta;
        boolean continuar = false;
        for (int i=0; i < lista.size();i++)
         { Refrigerado medi = (Refrigerado) lista.get(i); 
           if (medi.getNombreMedicamento().equalsIgnoreCase(nom))
            {  
               venta = medi.getPrecioVenta();
               System.out.println("El medicamento "+nom+" ha sido agregado a la compra");
               i=lista.size(); 
               continuar = true; 
               return venta;
            }
           
         }
         if(continuar == false)
              System.out.println("El medicamento "+nom+" no esta registrado");
        return 0;
    }
    
}


