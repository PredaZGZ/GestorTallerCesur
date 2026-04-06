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
		public Coche coche = new Coche(matricula,modelo,descripcionFallo);
			
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

	public void addCliente(String nombre, String apellido, String dni, String telefono){
		Cliente nuevo = new Cliente(nombre, apellido, dni, telefono);
		listaClientes.add(nuevo);
		System.out.println("Cliente guardado correctamente en el sistema. ");
	}

	public Cliente BuscarCliente(String dni){
		for (Cliente c : listaClientes) {
			if(c.getDni().equalsIgnoreCase(dni)) 
			return c;
		}
		return null;
	}

	public void listarClientes(){
		for (Cliente c : listaClientes)
		System.out.println(c);
	}


	
	//------------------------------------------------------------------------


		

	}
	
}
