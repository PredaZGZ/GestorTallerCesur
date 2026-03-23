package Taller;

public class Item {

    private String nombre;
    private Double precio;

    public Item (String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String matricula) {
		this.nombre = nombre;
	}

    public Double getprecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

    @Override
	public String toString() {
		return "Nombre: " + this.nombre + " Precio: " + this.precio;
	}
}
