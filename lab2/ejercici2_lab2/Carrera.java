public class Carrera {
    int Longitud_carril;

    Rana r1, r2;


    public Carrera() {

        r1 = new Rana();
        r2 = new Rana();
        r1.setColor_rana("celeste");
        r2.setColor_rana("azul");






    }

    void ganador()
    {
        if((r2.salto2() >= 30) || (r1.salto1() < 30))
        {
            System.out.println("la rana " + r2.getColor_rana() + " gano ");
        }

        else{
            if ((r1.salto1() >= 30) && (r2.salto2() < 30))
            {
                System.out.println("la rana " + r1.getColor_rana() + " gano ");
            }
        }
    }


    public int getLongitud_carril() {
        return Longitud_carril;
    }

    public void setLongitud_carril(int longitud_carril) {
        Longitud_carril = longitud_carril;
    }


}
