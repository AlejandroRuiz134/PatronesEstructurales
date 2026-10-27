package Flyweight;

// Bosque.java
import java.util.ArrayList;
import java.util.List;

// CLIENTE: crea muchos arboles pero pide los tipos a la fabrica.
public class Bosque {

    private final List<Arbol> arboles = new ArrayList<>();

    public void plantar(int x, int y, String nombre, String color, String textura) {
        TipoArbol tipo = FabricaTipoArbol.obtener(nombre, color, textura);
        arboles.add(new Arbol(x, y, tipo));
    }

    public List<Arbol> getArboles() {
        return arboles;
    }
}