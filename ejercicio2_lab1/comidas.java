import java.util.ArrayList;

public class comidas {
    private String nombre_plato;
    private String Ingrediente ;

    private int cant_personas;
    private ArrayList<ingrediente> ingredientes = new ArrayList<ingrediente>();

    public int getCant_personas() {
        return cant_personas;
    }


    public void setCant_personas(int cant_personas) {
        this.cant_personas = cant_personas;
    }

    public String getNombre_plato()
    {
        return nombre_plato;
    }

    public void setNombre_plato(String nombre_plato)
    {
        this.nombre_plato = nombre_plato;
    }


    public comidas(int cant_personas) {
        this.cant_personas = cant_personas;
    }

    public comidas(String nombre_plato) {
        this.nombre_plato = nombre_plato;

    }

    void agregar_ingrediente  (ingrediente i){
        ingredientes.add(i);


    }

}

