
public class Termometro {
int temperatura;
int agitacion  = 0;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getAgitacion() {
        return agitacion;
    }

    public void setAgitacion(int agitacion) {
        this.agitacion = agitacion;
    }
    void termometro()
    {


            int temp1 = 35 + (int) (Math.random() * ((40 - 35) + 1));
            int temp2 = 35 + (int) (Math.random() * ((40 - 35) + 1));
            temperatura = (temp1 + temp2)/2;
            System.out.println("la temperatura promedio es " + temperatura);


        //   return  temperatura;
    }
}
