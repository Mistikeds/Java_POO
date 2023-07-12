public class CuentaCorriente extends Cuenta implements ImpuestoGravable,Comparable{

    private double descubiertoPermitido;



    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }



    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }



    @Override
    public void extraer(double monto) {
        if(informarSaldo() + descubiertoPermitido <= monto)
            setSaldo(informarSaldo() - monto);
    }

    //Sobreescribo el método que implementé de la Interfaz "ImpuestoGravable"
    //La interfaz "ImpuestoGravable" la creamos nosotros y la clase la implementa
    @Override
    public Double gravar(Double porcentaje) {
        Double montoADescontar = getSaldo()*porcentaje;
        setSaldo(getSaldo()-montoADescontar);
        return montoADescontar;
    }

    //Utilizamos la interfaz Comparable que ya existe en Java y sobreescribimos su método
    //En este caso decidimos comprar el saldo de las cuentas.
    @Override
    public int compareTo(Object o) {
        CuentaCorriente c1 = (CuentaCorriente) o;
        int respuesta = 0;

        if(getSaldo() > c1.getSaldo()){
            respuesta = 1;
        }
        if(getSaldo() < c1.getSaldo()){
            respuesta = -1;
        }
        return respuesta;
    }
}