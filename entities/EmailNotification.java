package entities;

public class EmailNotification implements Notificable{

    public EmailNotification() {
    }

    @Override
    public void send(String message) {
        System.out.println("Email enviado: " + format(message));
    }

}
