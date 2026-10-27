package Bridge;

// NotificacionUrgente.java
// ABSTRACCION REFINADA: cambia la logica de alto nivel, sin importar el canal.
public class NotificacionUrgente extends Notificacion {

    public NotificacionUrgente(Canal canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar(destinatario, "[URGENTE] " + mensaje.toUpperCase());
    }
}
