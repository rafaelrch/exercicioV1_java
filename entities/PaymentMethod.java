package entities;

public interface PaymentMethod {
    double pay(double amount);
    String getName();

    default void printReceipt(double amount){
        System.out.printf("Pagamento de R$ %.2f via %s%n", pay(amount), getName());
    }
}
