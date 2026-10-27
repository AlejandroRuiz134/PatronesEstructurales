package Flyweight;

// Arbol.java
// CONTEXTO: guarda el estado EXTRINSECO (unico de cada arbol) y una referencia al flyweight.
public class Arbol {

    private final int x;
    private final int y;
    private final TipoArbol tipo;

    public Arbol(int x, int y, TipoArbol tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public TipoArbol getTipo() {
        return tipo;
    }

    public void dibujar() {
        tipo.dibujar(x, y);
    }
}