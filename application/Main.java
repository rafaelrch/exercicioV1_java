package application;

import entities.Usuario;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();
        String initialDeposit;
        double sacado;


        System.out.print("Enter account number: ");
        user.setNumConta(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter account holder: ");
        user.setNome(sc.nextLine());
        System.out.print("Is there na initial deposit (y/n)? ");
        initialDeposit = sc.nextLine();
        System.out.println(" ");

        if (initialDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            user.depositar(sc.nextDouble());
        }

        System.out.println("Account data: ");
        System.out.println(user.toString());

        System.out.print("Enter a deposit value: ");
        user.depositar(sc.nextDouble());

        System.out.println(" ");
        System.out.println("Updated account data:");
        System.out.println(user.toString());

        System.out.println(" ");
        System.out.print("Enter a withdraw value: ");
        sacado = sc.nextDouble();
        user.sacar(sacado);
        System.out.println(user.toString());


        sc.close();

    }




}
