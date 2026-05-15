package entities;

public class NoDiscount implements  DiscountService{

    public NoDiscount() {
    }

    @Override
    public double discount(double amount) {
        return amount;
    }
}
