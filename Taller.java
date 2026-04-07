import java.util.ArrayList;
public class Taller {
	
	//-------------------- AQUI VAN TODAS LAS LISTAS Q SE USAN --------------------------------
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    ArrayList<Coche> listaCoches = new ArrayList<>();
    ArrayList<Factura> listaFacturas = new ArrayList<>();
    ArrayList<Cita> listaCitas = new ArrayList<>();
    ArrayList<Cliente> listaClientes = new ArrayList<>();



	//-------------------------------------------------------------------------------------------
	public Taller() {
	//------------------------- EMPLEADOS -------------------------------------
	//Empleados test precargados
		Empleado e1 = new Empleado("Carlos", "Mecanico", 1500.00, "08:00 - 16:00", "11111111A");
        Empleado e2 = new Empleado("Maria", "Recepcionista", 1300.00, "09:00 - 14:00 y 16:00 - 19:00", "22222222B");
        Empleado e3 = new Empleado("Luis", "Chapista", 1600.50, "07:00 - 15:00", "33333333C");
        Empleado e4 = new Empleado("Ana", "Pintora", 1600.50, "15:00 - 23:00", "44444444D");
        Empleado e5 = new Empleado("Pedro", "Jefe de Taller", 2500.00, "08:00 - 18:00", "55555555E");
	
		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(e4);
		listaEmpleados.add(e5);
	}
		
	//addEmpleado(añadir empleado)
	public void addEmpleado(Empleado e) { 
    listaEmpleados.add(e);
	}

	//Buscar empleado
	public Empleado buscarEmpleado(String nombreEmpleado) {
    	for (Empleado e : listaEmpleados) {
        	if (e.getNombre().equalsIgnoreCase(nombreEmpleado)) {
        	    return e;
        	}
    	}
		return null;
	}

	//Desglose horarios
	public void desgloseHorario(Empleado e) {
        System.out.println("Horari de: " + e.getNombre());
        System.out.println("Puesto: " + e.getPuesto());
        System.out.println("Turno asignado: " + e.getTurno()); 
    }
	//Listar empleados
	public void listarEmpleados(){
		for (Empleado e : listaEmpleados) {
					System.out.println(e.toString());
				}
	}

	//------------------------------------------------------------------------


	//-------------------------- COCHES -------------------------------------
	
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
