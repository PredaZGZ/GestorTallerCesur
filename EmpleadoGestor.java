import java.util.ArrayList;

public class EmpleadoGestor {

    ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public void contratarEmpleado(String nombre, String puesto, double sueldo, String turno) {
		Empleado nuevoEmpleado = new Empleado(nombre, puesto, sueldo, turno);
		listaEmpleados.add(nuevoEmpleado);
	}
    
}