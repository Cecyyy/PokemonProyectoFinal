import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main implements UtilInterface {
    static ArrayList <Habilidad> habilidades =new ArrayList<>();
    static Habilidad habilidadUno =new Habilidad("CONFUSION","ataque psiquico ", +82);
    static Habilidad habilidadDos = new Habilidad("CONTRAATAQUE","ataque hierba lazo",+80);
    static Habilidad habilidadTres =new Habilidad("INFORTUNIO","ataque bola sombra",+79);
    static Habilidad habilidadCuatro= new Habilidad("CONFUSION","ataque onda mental",+100);
    static Habilidad habilidadCinco =new Habilidad("GIRO FUEGO","ataque bola sombra",+88);
    static Habilidad habilidadSeis=new Habilidad("COLMILLO ÍGNEO","ataque Sofoco",+89);
    static ArrayList<String>tiposPokemon;
    public static void main(String[] args) {
        long tiempoInicial=System.currentTimeMillis();

        habilidades.add(habilidadUno);
        habilidades.add(habilidadDos);
        habilidades.add(habilidadTres);
        habilidades.add(habilidadCuatro);
        habilidades.add(habilidadCinco);
        habilidades.add(habilidadSeis);
        tiposPokemon=new ArrayList<>(Arrays.asList("HADA","DRAGON","FUEGO","PSIQUICO","PLANTA","SINISESTRO","AGUA"));
        Main objetoMain =new Main();
        int respuesta=1;
        Scanner scanner=new Scanner(System.in);
        while (respuesta!=0){
            objetoMain.monstrarMenu();
            System.out.println("Elige una de las opciones");
            respuesta=scanner.nextInt();
            if (respuesta==1){
                int dejarExplorar=1;
                while (dejarExplorar!=0){
                    Thread.sleep((1500);
                    System.out.println("¡Aparecio un POKEMON SALVAJE!");
                    System.out.println(objetoMain.crearPokemonesAleatorio());
                    System.out.println("¿Quieres seguir explorando? 1.-Si 0.-No");
                    dejarExplorar=scanner.nextInt();
                }
            }
        }
        objetoMain.tiempoJugado((tiempoInicial,System.currentTimeMillis());
        System.out.println(objetoMain.crearPokemonesAleatorio());
        System.out.println(objetoMain.crearPokemonesAleatorio());
        System.out.println(objetoMain.crearPokemonesAleatorio());
    }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoPresente)throws InterruptedException {


    }
    public void tiempoJugado(long tiempoInicial, double tiempoPresente)throws InterruptedException {
        long tiempoInicialL =System.currentTimeMillis();
        Thread.sleep(2000);
        long fin=System.currentTimeMillis();
        tiempoPresente =(double) ((fin-tiempoInicial)/1000);
        System.out.println("El tiempo que has jugado es "+tiempoPresente+"segundos");


    }

    @Override
    public void monstrarMenu() {
        System.out.println("1.- EXPLORAR");
        System.out.println("2.- ENTRAR AL TIENDA");
        System.out.println("3.- TIRAR OBJETO");
        System.out.println("4.- VER ESTADISTICAS");
        System.out.println("5.- TIEMPO JUGADO");

    }

    @Override
    public Pokemon crearPokemonesAleatorio() {
        Random random=new Random();
        return null;
    }
    Pokemon poke1= new Pokemon("Jiglypuff",94, (char) 1,"hada","ataque dormilon",30,false,"Goodra","Ponyta",20);
    Pokemon poke2=new Pokemon("Altaria",23,'f',"dragon","cola de fuego",24,false,"hada","planta",10);
    Pokemon poke3=new Pokemon("Vulpix",31,'m',"fuego","aliento de fuergo",30,false,"hada","planta",20);
    @Override
    public <N> N sacarAleatorio(ArrayList<N> arrayList) {
        Random random= new Random();
        int indice=random.nextInt(0,arrayList.size()-1);

        return arrayList.get(indice);
    }

    @Override
    public String[] debilYFuerteAleatorio(String tipo) {
        //[0]----> DEBIL

        // [1]---->FUERTE
        //VERIFICAR SI LA LOGICA DEDEBIL Y FUERTE
        // CUMPLE  CON CADA TIPO
        //FALTA POR VER CUNT TIPOS VAMOS HACER
        String debilYFuerte []= new String[2];
        switch (tipo){
            case ("HADA"):
                debilYFuerte[0]="DRAGON";//DEBIL CONTRA
                debilYFuerte[1]="FUEGO";//FUERTE CONTRA
                break;
            case ("DRAGON"):
                debilYFuerte[0]="PSIQUICO";//DEBIL CONTRA
                debilYFuerte[1]="HADA";//FUERTE CONTRA
                break;

            case ("FUEGO"):
                debilYFuerte[0]="HADA";//DEBIL CONTRA
                debilYFuerte[1]="PLANTA";//FUERTE CONTRA
                break;
            case ("PSIQUICO"):
                debilYFuerte[0]="SINIESTRO";//DEBIL CONTRA
                debilYFuerte[1]="DRAGON";//FUERTE CONTRA
                break;
            case ("PLANTA"):
                debilYFuerte[0]="FUEGO";//DEBIL CONTRA
                debilYFuerte[1]="AGUA";//FUERTE CONTRA
                break;
            case ("SINIESTRO"):
                debilYFuerte[0]="HADA";//DEBIL CONTRA
                debilYFuerte[1]="PSIQUICO";//FUERTE CONTRA
            case ("AGUA"):
                debilYFuerte[0]="DRAGON";//DEBIL CONTRA
                debilYFuerte[1]="HADA";//FUERTE CONTRA



        }
        return debilYFuerte;
    }

    @Override
    public String[] nombresaleatorios(String tipo) {
        String namjoon[]=new String[6];
        //siete tipos con seis pokemones diferentes c/u
        switch (tipo){
            case ("HADA"):
                namjoon [0]="Jigglypuff";
                namjoon[1]="Sylveon";
                namjoon[2]="Togepi";
                namjoon[3]="Clefairy";
                namjoon[4]="Xernas";
                namjoon[5]="Mew";
                break;
            case ("DRAGON"):
                namjoon [0]="Altaria";
                namjoon[1]="Goodra";
                namjoon[2]="Goomy";
                namjoon[3]="Axew";
                namjoon[4]="Dragonair";
                namjoon[5]="Dratini";
                break;
            case ("FUEGO"):
                namjoon [0]="Ponyta";
                namjoon[1]="Arcanine";
                namjoon[2]="Charizard";
                namjoon[3]="Flareon";
                namjoon[4]="Vulpix";
                namjoon[5]="Ninetales";
                break;
            case ("PSIQUICO"):
                namjoon [0]="Lunatone";
                namjoon[1]="Mewtwo";
                namjoon[2]="Gothorita";
                namjoon[3]="Necrozma";
                namjoon[4]="Musharna";
                namjoon[5]="Espeon";
                break;
            case ("PLANTA"):
                namjoon [0]="Leafeon";
                namjoon[1]="Celebi";
                namjoon[2]="Chikorita";
                namjoon[3]="Tangela";
                namjoon[4]="Sprigatito";
                namjoon[5]="Bayleef";
                break;
            case ("SINIESTRO"):
                namjoon [0]="Umbreon";
                namjoon[1]="Absol";
                namjoon[2]="Meowth";
                namjoon[3]="Mightyena";
                namjoon[4]="Darkrai";
                namjoon[5]="Zorua";
                break;
            case ("AGUA"):
                namjoon [0]="Psyduck";
                namjoon[1]="Piplup";
                namjoon[2]="Milotic";
                namjoon[3]="Suicune";
                namjoon[4]="Vaporeon";
                namjoon[5]="Phione";
                break;


        }
        return namjoon;
    }
}
