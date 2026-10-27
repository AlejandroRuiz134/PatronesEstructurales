package Composite;

// ElementoArchivo.java
// COMPONENTE: operaciones comunes a elementos simples (archivos) y complejos (carpetas).
public interface ElementoArchivo {
    String getNombre();

    long getTamano();                       // en KB

    void mostrar(String sangria);
}