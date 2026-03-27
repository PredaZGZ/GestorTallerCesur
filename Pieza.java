
public class Pieza extends Item {

    private String marca;
    private String referencia;

    public Pieza(String nombre, Double precio, String marca, String referencia) {
        super(nombre, precio);
        this.marca = marca;
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

	public String getReferencia() {
        return referencia;
    }
   
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return super.toString() + " Marca: " + marca + " Ref: " + referencia;
    }
}
