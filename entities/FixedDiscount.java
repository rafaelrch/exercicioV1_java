package entities;

public class FixedDiscount implements DiscountService{
    private Double fixedValue;

    public Double getFixedValue() {
        return fixedValue;
    }

    public void setFixedValue(Double fixedValue) {
        this.fixedValue = fixedValue;
    }

    public FixedDiscount(Double fixedValue) {
        this.fixedValue = fixedValue;
    }

    @Override
    public double discount(double amount) {
        return amount - fixedValue;
    }
}
