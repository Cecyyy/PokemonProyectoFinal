import java.util.ArrayList;

public class Tienda {
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

    public ArrayList<Objeto> getObjetosDisponibles() {
        return objetosDisponibles;
    }

    public void setObjetosDisponibles(ArrayList<Objeto> objetosDisponibles) {
        this.objetosDisponibles = objetosDisponibles;
    }

    public Tienda(String nombre, ArrayList<Objeto> objetosDisponibles) {
        this.nombre = nombre;
        this.objetosDisponibles = objetosDisponibles;
    }

    private String nombre;
    private ArrayList <Objeto> objetosDisponibles;

    public boolean usuarioComprar(double dinero, int cantidad, int indiceObjeto,int costo){
        //validar que hay suficientes objetos  del tipo requerido (¿?)
        //cantidad y objeto
           //sis si tengo validar que el dinero sea suficiente
             //si el dinero no es suficente
        //sino
            //mostrar que no le alcanza
           //hacemos excepcion de que no hay la cantidd que quiereS
        if (indiceObjeto>objetosDisponibles.size()){
            double precioTotal =cantidad =objetosDisponibles.get(indiceObjeto).getCantidad();
        }

        return false;
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
        //logica inversa de comprar
        //dinero infinito en la tienda
        //recibir los objetos y darles el dinero
        return false;
    }
}
