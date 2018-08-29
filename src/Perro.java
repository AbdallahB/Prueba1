public class Perro extends AnimalDomestico{


    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerRuido() {
        //super.hacerRuido();
        System.out.println("Guau Guau");

    }
}

