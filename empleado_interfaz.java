import java.util.Scanner;

public class empleado_interfaz {

    Taller miTaller = new Taller();

    public void empleados(){
        int opcionE;
        
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("1. Modificar empleado: ");
        System.out.println("2. Contratar empleado: ");
        System.out.println("3. Ver horario de un empleado");     
        System.out.println("4. Ver todos los empleados contratados");           
        opcionE = sc.nextInt();

        sc.nextLine(); 

        switch(opcionE){
            case 1 -> {
                System.out.println("Que empleado quieres modificar (indica el nombre)");
                String empleadoNombre = sc.nextLine();
                Empleado empleadoModificar = miTaller.buscarEmpleado(empleadoNombre);
                
                if (empleadoModificar != null) {
                    System.out.println("1. Modificar Nombre: ");
                    System.out.println("2. Modificar Puesto: ");
                    System.out.println("3. Modificar Sueldo: ");
                    System.out.println("4. Modificar Turno");
                    int modOpcion = sc.nextInt();
                    
                    sc.nextLine(); 
                    
                    switch(modOpcion){
                        case 1 -> {
                            System.out.println("Introduce nuevo nombre: ");
                            String modNombre = sc.nextLine();
                            empleadoModificar.setNombre(modNombre);
                            System.out.println("Nombre modificado con exito.");
                        }
                        case 2 -> {
                            System.out.println("Introduce nuevo Puesto: ");
                            String modPuesto = sc.nextLine();
                            empleadoModificar.setPuesto(modPuesto); 
                            System.out.println("Puesto modificado a la perfección.");
                        }
                        case 3 -> {
                            System.out.println("Introduce nuevo sueldo: ");
                            double modSueldo = sc.nextDouble(); 
                            sc.nextLine(); 
                            empleadoModificar.setSueldo(modSueldo);
                            System.out.println("Sueldo modificado a la primera.");
                        }
                        case 4 -> {
                            System.out.println("Introduce nuevo turno: ");
                            String modTurno = sc.nextLine();
                            empleadoModificar.setTurno(modTurno);
                            System.out.println("Turno modificado espectacularmente.");
                        }
                    }
                } else {
                    System.out.println("Error: No se encontró al empleado para modificar.");
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
                double Sueldo = sc.nextDouble(); 
                
                sc.nextLine(); 
                
                System.out.println("Turno: ");
                String turno = sc.nextLine();
                Empleado nuevoEmpleado = new Empleado(nombre, puesto, Sueldo, turno, dni);
                miTaller.addEmpleado(nuevoEmpleado);
                System.out.println("¡Empleado añadido con éxito a la plantilla!");
            }
            case 3 -> {
                System.out.println("Que empleado quieres desglosar el horario (indica el nombre)");
                String empleadoNombre = sc.nextLine();
                Empleado empleadoHorario = miTaller.buscarEmpleado(empleadoNombre);

                if (empleadoHorario != null) {
                    miTaller.desgloseHorario(empleadoHorario);
                } else {
                    System.out.println("Error: No se ha encontrado a ningun empleado con el nombre '" + empleadoNombre + "'.");
                }
            }
            case 4 -> {
                miTaller.listarEmpleados();
            }
        }
     } while (opcionE != 0);
    }
}