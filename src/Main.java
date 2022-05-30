import java.util.ArrayList;

public class Main implements UtilInterface {
    static ArrayList <Habilidad> habilidades =new ArrayList<>();
    static Habilidad habilidadUno =new Habilidad("CONFUSION","ataque psiquico ", +82);
    static Habilidad habilidadDos = new Habilidad("CONTRAATAQUE","ataque hierba lazo",+80);
    static Habilidad habilidadTres =new Habilidad("INFORTUNIO","ataque bola sombra",+79);
    static Habilidad habilidadCuatro= new Habilidad("CONFUSION","ataque onda mental",+100);
    static Habilidad habilidadCinco =new Habilidad("GIRO FUEGO","ataque bola sombra",+88);
    static Habilidad habilidadSeis=new Habilidad("COLMILLO ÍGNEO","ataque Sofoco",+89);

    public static void main(String[] args) {
        habilidades.add(habilidadUno);
        habilidades.add(habilidadDos);
        habilidades.add(habilidadTres);
        habilidades.add(habilidadCuatro);
        habilidades.add(habilidadCinco);
        habilidades.add(habilidadSeis);
    }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFInal) {


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
        return null;
    }

    @Override
    public <N> N sacarAleatorio(ArrayList<N> arrayList) {
        return null;
    }

    @Override
    public String[] debilYFuerteAleatorio(String tipo) {
        return new String[0];
    }

    @Override
    public String[] nombresaleatorios(String tipo) {
        return new String[0];
    }
}
