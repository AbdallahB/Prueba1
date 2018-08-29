public class AnimalDomestico {
    // Atributos
    private String nombre;
    private Integer edad=0;
    private String raza;
    private Integer energia=100;

    //CONSTRUCTOR

    public AnimalDomestico(String nombre, String raza) {
        this.nombre = nombre;
        this.raza=raza;
    }


    //Metodos

    public void comer(Integer racion){
        energia+=racion;
        System.out.println("MMM Que rico, ahora tengo "+ energia+ " energia");

    }

    public void dormir (Integer horas){
      Integer energiaHoraSueno=5;
       energia+=(energiaHoraSueno*horas);
       System.out.println("Dormi "+horas +" "+ "Tengo "+energiaHoraSueno+"en total");

    }

    public void hacerRuido(){
        System.out.println("What does the animal say");


    }

}
