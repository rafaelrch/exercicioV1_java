package application;


import entities.Contract;
import entities.ContractService;
import entities.Installment;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int num = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();

        Contract contrato = new Contract(num, date, valor);
        ContractService service = new ContractService();

        service.processContract(contrato, parcelas);

        System.out.println();
        System.out.println("PARCELAS: ");
        System.out.println(service);



        sc.close();
    }
}