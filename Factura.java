package GestorTallerCesur;

import java.time.LocalDate;
import java.util.ArrayList;
public class Factura {
	
	private int id;
	private Cita cita;
	private Cliente cliente;
	private LocalDate fecha;
	private ArrayList<Factura> listafacturas;
	
	private ArrayList<Item> listaElementos;
	
		public Factura(int id, ArrayList<Item> listaElementos) {
			this.id = id;
			this.listaElementos = listaElementos;
			this.fecha = LocalDate.now();
		}
		//calcula el precio de los items sim importar si es servicio, repuesto o item
		public double calcularTotalFactura() {
			double total = 0;

			for(Item r : listaElementos) {
				total += r.calcularPrecioFinal();
			}
			return total;
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public ArrayList<Item> getListaElementos() {
			return listaElementos;
		}

		public void setListaElementos(ArrayList<Item> listaElementos) {
			this.listaElementos = listaElementos;
		}

		@Override
		public String toString() {
			return "Factura [id=" + id + ", listaElementos=" + listaElementos + "]";
		}

	
}
