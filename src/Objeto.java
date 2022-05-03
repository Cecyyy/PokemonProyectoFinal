public class Objeto {
    //costo - double
    //cantidad- entero
    //nombre -string
    //tipo - string

    protected double costo;
    protected int cantidad;
    protected String nombre;
    protected String tipo;


    //creacion de los getters y setters

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //creracion del constructor

    public Objeto(double costo, int cantidad, String nombre, String tipo) {
        this.costo = costo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "costo=" + costo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
