package entities;

public class SmsNotification implements Notificable{

    public SmsNotification() {
    }

    @Override
    public String format(String message) {
        return "[" + message.toUpperCase() + "]"; // sobrescreveu o default method!
    }

    @Override
    public void send(String message) {
        System.out.println("SMS enviado: " + format(message)); // format() já faz maiúsculo
    }

}
