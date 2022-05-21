public class Pokemon extends Personaje{
   //tostring en todas las clases
    //tipo -tipo
    //habilidad -habilidad
    //hp -int
    //esLegendario -boolean
    //debilContra
    //fuerteContrav -String
    private String tipo;
    private String habilidad;
    private  int hp;
    private  boolean esLegendario;
    private String debilContra;
    private String fuerteContra;
    private int fuerte;
    private int velocidad;

    public Pokemon(String nombre, int nivel, char genero, String tipo, String habilidad, int hp, boolean esLegendario, String debilContra, String fuerteContra, int velocidad) {
        super(nombre, nivel, genero);
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.hp = hp;
        this.esLegendario = esLegendario;
        this.debilContra = debilContra;
        this.fuerteContra = fuerteContra;
        this.velocidad = velocidad;
    }

    public int getFuerte() {
        return fuerte;
    }

    public void setFuerte(int fuerte) {
        this.fuerte = fuerte;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isEsLegendario() {
        return esLegendario;
    }

    public void setEsLegendario(boolean esLegendario) {
        this.esLegendario = esLegendario;
    }

    public String getDebilContra() {
        return debilContra;
    }

    public void setDebilContra(String debilContra) {
        this.debilContra = debilContra;
    }

    public String getFuerteContra() {
        return fuerteContra;
    }

    public void setFuerteContra(String fuerteContra) {
        this.fuerteContra = fuerteContra;
    }

    @Override
    public boolean pelear(Personaje personaje) {
        return false;
    }
    //creacion del toString

    @Override
    public String toString() {
        return "Pokemon{" +
                "tipo='" + tipo + '\'' +
                ", habilidad='" + habilidad + '\'' +
                ", hp=" + hp +
                ", esLegendario=" + esLegendario +
                ", debilContra='" + debilContra + '\'' +
                ", fuerteContra='" + fuerteContra + '\'' +
                ", fuerte=" + fuerte +
                ", velocidad=" + velocidad +
                '}';
    }
}
