public class Socio {
    private String nombre;
    private Double cuotaMensual;
    private Integer numeroSocio;
    private String actividad;

    public Socio(String nombre, Double cuotaMensual, Integer numeroSocio, String actividad) {
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.numeroSocio = numeroSocio;
        this.actividad = actividad;
    }

    public Double calcularCostoMensual(){
        return cuotaMensual;
    }

}