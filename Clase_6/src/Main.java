public class Main {
    public static void main(String[] args) {
        //Creo la instancia de la impresora usando el primer constructor
        Impresora impresora = new Impresora("HP","USB",2009);
        //Creo la instancia de la impresora1 usando el segundo constructor
        Impresora impresora1 = new Impresora("Espon","Wifi",2007,20);

        //Pruebo imprimir con la primer impresora que tiene 5 papeles.
        impresora.imprimir("Hola mundo!");
        impresora.imprimir("Hola mundo!");
        impresora.imprimir("Hola mundo!");
        impresora.imprimir("Hola mundo!");
        impresora.imprimir("Hola mundo!");
        impresora.imprimir("Hola mundo!");
        //Pruebo imprimir con la segunda impresora que tiene 20 papeles.
        impresora1.imprimir("Holaaa!!");
        impresora1.imprimir("Holaaa!!");
        impresora1.imprimir("Holaaa!!");
        impresora1.imprimir("Holaaa!!");
        impresora1.imprimir("Holaaa!!");
        impresora1.imprimir("Holaaa!!");

    }
}