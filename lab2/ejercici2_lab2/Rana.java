import java.util.Random;

public class Rana {
String color_rana;
String dueno_rana;
Carrera carrera;
int Salto_rana;

    public String getDueno_rana() {
        return dueno_rana;
    }

    public void setDueno_rana(String dueno_rana) {
        this.dueno_rana = dueno_rana;
    }

    public int getSalto_rana() {
        return Salto_rana;
    }

    public void setSalto_rana(int salto_rana) {
        Salto_rana = salto_rana;
    }

    public String getColor_rana() {
        return color_rana;
    }

    public void setColor_rana(String color_rana) {
        this.color_rana = color_rana;
    }

    int salto1 ()
 {
        int saltorana;

        saltorana = 0;
        while(saltorana < 30)
        {
            int saltando = 1 + (int) (Math.random() * ((3 - 0) + 1));

            saltorana = saltorana + saltando;

        }
        return saltorana;
 }
    int salto2 ()
    {
        int saltorana2;

        saltorana2 = 0;
        while(saltorana2 < 30)
        {
            int saltando = 1 + (int) (Math.random() * ((3 - 0) + 1));

            saltorana2 = saltorana2 + saltando;

        }
        return saltorana2;
    }




}
