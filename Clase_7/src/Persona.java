public class Persona {
    private String nombre;
    private Perro perro; //Aquí está dada la relación de "Tiene Un" perrito, y se lo declara en el atributo.

    public Persona(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }

    public void paseaConSuPerro(){
        System.out.println("Estoy paseando con "+ perro.getApodo());
        perro.ladrar();
    }
}