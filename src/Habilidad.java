public class Habilidad {
    //nombre -string
    //descripcion - String
    //ataque basico - int

    private String nombre;
    private String descripcion;
    private int ataqueBasico;

    public Habilidad(String nombre, String descripcion, int ataqueBasico) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ataqueBasico = ataqueBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAtaqueBasico() {
        return ataqueBasico;
    }

    public void setAtaqueBasico(int ataqueBasico) {
        this.ataqueBasico = ataqueBasico;
    }

    //toString en tods ls clases

    @Override
    public String toString() {
        return "Habilidad{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", ataqueBasico=" + ataqueBasico +
                '}';
    }
}
