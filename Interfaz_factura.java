import java.util.Scanner;
import java.util.ArrayList;

public class Interfaz_factura {

private Taller miTaller;

    public Factura_Interfaz(Taller taller) {
        this.miTaller = taller;
    }

    public void facturas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- GESTIÓN DE FACTURAS ---");
        System.out.println("1. Buscar por Cliente (DNI)");
        System.out.println("2. Buscar por ID factura");
        System.out.println("3. Buscar por matrícula");
        System.out.println("4. Crear nueva factura");
        System.out.println("5. Listar todas las facturas");
        System.out.print("Selecciona una opción: ");
        
        int opcionF = sc.nextInt();

        switch (opcionF) {
            case 1 -> {
                System.out.print("Indica el DNI del cliente: ");
                String dni = sc.nextLine();
                ArrayList<Factura> facturas = miTaller.buscarFacturasPorCliente(dni);
                mostrarResultados(facturas);
            }
            case 2 -> {
                System.out.print("Indica el ID de la factura: ");
                int id = sc.nextInt();
                Factura f = miTaller.buscarFacturaPorId(id);
                if (f != null) {
                    System.out.println(f);
                } else {
                    System.out.println("No existe ninguna factura con ese ID.");
                }
            }
            case 3 -> {
                System.out.print("Indica la matrícula: ");
                String matricula = sc.nextLine();
                ArrayList<Factura> facturas = miTaller.buscarFacturasPorMatricula(matricula);
                mostrarResultados(facturas);
            }
            case 4 -> {
                System.out.print("Indica el ID para la nueva factura: ");
                int id = sc.nextInt();
                System.out.print("Indica el DNI del cliente para la factura: ");
                String dni = sc.nextLine();
                
                Cliente c = miTaller.buscarCliente(dni);
                if (c != null) {
                    miTaller.addFactura(id, c);
                } else {
                    System.out.println("Error: El cliente no existe. Créalo primero en el menú de clientes.");
                }
            }
            case 5 -> miTaller.listarFacturas();
            
            default -> System.out.println("Opción no válida.");
        }
    }

    private void mostrarResultados(ArrayList<Factura> facturas) {
        if (facturas.isEmpty()) {
            System.out.println("No se encontraron facturas.");
        } else {
            System.out.println("Facturas encontradas:");
            for (Factura f : facturas) {
                System.out.println(f);
                System.out.println("---------------------------");
            }
        }
    }
}
}