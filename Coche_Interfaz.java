import java.util.Scanner;
public class Coche_Interfaz{
    public void Coche(){
        int opcionCo;
        Scanner sc = new Scanner(System.in);
            System.out.println("---GESTION DE COCHE---");
            System.out.println("1. Ver lista de coche");
            opcionCo = sc.nextInt();
            System.out.println("2. Agrega un coche");
            opcionCo = sc.nextInt();
            System.out.println("3. Buscar cliente por matricula");
            opcionCo = sc.nextInt();
            System.out.println("4. Actualizar fallos");
            opcionCo = sc.nextInt();


            switch (opcionCo) {
                case  1 -> {
                    
                }
                case 2 -> {
                   System.out.println("--- Agregar los datos del vehiculo ---");
                    System.out.print("Indica el DNI del dueño para buscarlo: ");
                    String dniBusqueda = sc.nextLine();
    
   
                     Cliente dueño = miTaller.BuscarCliente(dniBusqueda);

                     if (dueño == null) {

                      System.out.println(" El cliente no existe. Debes crearlo primero en el menú de Clientes.");
                      } else {
                      System.out.print("Matricula del coche: ");
                      String matricula = sc.nextLine();
                     System.out.print("Modelo del coche: ");
                     String modelo = sc.nextLine();
                     System.out.print("Descripcion del fallo: ");
                     String fallo = sc.nextLine();

       
                     miTaller.addCoche(dueño, matricula, modelo, fallo);
                }
            }
            case 3 -> {
             System.out.print("Matricula a buscar: ");
            String matricula = sc.nextLine();
            Coche encontrado = miTaller.BuscarCoche(matricula);
            if(encontrado != null) {
            System.out.println(encontrado);
            }else{
            System.out.println("No encontrado");

            } 
                
            }
            case 4 -> {
                System.out.println("--- ACTUALIZAR INFORME DE FALLO ---");
             System.out.print("Introduce la matrícula del vehículo: ");
             String matricula = sc.nextLine();
    
    
             Coche c = miTaller.BuscarCoche(matricula);
    
              if (c != null) {
             System.out.println("Fallo actual: " + c.getDescripcionFallo());
             System.out.print("Introduce la nueva descripción del fallo: ");
              String nuevoFallo = sc.nextLine();
        
       
              miTaller.actualizarFallo(matricula, nuevoFallo);
             } else {
                System.out.println("Error: Ese coche no está registrado en el sistema.");
             }
            }
    }
}