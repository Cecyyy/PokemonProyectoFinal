import java.util.ArrayList;

public interface UtilInterface {
    /* tiempo jugado

     */
    void tiempoJugado(long tiempoInicial, long tiempoFInal);

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

    // main com implements y nombre de la interface
    //se crean de formaa estatica los elemntos a implementar
    //un main diferente al main original
    //ToDo
    //el main con la inferface, void mostrar menu y tiempo jugado
}
