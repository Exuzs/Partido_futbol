import java.util.List;
import java.util.ArrayList;

public class Jugador {
    String nombre;
    int edad;
    String posicion;
    List<String> habilidades;
    int numeroCamiseta;

    public Jugador(String nombre, int edad, String posicion, List<String> habilidades, int numeroCamiseta) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.habilidades = habilidades;
        this.numeroCamiseta = numeroCamiseta;
    }
}
