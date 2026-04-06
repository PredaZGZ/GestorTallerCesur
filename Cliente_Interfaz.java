
import java.util.Scanner;

public class Cliente_Interfaz{

    public void cliente(){
        int opcionC;
        Scanner sc = new Scanner(System.in);
            System.out.println("---GESTION DE CLIENTES---");
            System.out.println("1. Ver lista de clientes");
            opcionC = sc.nextInt();
            System.out.println("2. Agrega un cliente");
            opcionC = sc.nextInt();
            System.out.println("2. Buscar cliente por DNI");
            opcionC = sc.nextInt();
            System.out.println("3. Eliminar cliente");
            opcionC = sc.nextInt();


            switch (opcionC) {
                
                case 1 -> {
                    System.out.println("Agrega los datos del cliente:");
                    System.out.println("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.println("Apellido del cliente: ");
                    String apellido = sc.nextLine();
                    System.out.println("DNI: ");
                    String dni = sc.nextLine();
                    System.out.println("Numero de telefono: ");
                    String telefono = sc.nextLine();

                    miTaller.addCliente(nombre, apellido, dni, telefono);
                }
                
                case 2 -> {
                    System.out.println("Indica el DNI del cliente: ");
                    String dni = sc.nextLine();
                    Cliente c = miTaller.BuscarCliente(dni);

                    if(c == null){
                        System.out.println("Cliente no encontrado.");
                    }else {
                        System.out.println("Cliente encontrado: ");
                        System.out.println(c.toString());
                    }
                }
                case 3 ->  miTaller.listarClientes();
            
                 default -> System.out.println("Opcion no valida");
                    
            }
    }
}