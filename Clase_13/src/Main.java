public class Main {

    public static void main(String[] args) {

        CuentaCorriente cc0 = new CuentaCorriente();
        CuentaCorriente cc1 = new CuentaCorriente();
        cc0.setSaldo(2000);
        cc1.setSaldo(2000);

        //Pruebo gravar el impuesto e informar el saldo restante
        cc0.gravar(0.2);
        System.out.println(cc0.informarSaldo());

        //Aquí pruebo comprar los saldos de las cuentas.
        //Solo resta desarrollar la lógica con condicionales para que me diga si arroja x valor de diga que la cuenta es mayor, menor o igual a otra cuenta.
        System.out.println(cc0.compareTo(cc1));
        System.out.println(cc1.compareTo(cc0));

    }

}