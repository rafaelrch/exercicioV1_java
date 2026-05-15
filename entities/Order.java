package entities;

public class Order implements Comparable<Order>{
    private Integer id;
    private Double total;
    private PaymentMethod paymentMethod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Order(Integer id, Double total, PaymentMethod paymentMethod) {
        this.id = id;
        this.total = total;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public int compareTo(Order o) {
        return o.total.compareTo(this.total);
    }
}
