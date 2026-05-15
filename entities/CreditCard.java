package entities;

public class CreditCard implements PaymentMethod{

    private Integer cardNumber;

    public Integer getCardNumber() {

        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {

        this.cardNumber = cardNumber;
    }

    public CreditCard(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public double pay(double amount) {
        return amount + (0.03*100.0);
    }

    @Override
    public String getName() {
        return "Cartão: " + getCardNumber();
    }
}
