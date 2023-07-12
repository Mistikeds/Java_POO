public class Paseador {
    private String nombre;

    public Paseador(String nombre) {
        this.nombre = nombre;
    }
    public void pasearUnPerro(Perro perro){
        System.out.println("Estoy paseando al perro: "+ perro.getApodo());
    }

}