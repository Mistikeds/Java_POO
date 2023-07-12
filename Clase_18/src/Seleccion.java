import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    private String nombre;
    private List<Jugador> plantel;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<Jugador>();
    }

    public void convocar(Jugador unJugador){
        plantel.add(unJugador);
    }

    public List<Jugador> obtenerReservas(){
        List<Jugador> reserva= new ArrayList<>();
        for (int indiceJugador = 18; indiceJugador < plantel.size(); indiceJugador++) {
            reserva.add(plantel.get(indiceJugador));
        }
        return reserva;
    }

    public Integer cantJugadores(String posicion) throws Exception{
        Integer cantJugadoresPosicion = 0;
        if(!posicion.equals(Jugador.delantero)||!posicion.equals(Jugador.arquero)||!posicion.equals(Jugador.mediocampista)||!posicion.equals(Jugador.defensor)){
            throw new SeleccionException("La posición :"+ posicion + " no existe!");
        }
        for (Jugador jugador : plantel) {
            if(jugador.getPosicion().equals(posicion)){
                cantJugadoresPosicion++;
            }
        }
        return cantJugadoresPosicion;
    }
}