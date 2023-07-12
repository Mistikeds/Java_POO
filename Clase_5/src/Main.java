public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente(23,"Sofi"); //Creo la instancia de client pasando por parÃ¡metro datos concretos.

        System.out.println("El cliente "+cliente.getNombre()); //Imprimo el nombre
        cliente.incrementarDeuda(1050.0); //Incremento la deuda
        cliente.incrementarDeuda(1050.0);
        cliente.pagarDeuda(); //Pago la deuda

    }
}