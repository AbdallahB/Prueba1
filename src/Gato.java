public class Gato extends AnimalDomestico {

    //ATRIBUTOS
    private Integer vidas=9;


    public Gato(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerRuido() {
        //super.hacerRuido();
        System.out.println("Miauuu");

    }

    public void rasguniar(){
        System.out.println("Guajjj Guajjj ");

    }

}
