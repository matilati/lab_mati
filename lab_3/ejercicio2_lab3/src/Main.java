import java.util.Scanner;
public class Main {
    public static void  main (String [] args)
    {
        Seleccion seleccion;
        seleccion = new Seleccion();
        seleccion.anadir();
        System.out.println("¡ ¡ ¡ Puede seleccionar desde el estacionamiento 0 a 9, para arrendar un automovil ! ! ! ");
        while(true)
        {
            Scanner dispara = new Scanner(System.in);
            Scanner pregunta = new Scanner(System.in);
            int automovil;
            String opcion;
            System.out.println("ingrese el  numero de  estacionamiento para arrendar un automovil");
            automovil = dispara.nextInt();
            System.out.println( " Ha arrendado el automovil  marca " + seleccion.mostrar_objeto(automovil).getModelo()  );
            System.out.println( " con capacidad de combustible de " + seleccion.mostrar_objeto(automovil).getCapacidad_de_estanque());
            System.out.println( "y con un kilometraje de " + seleccion.mostrar_objeto(automovil).getKm());
            seleccion.Eliminar_vehiculo(automovil);
            System.out.println(" ¿ Desea arrendar otro automovil ? ");
            opcion = pregunta.nextLine();
            if(opcion.equals("no") || opcion.equals("NO"))
            {
                System.out.println("HASTA LUEGO, QUE TENGA UN BUEN DIA ");
                break;
            }
            if(automovil > 10)
            {
                break;
            }
        }
    }
}
