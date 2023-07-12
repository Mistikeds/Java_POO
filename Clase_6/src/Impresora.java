public class Impresora {
    //Atributos
    private String modelo;
    private String tipoConexion;
    private Integer fechaFabricacion;
    private Integer cantidadHojas;

    //Primer constructor
    public Impresora(String modelo, String tipoConexion, Integer fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.cantidadHojas = 5;
    }

    //Sobrecarga del primer constructor
    public Impresora(String modelo, String tipoConexion, Integer fechaFabricacion, Integer cantidadHojas) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.cantidadHojas = cantidadHojas;
    }

    //Método que aplica la lógica de imprimir
    public void imprimir(String textoImprimir){
        if(tienePapel()){
            System.out.println(textoImprimir);
            cantidadHojas--;
        }else {
            System.out.println("No hay papel! reponga!");
        }
    }
    private Boolean tienePapel(){
        return cantidadHojas>0;
    }



}