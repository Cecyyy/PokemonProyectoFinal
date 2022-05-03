import java.util.ArrayList;

public class Entrenador extends Personaje {
    //region -String
    //torneos ganados -int
    //pokedex -ArrayList <Pokemon>
    //mochila - arrayList <Objeoto>

    //pelear (abstracto implementos)
    //escoger pokemons del pokedex
      //si su HP es superior a 15
       //escoger 2 fuertes y 1 debil aleatorio
    //sino tiene fuertes poner 3 aleatorios
    private String region;
    private Pokemon pokemonMacota;
    private int torneosGanados;
    private ArrayList <Pokemon>pokedex;
    private  ArrayList <Objeto> moschila;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pokemon getPokemonMacota() {
        return pokemonMacota;
    }

    public void setPokemonMacota(Pokemon pokemonMacota) {
        this.pokemonMacota = pokemonMacota;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Objeto> getMoschila() {
        return moschila;
    }

    public void setMoschila(ArrayList<Objeto> moschila) {
        this.moschila = moschila;
    }

    public Entrenador(String nombre, int nivel, char genero, String region, Pokemon pokemonMacota, int torneosGanados, ArrayList<Pokemon> pokedex, ArrayList<Objeto> moschila) {
        super(nombre, nivel, genero);
        this.region = region;
        this.pokemonMacota = pokemonMacota;
        this.torneosGanados = torneosGanados;
        this.pokedex = pokedex;
        this.moschila = moschila;
    }
}
