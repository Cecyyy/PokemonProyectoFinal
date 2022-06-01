public class Pokemon extends Personaje {
    //tostring en todas las clases
    //tipo -tipo
    //habilidad -habilidad
    //hp -int
    //esLegendario -boolean
    //debilContra
    //fuerteContrav -String
    private String tipo;

    private int hp;
    private boolean esLegendario;
    private String debilContra;
    private String fuerteContra;
    private int fuerte;
    private int velocidad;
    private Habilidad habilidad;

    public Pokemon(String nombre, int nivel, char genero, String tipo, String habilidad, int hp, boolean esLegendario, String debilContra, String fuerteContra, int velocidad) {
        super(nombre, nivel, genero);
        this.tipo = tipo;

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
    //checar su tipo de elemento
    //si un (elemento) es mas fuerte que otro 

    @Override


    public boolean pelear(Pokemon pokemonContrario) {
        if (this.fuerteContra.equals(pokemonContrario.getTipo())) {
            this.habilidad.setAtaqueBasico(this.habilidad.getAtaqueBasico() + 30);
            pokemonContrario.habilidad.setAtaqueBasico(this.habilidad.getAtaqueBasico() - 20);


        } else if (pokemonContrario.getFuerteContra().equals(this.tipo)) {
            this.habilidad.setAtaqueBasico(this.habilidad.getAtaqueBasico() - 20);
            pokemonContrario.habilidad.setAtaqueBasico(pokemonContrario.habilidad.getAtaqueBasico() + 30);
        } else {
        }
        do {
            if (this.velocidad >= pokemonContrario.velocidad) {
                pokemonContrario.setHp(pokemonContrario.getHp() - this.habilidad.getAtaqueBasico());
                if (pokemonContrario.getHp() <= 0) {
                    return true;
                }
            } else {
                this.hp -= pokemonContrario.getHabilidad
            }
        } while (true);

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

