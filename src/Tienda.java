import java.util.ArrayList;

public class Tienda {
    //los atrinutos son:
  //nombre
    // y objetos disponibles arrayslistobjetos
    //comprar como metodo
    //vender igual

    private String nombre;
    private ArrayList <Objeto> objetosDisponibles;

    public boolean usuarioComprar(double dinero, int cantidad, Objeto objeto){
        //validar que hay suficientes objetos  del tipo requerido (¿?)
        //cantidad y objeto
           //sis si tengo validar que el dinero sea suficiente
             //si el dinero no es suficente
        //sino
            //mostrar que no le alcanza
           //hacemos excepcion de que no hay la cantidd que quiere

        return false;
    }

    public boolean usuarioVender(Objeto objeto, int cantidad){
        //logica inversa de comprar
        //dinero infinito en la tienda
        //recibir los objetos y darles el dinero
        return false;
    }
}
