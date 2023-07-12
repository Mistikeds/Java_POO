public class Tamagochi {
    private TamagochiState estadoActual;

    public Tamagochi() {
        estadoActual = new Feliz();
    }

    public void darDeComer(){
        estadoActual = estadoActual.comer();
    }
    public void darDeBeber(){
        estadoActual = estadoActual.beber();
    }
    public void darMimos(){
        estadoActual = estadoActual.mimar();
    }

    @Override
    public String toString() {
        return estadoActual.toString();
    }
}
