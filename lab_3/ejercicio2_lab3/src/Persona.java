public class Persona {
String nombre;
int combustible_gastado;
int km_recorrido;
int tiempo_de_entrega;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible_gastado() {
        return combustible_gastado;
    }

    public void setCombustible_gastado(int combustible_gastado) {
        this.combustible_gastado = combustible_gastado;
    }

    public int getKm_recorrido() {
        return km_recorrido;
    }

    public void setKm_recorrido(int km_recorrido) {
        this.km_recorrido = km_recorrido;
    }

    public int getTiempo_de_entrega() {
        return tiempo_de_entrega;
    }

    public void setTiempo_de_entrega(int tiempo_de_entrega) {
        this.tiempo_de_entrega = tiempo_de_entrega;
    }
}
