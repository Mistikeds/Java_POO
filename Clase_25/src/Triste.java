public class Triste implements TamagochiState{
    @Override
    public TamagochiState comer() {
        System.out.println("Beep beep, gomitas");
        return this;
    }

    @Override
    public TamagochiState beber() {
        System.out.println("Beep beep beep y titila");
        return this;
    }

    @Override
    public TamagochiState mimar() {
        return new Feliz();
    }
}
