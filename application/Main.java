package application;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, qntdPares;
        double soma, media, resto;


        resto = 0;
        qntdPares = 0;
        soma= 0;
        media = 0;

        System.out.print("Quantos elementos vai ter cada vetor? ");
        n = sc.nextInt();
        double[] vetor = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }



        for (int i = 0; i < n; i++){
            resto = vetor[i] % 2;

            if(resto == 0){
                qntdPares++;
                soma += vetor[i];
            }
        }

        media = soma / qntdPares;

        if(qntdPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else{
            System.out.println("MEDIA DOS PARES = " + media);
        }



        sc.close();

    }




}
