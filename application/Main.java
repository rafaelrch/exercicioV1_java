package application;


import entities.Account;
import exceptions.DomainException;

import java.text.ParseException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Whithdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try{
            account.withDraw(amount);
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}