package GestorTallerCesur;

public class Pieza extends Item {
<<<<<<< HEAD

	public Pieza() {
	
=======
	
	private String nombrePieza;
	private String marca;
	
	
	public Pieza(String nombre, double precioBase, String nombrePieza, String marca ) {
		super(nombre, precioBase);
		this.nombrePieza = nombrePieza;
		this.marca = marca;
>>>>>>> f70b8aac133a239e7392cc603e6b9b015151f8d6
	}


	public String getNombrePieza() {
		return nombrePieza;
	}


	public void setNombrePieza(String nombrePieza) {
		this.nombrePieza = nombrePieza;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
