public class Vaca extends Animal{
    private Double peso;

    public Vaca(String nombre, Double energia, Double peso) {
        super(nombre, energia);
        this.peso = peso;
    }

    @Override
    public void hacerRuido() {
        System.out.println("MOOOO!!! :(");
    }

    @Override
    public void comer(Double unidadComida) {
        super.comer(unidadComida);
        peso+=unidadComida/2;
    }

    //Realizo la sobreescritura del toString de la subclase para que imprima lo de la superclase y lo propio de la subclase
    @Override
    public String toString() {
        return super.toString()+"Vaca{" +
                "peso=" + peso +
                '}';
    }
}