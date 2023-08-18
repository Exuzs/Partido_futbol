import java.util.ArrayList;
import java.util.List;
public class Equipo {
    String nombreEquipo;
    List<Jugador> jugadores;
    String entrenador;
    String estadio;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.nombre + " - " + jugador.numeroCamiseta);
        }
    }

    public void asignarEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public void cambiarEstadio(String estadio) {
        this.estadio = estadio;
    }
}
