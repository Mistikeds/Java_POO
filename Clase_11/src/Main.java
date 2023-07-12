public class Main {
    public static void main(String[] args) {
        Animal animal = new Pato("Donald",100.0);

        animal = new Vaca("Lola",200.0,1500.0);

        animal.hacerRuido();

        //Imprimo el objeto, previamente sobreescribo el toString para que me muestre las variables que yo les señale.
        System.out.println(animal);
    }
}