package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankSlip implements PaymentMethod{
    private LocalDate dueDate;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public BankSlip(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public double pay(double amount) {
        return amount + (2/100);
    }

    @Override
    public String getName() {

        return "Boleto vence: " + fmt.format(dueDate);
    }


}
