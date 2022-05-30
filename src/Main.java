import java.util.ArrayList;

public class Main implements UtilInterface {
    static ArrayList <Habilidad> habilidads =new ArrayList<>();
    static Habilidad habilidadUno =new Habilidad("CONFUSION","ataque psiquico ", +82);
    static Habilidad habilidadDos = new Habilidad("CONTRAATAQUE","ataque hierba lazo",+80);
    static Habilidad habilidadTres =new Habilidad("INFORTUNIO","ataque bola sombra",+79);
    static Habilidad habilidadCuatro= new Habilidad("CONFUSION","ataque onda mental",+100);
    static Habilidad habilidadCinco =new Habilidad("GIRO FUEGO","ataque bola sombra",+88);

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFInal) {

    }

    @Override
    public void monstrarMenu() {

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
