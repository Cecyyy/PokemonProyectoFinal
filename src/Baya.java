
    public class Baya extends Objeto {
        //efecto
        //duracion
        private String efecto;
        private int duracion;
        private Habilidad habilidad;

        //usar
        //si es curacion
        //aunmentr 20
        //si es fuerza
        //aumentar ataque


        public String getEfecto() {
            return efecto;
        }

        public void setEfecto(String efecto) {
            this.efecto = efecto;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public Baya(double costo, int cantidad, String nombre, String tipo, String efecto, int duracion) {
            super(costo, cantidad, nombre, tipo);
            this.efecto = efecto;
            this.duracion = duracion;
        }

        public boolean usar(Pokemon pokemon){
            if (this.efecto.equals("curacion")){
                pokemon.setHp(pokemon.getHp()+20);
                return true;
            }else if (this.efecto.equals(("furza"))){
                pokemon.get().setataqueBase(pokemon.getHabilidad().getataqueBase()+20);
                return true;

            }else if (this.efecto.equals("velocidad")){
                pokemon.setVelocidad(pokemon.getVelocidad()+20);
                return true;
            }else{
                return false;
            }
        }
        //rear toString en todaslas clases

        @Override
        public String toString() {
            return "Baya{" +
                    "efecto='" + efecto + '\'' +
                    ", duracion=" + duracion +
                    '}';
        }
    }

