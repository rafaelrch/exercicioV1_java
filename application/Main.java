package application;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, posicao;
        double maiorValor;

        System.out.print("Quantos numeros voce vai digitas? ");
        n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        maiorValor = 0;
        posicao = 0;
        for (int i = 0; i < n; i++){
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
                posicao = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
        sc.close();

    }




}
