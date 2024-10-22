
package Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sofia Moreno y Ricardo Barrios
 */
public class NoRefrigerado extends Medicamento{
    private double temperaturaMaxima;
    private double temperaturaMinima;
    private String noAlmacenar1;
    private String noAlmacenar2;
    private String noAlmacenar3;
    private ArrayList lista;
    
    Scanner datos = new Scanner(System.in);
    Scanner cadenas = new Scanner(System.in);
    int numerito = 0;
    
    public NoRefrigerado(){
        super();
        temperaturaMaxima=25;
        temperaturaMinima=15;
        lista  =  new ArrayList <>();
    }

    public NoRefrigerado(double temperaturaMaxima, double temperaturaMinima, String noAlmacenar1, String noAlmacenar2, String noAlmacenar3, String codigoMedicamento, String nombreMedicamento, double costoMedicamento, double precioVenta, int unidadesVendidas, int unidadesExistentes, String fechaVencimiento, String numeroLote, String vigenciaMedicamento) {
        super(codigoMedicamento, nombreMedicamento, costoMedicamento, precioVenta, unidadesVendidas, unidadesExistentes, fechaVencimiento, numeroLote, vigenciaMedicamento);
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.noAlmacenar1 = noAlmacenar1;
        this.noAlmacenar2 = noAlmacenar2;
        this.noAlmacenar3 = noAlmacenar3;
    }

    
    
    
    
    @Override
    public void refrigeracionMedicamento(double max, double min, String tem) {
       System.out.println("No requiere refrigeracion especial");
    }
    
    public void registrarMedicamento(NoRefrigerado med){
        lista.add(med);
    }
    
    public void registrarNoAlmacenar(){
        String lugar;
        System.out.println("Introduce tres (3) lugares donde no se pueda almacenar este medicamento.");
        for(int i=1; i<=3; i= i+1){
            System.out.println("Introduce el lugar Nro "+i+":");
            lugar = cadenas.nextLine();
            switch(i){
                case 1 -> noAlmacenar1 = lugar;
                case 2 -> noAlmacenar2 = lugar;
                case 3 -> noAlmacenar3 = lugar;
            }
        }
        
    }
    
    @Override
    public void leerDatos(){
        super.leerDatos();
        registrarNoAlmacenar();
        NoRefrigerado NoRefri = new NoRefrigerado(temperaturaMaxima, temperaturaMinima, noAlmacenar1, noAlmacenar2, noAlmacenar3, codigoMedicamento, nombreMedicamento, costoMedicamento, precioVenta, unidadesVendidas, unidadesExistentes, fechaVencimiento, numeroLote,vigenciaMedicamento);
        registrarMedicamento(NoRefri);       
    }
    
    @Override
    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("No Almacenar en: 1."+noAlmacenar1+".");
        System.out.println("                 2."+noAlmacenar2+".");
        System.out.println("                 3."+noAlmacenar3+".");
        System.out.println("No requiere refrigeracion especial");
       
    }
    
    public void imprimirTodoslosMedicamentos(){
        Iterator<NoRefrigerado> it=lista.iterator();
        System.out.println("Lista de Medicamentos No Refrigerados : ");
        while (it.hasNext()){
            it.next().mostrarInformacion();
        }          
    }
    
    public void modificarMedicamento(String cod){
        boolean continuar = false;
        for (int i=0; i < lista.size();i++)
         { NoRefrigerado medi = (NoRefrigerado) lista.get(i); 
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
    
    public void eliminar(NoRefrigerado noRef){
        lista.remove(noRef);
    }
    
    public void eliminarMedicamento(String cod){
        boolean continuar = false;
        Iterator<NoRefrigerado> it=lista.iterator();
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
        
        
    }
    
    public void retirarLote(String lot){
       boolean continuar = false;
        for (int i=0; i < lista.size();i++)
         { NoRefrigerado medi = (NoRefrigerado) lista.get(i); 
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
         { NoRefrigerado medi = (NoRefrigerado) lista.get(i); 
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
