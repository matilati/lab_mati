import java.util.ArrayList;

public class Vehiculo {
int capacidad_de_estanque;
private ArrayList<Persona> personas;

String modelo;
int Km;

    public Vehiculo() {

    }

    public int getCapacidad_de_estanque() {
        return capacidad_de_estanque;
    }

    public void setCapacidad_de_estanque(int capacidad_de_estanque) {
        this.capacidad_de_estanque = capacidad_de_estanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int km) {
        Km = km;
    }
    int  añadir_kilometraje()
    {
        int  variacion_km = (int) (Math.random() * 2000) + 1;
        return variacion_km;
    }

}
