import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadorList;


    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadorList = new ArrayList();
    }

    public void agregarJugador(Jugador jugador){
        jugadorList.add(jugador);
    }

    public Integer getCantidadJugadoresLesionados(){
        Integer cantidadLesionados = 0;
        for (Jugador jugador : jugadorList) {
            if(jugador.getEsTitular()&& jugador.getLesionado()){
                cantidadLesionados++;
            }
        }
        return cantidadLesionados;
    }

    public void mostrarJugadoresTitulares(){
        Collections.sort(jugadorList);
        for (Jugador jugador : jugadorList) {
            if(jugador.getEsTitular()){
                System.out.println(jugador);
            }
        }
    }

}