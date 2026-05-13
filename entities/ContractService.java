package entities;
import entities.OnlinePaymentService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ContractService {

    private OnlinePaymentService service = new PaypalService();
    List<Installment> installments = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ContractService() {
    }

    public void processContract(Contract contract, Integer months){

        if(months <= 0){
            return;
        }else {
            double installmentValue = contract.getTotalValue() / months;
            System.out.println("Installment Value: " + installmentValue);
            for (int i = 1; i <= months; i++){
                Date date = contract.getDate();

                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                cal.add(Calendar.MONTH, i);


                double result = service.interest(installmentValue, i);
                double result2 = service.paymentFee(result);

                installments.add(new Installment(cal.getTime(), result2));

            }
        }
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public String toString() {
        for (Installment i : installments){
            System.out.println(sdf.format(i.getDueDate()) + " - " + i.getAmount());
        }
        return "";
    }
}
