import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Map;
public class Prueba {
    int cantidad_de_preguntas = 0;
    private ArrayList<Pregunta> preguntas;
    public Prueba() {

        preguntas = new ArrayList<Pregunta>();
        Pregunta pregunta;


    }

    void añadir_pregunta() {
        Scanner inscribir = new Scanner(System.in);
        Pregunta pregunta;
        String anotar_pregunta;
        while( cantidad_de_preguntas < 10)
        {
            pregunta = new Pregunta();
            System.out.println("ingrese una pregunta ");
            anotar_pregunta = inscribir.nextLine();
            pregunta.setEnunciado(anotar_pregunta);
            preguntas.add(cantidad_de_preguntas, pregunta);
            cantidad_de_preguntas = cantidad_de_preguntas +1;
        }
    }

    void seleccionar_preguntas()
    {
        System.out.println("¡¡¡ BIENVENIDO AL GENERADOR DE PRUEBAS, INGRESE 10 PREGUNTAS Y EL SISTEMA ESCOJERA ");
        System.out.println(" 5 PREGUNTAS PARA REALIZAR SU EVALUACION ");
        int puntaje;
        int suma_puntaje = 0;
        añadir_pregunta();
        int total = 0;
        int numero_pregunta = 0;
        Scanner inscribir_puntaje = new Scanner(System.in);

        while(true) {
            while (total < 5) {
                int agregar_pregunta = (int) (Math.random() * 9);
                System.out.println(preguntas.get(agregar_pregunta).getEnunciado() + " (pregunta n° " + (total +1 ) + ")" );
                total = total +1;
            }

            numero_pregunta = numero_pregunta + 1;
            System.out.println("ingrese un puntaje para la pregunta n°" + numero_pregunta);
            System.out.println("RECUERDE QUE LA SUMATORIA DE LOS PUNTAJES  DE CADA PRUEBA DEBE SER 100 PUNTOS ");
            puntaje = inscribir_puntaje.nextInt();
            suma_puntaje = suma_puntaje + puntaje;

            if (suma_puntaje == 100) {
                System.out.println("seleccion terminada");
                break;
            }
            if (suma_puntaje > 100) {
                System.out.println("Ha exedido el puntaje maximo, se reescojeran las alternativas");
                System.out.println("porfavor ingrese parametros correctos");
                total = 0;
                numero_pregunta = 0;
            }
            if (suma_puntaje < 100  && numero_pregunta >= 0) {
                System.out.println("no alcanza el puntaje requerido, se reescojeran las alternativas");
                System.out.println("porfavor ingrese parametros correctos");
                total = 0;
                numero_pregunta = 0;
            }

        }


    }


}
