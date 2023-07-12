public class Jugador implements Comparable<Jugador>{
    private Integer numeroCamiseta;
    private String nombre;
    private Boolean esTitular;
    private Boolean lesionado;

    public Jugador(Integer numeroCamiseta, String nombre, Boolean esTitular, Boolean lesionado) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.esTitular = esTitular;
        this.lesionado = lesionado;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return this.numeroCamiseta.compareTo(otroJugador.numeroCamiseta);
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numeroCamiseta=" + numeroCamiseta +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}