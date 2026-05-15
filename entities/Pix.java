package entities;

public class Pix implements PaymentMethod{

    private String pixKey;

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    public Pix(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public double pay(double amount) {

        return amount;
    }

    @Override
    public String getName() {

        return "Pix: " + this.pixKey;
    }
}
