package entities;

public class PaypalService implements OnlinePaymentService{

    public double paymentFee(Double amount){
        double calc = amount * 0.02;
        double total = amount + calc;
        return total;
    }

    public double interest(Double amount, Integer months){
        double calc = amount * 0.01;
        double total = amount + (calc * months);
        return total;
    }
}
