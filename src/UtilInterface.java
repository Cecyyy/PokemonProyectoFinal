import java.util.ArrayList;

public interface UtilInterface {
    /* tiempo jugado

     */
    void tiempoJugado(long tiempoInicial, long tiempoFInal);

    //mostrar menu----> void con lista de acciones a realizar
    void monstrarMenu();

    //crear pokemons ---> aleatorio
    Pokemon crearPokemonsAleatorio();

    //generico sacar aleatorio = sacar un elemento generico aleatorio
    //N de namjoon <3
    <N> N sacarAleatorio (ArrayList<N>arrayList);

    //string [] Debil y fuerte
    String[] debilYFuerteAleatorio(String tipo);

    // string [] nombres pokemons = devolver un arreglo de string
    String[] nombresaleatorios (String tipo);

}
