import java.util.ArrayList;

public class Tienda extends Objeto{
    //los atrinutos son:
  //nombre
    // y objetos disponibles arrayslistobjetos
    //comprar como metodo
    //vender igual

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean usar(Pokemon pokemon) {
        return false;
    }

    public ArrayList<Objeto> getObjetosDisponibles() {
        return objetosDisponibles;
    }

    public void setObjetosDisponibles(ArrayList<Objeto> objetosDisponibles) {
        this.objetosDisponibles = objetosDisponibles;
    }

    public Tienda(double costo, int cantidad, String nombre, String tipo, String nombre1, ArrayList<Objeto> objetosDisponibles) {
        super(costo, cantidad, nombre, tipo);
        this.nombre = nombre1;
        this.objetosDisponibles = objetosDisponibles;
    }

    private String nombre;
    private ArrayList <Objeto> objetosDisponibles;
    //el otro try cathc en tiendtr

    public boolean usuarioComprar(double dinero, int cantidad, int indiceObjeto){
        try {
            if (objetosDisponibles.get(indiceObjeto).cantidad >= cantidad) {
                double precioTotal = cantidad * objetosDisponibles.get(indiceObjeto).costo;
                if (dinero >= precioTotal) {
                    System.out.println("Usted esta comprando " + cantidad + " " + objetosDisponibles.get(indiceObjeto).nombre +
                            "por $ " + precioTotal);
                    System.out.println("Su cambio es " + (dinero - precioTotal));
                    return true;
                } else {
                    System.out.println("No contamos con la cantidad solicitada");
                    return false;

                }
            }

            return false;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Objeto no existente");
        }
        return true;
    }
    public void mostrarDisponibles(){
        System.out.println("Los objetos disponibles son: ");
        int indice=1;
        for (Objeto Objeto: objetosDisponibles
        ) {
            System.out.println(indice + " - ");
            System.out.println(Objeto);
            indice++;
        }

    }

    public boolean usuarioVender(Objeto objeto, int cantidad){
       if (objeto.getClass()==Baya.class){
           System.out.println("NO se pueden vender Bayas");
       return false;
       }else if (objeto.getClass()== Pokebola.class){
           int cantidadPokebloa = objeto.cantidad- cantidad;
           System.out.println("La venta se ha completado");
       }
        //logica inversa de comprar
        //dinero infinito en la tienda
        //recibir los objetos y darles el dinero
        return false;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", objetosDisponibles=" + objetosDisponibles +
                '}';
    }
}
