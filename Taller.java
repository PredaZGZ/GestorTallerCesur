import java.util.ArrayList;
public class Taller {
	
	//-------------------- AQUI VAN TODAS LAS LISTAS Q SE USAN --------------------------------
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    ArrayList<Coche> listaCoches = new ArrayList<>();
    ArrayList<Factura> listaFacturas = new ArrayList<>();
    ArrayList<Cita> listaCitas = new ArrayList<>();
    ArrayList<Cliente> listaClientes = new ArrayList<>();


	//-------------------------------------------------------------------------------------------

	//------------------------- EMPLEADOS -------------------------------------
	
	public void addEmpleado(Empleado e) { 
    listaEmpleados.add(e);
	}

	//------------------------------------------------------------------------


	//-------------------------- COCHES -------------------------------------
	
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
