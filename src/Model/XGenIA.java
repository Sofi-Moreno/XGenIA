
package Model;
import java.util.Scanner; 

/**
 *
 * @author Sofia Moreno y Ricardo Barrios
 */
public class XGenIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Scanner scan = new Scanner(System.in); 
        Scanner scan1 = new Scanner(System.in); 
        Scanner scanCadenas = new Scanner(System.in);
        boolean salir = false, mostrar=false;
        String opcion, elector, aux;
        int i=0,op,op1;
        double compra=0;
        Refrigerado medicamentoRef = new Refrigerado();
        NoRefrigerado medicamentoNoRef = new NoRefrigerado();
        while(salir==false){
            System.out.println("\t\t---------MENU PRINCIPAL---------");
            System.out.println("\t\t1. Crear Medicamento");
            System.out.println("\t\t2. Mostrar Informacion de todos los medicamentos");
            System.out.println("\t\t3. Retirar lote del mercado");
            System.out.println("\t\t4. Eliminar medicamento del sistema");
            System.out.println("\t\t5. Modificar medicamento");
            System.out.println("\t\t6. Comprar medicamentos");
            System.out.println("\t\t7. Salir");
            System.out.print("\t\tOpcion: ");
            opcion = scan.nextLine();
            
            
            switch(opcion){
                case "1" -> {
                    System.out.print("Cuantos medicamentos desea agregar: ");
                    op = scan1.nextInt();
                    while(i<op){
                        System.out.println("El medicamento requiere de refrigeracion: ");
                        System.out.println("1. Si ");
                        System.out.println("2. No");
                        System.out.print("Opcion: ");
                        op1 = scan1.nextInt();
                        if(op1==1){
                            medicamentoRef.leerDatos();
                            mostrar =true;
                            i++;

                        } else {
                            medicamentoNoRef.leerDatos();
                            mostrar =true;
                            i++;   
                        }        
                    } 
                    i=0;
                }
                case "2" -> {
                    if(mostrar==true){
                        medicamentoRef.imprimirTodoslosMedicamentos();
                        medicamentoNoRef.imprimirTodoslosMedicamentos();
                    }
                    else{System.out.println("ERROR: no ha ingresado ningun medicamento, debe ingresar un medicamento para poder ver su información.");}
                }
                case "3" -> {             
                    
                    System.out.println("El Lote de medicamentos que desea eliminar requiere refrigeracion?: ");
                    System.out.println("1. Si ");
                    System.out.println("2. No");
                    System.out.print("Opcion: ");
                    op1 = scan1.nextInt();
                    if(op1==1){
                        System.out.print("Introduzca el numero de lote a retirar: ");
                        elector = scan.nextLine();
                        medicamentoRef.retirarLote(elector);                                              
                    } else {
                        System.out.print("Introduzca el numero de lote a retirar: ");
                        elector = scan.nextLine();
                        medicamentoNoRef.retirarLote(elector);
                        
                    }
                }
                case "4" -> {                
                    System.out.println("El medicamento que desea eliminar requiere refrigeracion?: ");
                    System.out.println("1. Si ");
                    System.out.println("2. No");
                    System.out.print("Opcion: ");
                    op1 = scan1.nextInt();
                    if(op1==1){
                        System.out.print("Introduzca el codigo del medicamento que desea eliminar: ");
                        elector = scan.nextLine();
                        medicamentoRef.eliminarMedicamento(elector);                                              
                    } else {
                        System.out.print("Introduzca el codigo del medicamento que desea eliminar: ");
                        elector = scan.nextLine();
                        medicamentoNoRef.eliminarMedicamento(elector); 
                    }
                }
                case "5" -> {                
                    System.out.println("El medicamento que desea modificar requiere refrigeracion?: ");
                    System.out.println("1. Si ");
                    System.out.println("2. No");
                    System.out.print("Opcion: ");
                    op1 = scan1.nextInt();
                    if(op1==1){
                        System.out.print("Introduzca el codigo del medicamento que desea modificar: ");
                        elector = scan.nextLine();
                        medicamentoRef.modificarMedicamento(elector);                                              
                    } else {
                        System.out.print("Introduzca el codigo del medicamento que desea modificar: ");
                        elector = scan.nextLine();
                        medicamentoNoRef.modificarMedicamento(elector);  
                    }
                }
                
                case "6" -> {
                    System.out.print("Cuantos medicamentos desea comprar: ");
                    op = scan1.nextInt();
                    while(i<op){
                        System.out.println("El medicamento requiere de refrigeracion: ");
                        System.out.println("1. Si ");
                        System.out.println("2. No");
                        System.out.print("Opcion: ");
                        op1 = scan1.nextInt();
                        if(op1==1){
                            System.out.print("Introduzca el nombre del medicamento que desea comprar: ");
                            aux= scanCadenas.nextLine();
                            compra=compra+medicamentoRef.vender(aux);
                            mostrar =true;
                            i++;

                        } else {
                            System.out.print("Introduzca el nombre del medicamento que desea comprar: ");
                            aux= scanCadenas.nextLine();
                            compra=compra+medicamentoNoRef.vender(aux);
                            mostrar =true;
                            i++;  
                        }        
                    } 
                    System.out.print("El precio total de su compra es de "+compra);
                    i=0; 
                }
                
                case "7" -> {
                    System.out.println("Usted salio con exito");
                    salir=true;
                }
                default->{
                    System.out.println("ERROR: usten increso laopción "+opcion+", dicha opcion no existe, ingresela nuevamente.");
                }
                    
            }
        } 
      
    }
    
}
