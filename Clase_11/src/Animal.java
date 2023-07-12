public abstract class Animal {
    private String nombre;
    private Double energia;

    public Animal(String nombre, Double energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    public void comer(Double unidadComida){
        energia += unidadComida;
    }

    public abstract void hacerRuido();

    //Realizo la sobreescritura del método toString para que muestre las variables propias de la clase Animal.
    @Override
    public String toString() {
        return "El nombre del animal es: "+nombre+" y su energía es "+energia;
    }
}