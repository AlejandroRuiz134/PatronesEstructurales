package Bridge;

// CanalPush.java
public class CanalPush implements Canal {
    @Override
    public void enviar(String destinatario, String texto) {
        System.out.println("[Push a " + destinatario + "] " + texto);
    }
}