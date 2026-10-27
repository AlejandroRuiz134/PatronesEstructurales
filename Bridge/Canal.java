package Bridge;

// Canal.java
// IMPLEMENTACION: define las operaciones de bajo nivel (como se entrega un mensaje).
public interface Canal {
    void enviar(String destinatario, String texto);
}