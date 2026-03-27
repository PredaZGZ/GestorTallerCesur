
public class Servicio extends Item {

    private int horasTrabajo;
    private String descripcion;

    public Servicio(String nombre, Double precio, int horasTrabajo, String descripcion) {
        super(nombre, precio);
        this.horasTrabajo = horasTrabajo;
        this.descripcion = descripcion;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString() + " Horas: " + horasTrabajo + " Descripción: " + descripcion;
    }
}