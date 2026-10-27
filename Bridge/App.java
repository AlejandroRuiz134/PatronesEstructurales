package Bridge;

// App.java
public class App {
    public static void main(String[] args) {
        // El cliente vincula una abstraccion con una implementacion al construirla.
        Notificacion a = new NotificacionNormal(new CanalEmail());
        Notificacion b = new NotificacionUrgente(new CanalSms());
        Notificacion c = new NotificacionUrgente(new CanalPush());

        a.notificar("ana@correo.com", "Tu pedido fue enviado");
        b.notificar("3001234567", "Pago rechazado");
        c.notificar("usuario-42", "Cuenta bloqueada");
    }
}