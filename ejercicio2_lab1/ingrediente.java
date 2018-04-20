import java.util.ArrayList;

public class ingrediente {
    private String Ingrediente ;
    private int cantidad_ingredientes;


    public String getIngrediente() {
        return Ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        Ingrediente = ingrediente;
    }

    public int getCantidad_ingredientes() {
        return cantidad_ingredientes;
    }

    public void setCantidad_ingredientes(int cantidad_ingredientes) {
        this.cantidad_ingredientes = cantidad_ingredientes;
    }

    public ingrediente(String ingrediente, int cantidad_ingredientes) {
        this.Ingrediente = ingrediente;
        this.cantidad_ingredientes = cantidad_ingredientes;
    }
}
