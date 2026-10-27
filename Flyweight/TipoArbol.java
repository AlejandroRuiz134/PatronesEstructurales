package Flyweight;

// TipoArbol.java
// FLYWEIGHT: guarda el estado INTRINSECO (compartido e inmutable).
public class TipoArbol {

    private final String nombre;
    private final String color;
    private final String textura;   // en la vida real seria una imagen pesada

    public TipoArbol(String nombre, String color, String textura) {
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }

    // El estado EXTRINSECO (x, y) llega por parametro, no se guarda aqui.
    public void dibujar(int x, int y) {
        System.out.println("Dibujando " + nombre + " (" + color + ", " + textura + ") en (" + x + "," + y + ")");
    }
}
