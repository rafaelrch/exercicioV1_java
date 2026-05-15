package entities;

public interface Notificable {

    void send(String message);
    default String format(String message){
        return "[" + message + "]";
    }

}
