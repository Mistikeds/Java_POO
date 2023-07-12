public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ezequiel", "Puertas","1234562",1000.0);

        try {
            cliente.comprar(100.0);
            System.out.println(cliente.toString());
            cliente.comprar(100.0);
            System.out.println(cliente.toString());
            cliente.comprar(1000.0);
        }catch (ClienteException e){
            e.printStackTrace();
        }
        /*Falta manejar el método "saldarDeuda" con un tryctach
        cliente.saldarDeuda(20000.0);
        System.out.println("Fin de la ejecución");*/
    }
}