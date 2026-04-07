
import java.util.ArrayList;

public class Factura {

    private int id;
    private Cliente cliente;
    private ArrayList<Item> listaElementos;

    public Factura(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.listaElementos = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item != null) {
            this.listaElementos.add(item);
        }
    }

    public void removeItem(Item item) {
        this.listaElementos.remove(item);
    }

    public Double calcularTotal() {
        Double total = 0.0;
        for (Item item : listaElementos) {
            total += item.getprecio();
        }
        return total;
    }

    public int getId() {
        return id;
    }
    
	public Cliente getCliente() {
        return cliente;
    }
    
	public ArrayList<Item> getListaElementos() {
        return listaElementos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setListaElementos(ArrayList<Item> listaElementos) {
        this.listaElementos = listaElementos;
    }

    @Override
    public String toString() {
        String info = "FACTURA Nº: " + id + "\n" +
                      "Cliente: " + cliente.toString() + "\n" +
                      "------------------------------------------\n";
        
        for (Item item : listaElementos) {
            info += "- " + item.toString() + "\n";
        }
        
        info += "------------------------------------------\n";
        info += "TOTAL FACTURA: " + calcularTotal() + "€";
        
        return info;
    }
}