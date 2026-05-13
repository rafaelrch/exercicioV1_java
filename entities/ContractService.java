package entities;
import entities.OnlinePaymentService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ContractService {

    private OnlinePaymentService service;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

    public void processContract(Contract contract, Integer months){
        if(months <= 0){
            return;
        }else {
            double installmentValue = contract.getTotalValue() / months;
            System.out.println();
            System.out.println("Installment Value: " + installmentValue);
            for (int i = 1; i <= months; i++){
                Date date = contract.getDate();

                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                cal.add(Calendar.MONTH, i);


                double interest = service.interest(installmentValue, i);
                double fee = service.paymentFee(installmentValue + interest);
                double quota = installmentValue + interest + fee;

                contract.getInstallments().add(new Installment(cal.getTime(), quota));

            }
        }
    }

}
