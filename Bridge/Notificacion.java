package Bridge;

// Notificacion.java
// ABSTRACCION: logica de alto nivel. Delega el trabajo real en el Canal (el "puente").
public abstract class Notificacion {

    protected final Canal canal;

    protected Notificacion(Canal canal) {
        this.canal = canal;
    }

    public abstract void notificar(String destinatario, String mensaje);
}
