public class Pato extends Animal{

    public Pato(String nombre, Double energia) {
        super(nombre, energia);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Cuac cuac!!");
    }

    public void nadar(){
        System.out.println("Nadando!");
    }
}