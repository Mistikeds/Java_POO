public class SocioPileta extends Socio{
    //Si estoy en la clase hija, no me olvido del "EXTENDS" y el nombre de la clase padre.
    private Double costoPileta;
    private Boolean estaHabilitado;

    //En el constructor debo colorar el "SUPER" con las variables que corresponden a padre asignándoles lo que se pasa por parámetro también.
    public SocioPileta(String nombre, Double cuotaMensual, Integer numeroSocio, String actividad, Double costoPileta, Boolean estaHabilitado) {
        super(nombre, cuotaMensual, numeroSocio, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    //Cuando hago sobreescritura colocar el "Override" y escribir exactamente igual la firma del método de padre.
    @Override
    public Double calcularCostoMensual(){
        if(estaHabilitado){
            return super.calcularCostoMensual() + costoPileta;
        }else {
            return super.calcularCostoMensual();
        }
    }

}