package application;


import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros vc vai digitar?");
        n = sc.nextInt();

        double[] numeros = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            double numAdd = sc.nextDouble();
            numeros[i] = numAdd;
        }

        System.out.print("VALORES = " );
        for(int i = 0; i < n; i++){
            System.out.print(" " + numeros[i]);
        }

        sc.nextLine();
        System.out.println("SOMA = " );
        double soma = 0;
        for(int i = 0; i < n; i++){
            soma += numeros[i];
        }


        System.out.println(soma);

        double media = soma / n;
        System.out.print("MEDIA = " + media);


        sc.close();

    }




}
