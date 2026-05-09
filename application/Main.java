package application;


import entities.Contibuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        List<Contibuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or campany (i/c)? ");
            sc.nextLine();
            char ch =sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double valorSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, valorSaude));
            }else {
                System.out.print("Number of employees: ");
                int nFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, nFuncionarios));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double impostoArrecadado = 0;
        for (Contibuinte cont : list){
            System.out.println(cont);
            impostoArrecadado += cont.pagarImposto();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $" + impostoArrecadado);

        sc.close();


    }
}