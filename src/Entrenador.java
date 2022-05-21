import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
    private double dinero;

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

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

    public Entrenador(String nombre, int nivel, char genero, String region, Pokemon pokemonMacota, int torneosGanados, ArrayList<Pokemon> pokedex, ArrayList<Objeto> moschila, double dinro) {
        super(nombre, nivel, genero);
        this.region = region;
        this.pokemonMacota = pokemonMacota;
        this.torneosGanados = torneosGanados;
        this.pokedex = pokedex;
        this.moschila = moschila;
        this.dinero = dinero;
    }

    @Override
    public boolean pelear(Personaje personaje) {

        //escoger pokemones para pelear
        ArrayList <Pokemon> paraPelea= new ArrayList<>();
        mostrarPokedex();
        System.out.println("Escoge tres pokemones");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el pokemon");
            paraPelea.add(pokedex.get(scanner.nextInt()-1));

        }
        int respuesta=0;
        do {
            System.out.println("1.- Pelear");
            System.out.println("2.- Usar posion");
            System.out.println("3.- Huir");
            respuesta=scanner.nextInt();
            if (respuesta==1){
                System.out.println("Escoge el pokemon para pelear");
                mostrarPokedex(paraPelea);
                int eleccion =scanner.nextInt();
                paraPelea.get(eleccion).pelear(pokemonContrario);
            }else if (respuesta==2){
                //
                mostrarMochila();


                System.out.println("Escoge la baya o pocion para el pokemon");
                int eleccion= scanner.nextInt();
                System.out.println("Esicge el pokemon para dar Baya o Pocion");
                mostrarPokedex (paraPelea);
                moschila.get(eleccion-1).usar(paraPelea.get(scanner.nextInt()));

            }else if (respuesta==3){

            }

        }while (respuesta !=0);


        return false;
    }
    public boolean intercambiar (ArrayList <Pokemon>mochilaOpuesto){
        System.out.println("Los objetos disponibles son: ");
        int indice=1;
        for (Pokemon pokemon:mochilaOpuesto
             ) {
            System.out.println(indice +".-");
            System.out.println(pokemon);
            indice++;

        }
        Scanner leer =new Scanner(System.in);
        System.out.println("Escoger pokemon opuesto: ");
        int pokemonOpuestoEsc= leer.nextInt()-1;

        int pokemonProp = leer.nextInt();
        System.out.println("Intercambiar por:"+ pokedex.get(pokemonProp));
        boolean acpeta=false;

        Random random= new Random();
        int valor = random.nextInt();
        acpeta=(valor ==1);
        if (acpeta){
            Pokemon aux= pokedex.get(pokemonProp);
        }
        return acpeta;
    }

    public void mostrarMochila(){
        System.out.println("Los objtos diponibles son: ");
        int indice=1;
        for (Objeto objeto:moschila
             ) {
            System.out.println(indice+".- ");
            System.out.println(objeto);
            indice++;

        }
    }
    //agregar toString a todas las clases


    @Override
    public String toString() {
        return "Entrenador{" +
                "region='" + region + '\'' +
                ", pokemonMacota=" + pokemonMacota +
                ", torneosGanados=" + torneosGanados +
                ", pokedex=" + pokedex +
                ", moschila=" + moschila +
                ", dinero=" + dinero +
                '}';
    }
}
