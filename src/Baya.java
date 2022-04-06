
    public class Baya extends Objeto {
        //efecto
        //duracion
        private String efecto;
        private int duracion;

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
    }

