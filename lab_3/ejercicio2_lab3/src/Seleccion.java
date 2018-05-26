import java.util.ArrayList;

public class Seleccion {
private ArrayList<Vehiculo> vehiculos;
Vehiculo automovil;

    public Seleccion() {

            vehiculos = new ArrayList<Vehiculo>();

    }
    void anadir()
    {
         int agregar = 0;

        while (agregar < 10)
         {

             automovil = new Vehiculo();
            int agregar_vehiculo =  (int) (Math.random() * 3) + 1;
            switch (agregar_vehiculo)
            {
                 case 1:
                     automovil.setCapacidad_de_estanque(60);
                     automovil.setKm(automovil.añadir_kilometraje());
                     automovil.setModelo("jeep full");
                     vehiculos.add(automovil);
                     break;
                 case 2:
                     automovil.setModelo("mazda 2");
                     automovil.setCapacidad_de_estanque(20);
                     automovil.setKm(automovil.añadir_kilometraje());

                     vehiculos.add(automovil);
                        break;
                 case 3:
                     automovil.setModelo("peugeot 207");
                     automovil.setCapacidad_de_estanque(40);
                     automovil.setKm(automovil.añadir_kilometraje());
                     vehiculos.add(automovil);
                     break;
            }
            agregar = agregar +1;
         }
    }
    void mostrar_Auto()
    {
        System.out.println("el diseño modelo de su automovil  es " + automovil.getModelo());
        //System.out.println("El automovil  tiene un rodaje de " + automovil.getKm());
        //System.out.println("El automovil tiene una capacidad de estanque de" + automovil.getCapacidad_de_estanque());
    }
    Vehiculo mostrar_objeto(int x)
    {
        return vehiculos.get(x);
    }
    void Eliminar_vehiculo (int q)
    {
        vehiculos.remove(q);
    }
}
