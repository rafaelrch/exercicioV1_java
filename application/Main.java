package application;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, qntdPares, resto;

        System.out.print("Quantos numeros voce vai digitas? ");
        n = sc.nextInt();
        int[] numInteiros = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            numInteiros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");

        qntdPares = 0;
        for (int i = 0; i < n; i++){
            resto = numInteiros[i] % 2;
            if(resto == 0){
                System.out.print(numInteiros[i] + "  ");
                qntdPares++;
            }
        }

        sc.nextLine();
        System.out.println("QUANTIDADE DE PARES = " + qntdPares);


        sc.close();

    }




}
