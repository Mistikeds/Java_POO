public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Tiburones de la Camada 1");

        equipo.agregarJugador(new Jugador(23,"Johan",true,false));
        equipo.agregarJugador(new Jugador(12,"Nahuel",true,true));
        equipo.agregarJugador(new Jugador(4,"Goku",true,true));

        System.out.println(equipo.getCantidadJugadoresLesionados());
        equipo.mostrarJugadoresTitulares();
    }
}