import java.util.ArrayList;
import java.util.List;
public class Partido {
    Equipo equipoLocal;
    Equipo equipoVisitante;
    String fechaHora;
    String resultado;
    List<String> golesEquipoLocal;
    List<String> golesEquipoVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, String fechaHora) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fechaHora = fechaHora;
        this.golesEquipoLocal = new ArrayList<>();
        this.golesEquipoVisitante = new ArrayList<>();
    }

    public void registrarResultado(String resultado) {
        this.resultado = resultado;
        String[] goles = resultado.split("-");
        int golesLocal = Integer.parseInt(goles[0]);
        int golesVisitante = Integer.parseInt(goles[1]);

        for (int i = 0; i < golesLocal; i++) {
            golesEquipoLocal.add(registrarGol(equipoLocal));
        }

        for (int i = 0; i < golesVisitante; i++) {
            golesEquipoVisitante.add(registrarGol(equipoVisitante));
        }
    }

    private String registrarGol(Equipo equipo) {
        String jugadorQueMarcoGol = obtenerJugadorAlAzar(equipo);
        int minutoGol = obtenerMinutoGolAleatorio();
        return jugadorQueMarcoGol + " - Minuto " + minutoGol;
    }

    private String obtenerJugadorAlAzar(Equipo equipo) {
        int indiceAleatorio = (int) (Math.random() * equipo.jugadores.size());
        return equipo.jugadores.get(indiceAleatorio).nombre;
    }

    private int obtenerMinutoGolAleatorio() {
        return (int) (Math.random() * 90) + 1;
    }

    public String calcularGanador() {
        if (resultado != null) {
            String[] goles = resultado.split("-");
            int golesLocal = Integer.parseInt(goles[0]);
            int golesVisitante = Integer.parseInt(goles[1]);

            if (golesLocal > golesVisitante) {
                return equipoLocal.nombreEquipo;
            } else if (golesVisitante > golesLocal) {
                return equipoVisitante.nombreEquipo;
            } else {
                return "Empate";
            }
        }
        return "Partido sin resultado";
    }
}
