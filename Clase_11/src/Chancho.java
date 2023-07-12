public class Chancho extends Animal{

    public Chancho(String nombre) {
        super(nombre, 100.0);
    }

    @Override
    public void hacerRuido() {
        System.out.println("oinc oinc");
    }

    @Override
    public void comer(Double pesoComida) {
        super.comer(pesoComida*2);
    }
}