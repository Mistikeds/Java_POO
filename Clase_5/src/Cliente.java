public class Cliente {
    //Colocar primero las variables de clase
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    //Luego el constructor, no olvidar inicializar todas las variables.
    //this hacer referencia la variable de la case
    public Cliente(Integer numeroCliente,String nombre){
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        deuda = 0.0;
    }

    //Desarrollo el método para incrementar deuda.
    public void incrementarDeuda(Double valor){
        System.out.println("La deuda anterior era: "+ deuda);
        deuda += valor;
        System.out.println("Tu deuda ahora es: "+ deuda);
    }
    //Desarrollo el método para pagar la deuda
    public void pagarDeuda(){
        System.out.println("Tu deuda anterior era: "+ deuda);
        deuda = 0.0;
        System.out.println("Ahora tu deuda está saldada!" + deuda);
    }

    //Métodos Getter y Setter para nombre.
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


}