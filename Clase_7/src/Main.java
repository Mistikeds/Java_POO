public class Main {
    public static void main(String[] args) {

        //Creo las instancias de los perritos
        Perro perro = new Perro("Loki");
        Perro perro1 = new Perro("Fluly");

        //Creo las instancias de Paseador y Persona
        Paseador paseador = new Paseador("Wilfren"); //Paseador solo pasea al perro
        Persona persona = new Persona("Johan",perro); //Persona tiene un perro


        persona.paseaConSuPerro(); //Persona pasea con su perrito
        paseador.pasearUnPerro(perro1); //Paseador saca a pasear al perrito

    }
}