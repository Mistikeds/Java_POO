public class Main {
    public static void main(String[] args) {

        //Pruebo crear de diferentes maneras a un socio.
        SocioPileta socioPileta = new SocioPileta("Juan",12000.0,25,"Correr",4000.0,false);
        Socio socio = new Socio("Mariano",12000.0,12,"Programar");
        Socio otroSocio = new SocioPileta("Johan",12000.0,12,"Programar",4000.0,false);

        //Pruebo el resultado del metodo en cada una de las instancias generadas.
        System.out.println(socioPileta.calcularCostoMensual());
        System.out.println(socio.calcularCostoMensual());
        System.out.println(otroSocio.calcularCostoMensual());
    }
}