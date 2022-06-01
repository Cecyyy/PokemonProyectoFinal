import java.util.ArrayList;

public interface UtilInterface {
    /* tiempo jugado

     */
    void tiempoJugado(long tiempoInicial, long timepoPresente)throws InterruptedException;
    void tiempoJugado(long tiempoInicial, double tiempoPresente)throws InterruptedException;

    //mostrar menu----> void con lista de acciones a realizar
    void monstrarMenu();

    //crear pokemones ---> aleatorio
    Pokemon crearPokemonesAleatorio();

    //generico sacar aleatorio = sacar un elemento generico aleatorio
    //N de namjoon <3
    <N> N sacarAleatorio (ArrayList<N>arrayList);

    //string [] Debil y fuerte
    String[] debilYFuerteAleatorio(String tipo);

    // string [] nombres pokemons = devolver un arreglo de string
    String[] nombresaleatorios (String tipo);
    //arreglo de string

    // main com implements y nombre de la interface
    //se crean de formaa estatica los elemntos a implementar
    //un main diferente al main original
    //ToDo
    //el main con la inferface, void mostrar menu y tiempo jugado
    //ToDo
    // mostrar menu
    // todo lo de abajo con sout
    //1.- explorar
    //2.-Entrar a tienda
    //3.-tirar objeto
    //4.- ver estadisticas
    //5.- tiempo jugado
}
