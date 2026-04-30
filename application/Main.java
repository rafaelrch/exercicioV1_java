package application;

import entities.Account;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Account user;
        String response;
        double sacado;


        System.out.print("Enter account number: ");
        int numConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String nome = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        response = sc.nextLine();
        System.out.println(" ");

        if (response.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            user = new Account(numConta, nome, initialDeposit);
        }else{
            user = new Account(numConta, nome);
        }

        System.out.println("Account data: ");
        System.out.println(user);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        user.depositar(depositValue);

        System.out.println(" ");
        System.out.println("Updated account data:");
        System.out.println(user);

        System.out.println(" ");
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        user.sacar(withdrawValue);

        System.out.println(user);


        sc.close();

    }




}
