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

	public void addFactura(int id, Cliente cliente) {
        Factura nueva = new Factura(id, cliente);
        listaFacturas.add(nueva);
        System.out.println("Factura " + id + " creada para el cliente: " + cliente.getNombre());
    }

    public Factura buscarFacturaPorId(int id) {
        for (Factura f : listaFacturas) {
            if (f.getId() == id){
				return f;
			} 
        }
        return null;
    }

    public ArrayList<Factura> buscarFacturasPorCliente(String dni) {
        ArrayList<Factura> filtradas = new ArrayList<>();
        for (Factura f : listaFacturas) {
            if (f.getCliente().getDni().equalsIgnoreCase(dni)) {
                filtradas.add(f);
            }
        }
        return filtradas;
    }

	public ArrayList<Factura> buscarFacturasPorMatricula(String matricula) {
        ArrayList<Factura> filtradas = new ArrayList<>();
        Cliente propietario = null;
        for (Coche c : listaCoches) {
            if (c.getMatricula().equalsIgnoreCase(matricula)) {
                propietario = c.getCliente();
                break;
            }
        }
        if (propietario != null) {
            return buscarFacturasPorCliente(propietario.getDni());
        }       
        return filtradas;
    }

	public void listarFacturas() {
        if (listaFacturas.isEmpty()) {
            System.out.println("No hay facturas en el sistema.");
        } else {
            for (Factura f : listaFacturas) {
                System.out.println(f.toString());
            }
        }
    }
	//------------------------------------------------------------------------


	//-------------------------- CITAS ----------------------------------------
	ArrayList<Cita> listaCitas = new ArrayList<>();



	//------------------------------------------------------------------------


	//-------------------------- CLIENTES ----------------------------------------
	ArrayList<Cliente> listaClientes = new ArrayList<>();


	
	//------------------------------------------------------------------------


		

	}
	
}
