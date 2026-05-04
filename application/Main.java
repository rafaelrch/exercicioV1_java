package application;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos elementos vai ter cada vetor? ");
        n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < n; i++){
            soma += vetor[i];
        }

        media = soma / n;

        System.out.println("MEIDA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < n; i++){
            if(vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }





        sc.close();

    }




}
