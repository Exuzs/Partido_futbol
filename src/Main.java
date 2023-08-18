import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Lionel Messi", 34, "Delantero", List.of("Velocidad", "Regate", "Disparo"), 10);
        Jugador jugador2 = new Jugador("Andrés Iniesta", 37, "Centrocampista", List.of("Pase", "Control de balón"), 8);

        Equipo barcelona = new Equipo("FC Barcelona");
        barcelona.agregarJugador(jugador1); // Agregar jugadores al equipo
        barcelona.agregarJugador(jugador2);
        barcelona.asignarEntrenador("Ronald Koeman");
        barcelona.cambiarEstadio("Camp Nou");

        Equipo realMadrid = new Equipo("Real Madrid");
        realMadrid.agregarJugador(new Jugador("Cristiano Ronaldo", 36, "Delantero", List.of("Velocidad", "Remate", "Cabeceo"), 7));
        realMadrid.agregarJugador(new Jugador("Sergio Ramos", 35, "Defensor", List.of("Defensa", "Cabezazo"), 4));
        realMadrid.asignarEntrenador("Carlo Ancelotti");
        realMadrid.cambiarEstadio("Santiago Bernabéu");

        Partido partido = new Partido(barcelona, realMadrid, "2023-08-17 20:00");
        partido.registrarResultado("2-1");

        System.out.println("Equipo ganador: " + partido.calcularGanador());
        System.out.println("Goles del equipo local:");
        for (String gol : partido.golesEquipoLocal) {
            System.out.println(gol);
        }
        System.out.println("Goles del equipo visitante:");
        for (String gol : partido.golesEquipoVisitante) {
            System.out.println(gol);
        }
    }
}