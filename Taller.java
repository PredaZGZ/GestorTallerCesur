import java.util.ArrayList;
public class Taller {
	
	//------------------------- EMPLEADOS -------------------------------------
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();



	//------------------------------------------------------------------------


	//-------------------------- COCHES -------------------------------------
	ArrayList<Coche> listaCoches = new ArrayList<>();
	
	public void addCoche(String matricula, String modelo, String descripcionFallo) {
		for (Coche c : listaCoches) {
			if (matricula.equals(c.getMatricula())) {
				throw new IllegalArgumentException("Esta matricula ya esta añadida, añade otra");
				
			}
		}
		Coche coche = new Coche(matricula,modelo,descripcionFallo);
			
		listaCoches.add(coche);
	//------------------------------------------------------------------------


	//-------------------------- FACTURAS ----------------------------------------
	ArrayList<Factura> listaFacturas = new ArrayList<>();



	//------------------------------------------------------------------------


	//-------------------------- CITAS ----------------------------------------
	ArrayList<Cita> listaCitas = new ArrayList<>();



	//------------------------------------------------------------------------


	//-------------------------- CLIENTES ----------------------------------------
	ArrayList<Cliente> listaClientes = new ArrayList<>();


	
	//------------------------------------------------------------------------


		

	}
	
}
