public class Pokebola extends  Objeto{
    //efectividad - double

    private double efectividad;

    public Pokebola(double costo, int cantidad, String nombre, String tipo, double efectividad) {
        super(costo, cantidad, nombre, tipo);
        this.efectividad = efectividad;
    }
    // dos metods lanzar y atrapar
    //uno de ellos puede que tenga un metedo abstracto

    //atrapar
    //revisar el tipo de pokebola

    //revisar el tipo de pokemon
      //si es legendario -40% de efectividad

    //random del 1-100, si se obtiene un
      // numero entre el 1 y la efectividad
    //restamos la pokebola
          // que lo atrape
    //sino
     //intenta otra vez hasta q ue se terminen las pokebolas o el usuario
    //ya no quiera intentar


}
