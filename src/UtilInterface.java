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
    <N> N sacarAleatorio (ArrayList<N>arrayList);

    //string [] Debil y fuerte
}
