public class main {
    public static  void  main(String[] args){
        recetario r;
        ingrediente i1 , i2,i3,i4, i5,i6,i7,i8,i9;
        comidas c1, c2 ,c3;

        c1 = new comidas("charquican");
        c2 = new comidas("Pure");
        c3 = new comidas("Cazuela");
        i1 = new ingrediente(" papas" ,8);
        i2 = new ingrediente("  trozos de carne " ,5);
        i3 =new ingrediente(" trozos de  zapallo ", 2);
        i4 = new ingrediente("  porciones de mantequilla " ,2);
        i5 = new ingrediente(" papas" ,6);;
        i6 = new ingrediente(" tazas de leche " ,3);
        i7 = new ingrediente("  choclos  " ,2);
        i8 = new ingrediente(" papas ", 6);
        i9 = new ingrediente(" trosos de zapallo", 4);

        r =  new recetario("libro");
        //agrego platos al recetario
        r.agregarplato(c1);
        r.agregarplato(c2);
        r.agregarplato(c3);
        // agrego ingredientes
        c1.agregar_ingrediente(i1);
        c1.agregar_ingrediente(i2);
        c1.agregar_ingrediente(i3);

        c1.setCant_personas(7);

        c2.agregar_ingrediente(i4);
        c2.agregar_ingrediente(i5);
        c2.agregar_ingrediente(i6);

        c2.setCant_personas(4);
        c3.agregar_ingrediente(i7);
        c3.agregar_ingrediente(i8);
        c3.agregar_ingrediente(i9);

        c3.setCant_personas(5);

        System.out.println(c1.getNombre_plato());
        System.out.println(i1.getCantidad_ingredientes() + i1.getIngrediente());
        System.out.println(i2.getCantidad_ingredientes() + i2.getIngrediente());
        System.out.println(i3.getCantidad_ingredientes() + i3.getIngrediente());
        System.out.println("este plato corresponde para " + c1.getCant_personas() + " personas ");

        System.out.println(c2.getNombre_plato());
        System.out.println(i4.getCantidad_ingredientes() + i4.getIngrediente());
        System.out.println(i5.getCantidad_ingredientes() + i5.getIngrediente());
        System.out.println(i6.getCantidad_ingredientes() + i6.getIngrediente());
        System.out.println("este plato corresponde para " + c2.getCant_personas() + " personas ");

        System.out.println(c3.getNombre_plato());
        System.out.println(i7.getCantidad_ingredientes() + i7.getIngrediente());
        System.out.println(i8.getCantidad_ingredientes() + i8.getIngrediente());
        System.out.println(i9.getCantidad_ingredientes() + i9.getIngrediente());
        System.out.println("este plato corresponde para " + c3.getCant_personas() + " personas ");



    }
}
