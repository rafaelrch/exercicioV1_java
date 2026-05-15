package entities;

public class PercentageDiscount implements DiscountService{

    private Double percentage;

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public PercentageDiscount(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double discount(double amount) {
        return amount * (1 - percentage/100);
    }
}
