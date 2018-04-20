import java.util.ArrayList;

    public class recetario {
    private String receta;
    private ArrayList<comidas> platos = new ArrayList<comidas>();
        void agregarplato  (comidas comidas){
            platos.add(comidas);
        }

        public recetario(String receta) {
            this.receta = receta;
        }


}
