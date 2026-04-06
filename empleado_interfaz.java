import java.util.Scanner;

public class empleado_interfaz {

    Taller miTaller = new Taller();

    public void empleados(){
        int opcionE;
        Scanner sc = new Scanner(System.in);
                    System.out.println("1. Modificar empleado: ");
                    opcionE = sc.nextInt();
                    System.out.println("2. Contratar empleado: ");
                    opcionE = sc.nextInt();
                    System.out.println("3. Ver horario de un empleado");				
                    opcionE = sc.nextInt();
    
                    switch(opcionE){
                        case 1 -> {
                            System.out.println("Que empleado quieres modificar (indica el nombre)");
                            String empleadoNombre = sc.nextLine();
                            System.out.println("1. Modificar Nombre: ");
                            System.out.println("2. Modificar Puesto: ");
                            System.out.println("3. Modicar Sueldo: ");
                            System.out.println("4. Modificar Turno");
                            int modOpcion = sc.nextInt();
                            switch(modOpcion){
                                case 1 -> {
                                    System.out.println("Introduce nuevo nombre: ");
                                    String modNombre = sc.nextLine();
                                }
                                case 2 -> {
                                    System.out.println("Introduce nuevo Puesto: ");
                                    String modPuesto = sc.nextLine();
                                }
                                case 3 -> {
                                    System.out.println("Introduce nuevo sueldo: ");
                                    int modSueldo = sc.nextInt();
                                }
                                case 4 -> {
                                    System.out.println("Introduce nuevo turno: ");
                                    String modTurno = sc.nextLine();
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("Nombre de Empleado: ");
                            String nombre = sc.nextLine();
                            System.out.println("DNI: ");
                            String dni = sc.nextLine();
                            System.out.println("Puesto: ");
                            String puesto = sc.nextLine();
                            System.out.println("Sueldo: ");
                            double Sueldo = sc.nextInt();
                            System.out.println("Turno: ");
                            String turno = sc.nextLine();
                            //Creamos constructor de Empleado 
                            Empleado nuevoEmpleado = new Empleado(nombre, puesto, Sueldo, turno, dni);
                            //Llamamos a taller addEmpleado para añadirlo en la lista
                            miTaller.addEmpleado(nuevoEmpleado);
                        }
                        case 3 -> {
                            //Desglose lista de horarios
                            //llamar metodo desglose horario
                        }
                    }
    }
}
