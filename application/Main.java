package application;

import entities.Pessoa;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double soma, media, percentualMenors;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];

        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:" );
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();


            sc.nextLine();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);

        }

        soma = 0;
        nmenores = 0;
        for (int i = 0; i < n; i++){
            if (pessoas[i].getIdade() < 16){
                nmenores++;
            }
            soma += pessoas[i].getAltura();
        }

        media = soma / n;

        percentualMenors = ((double)nmenores / n) * 100.0;

        System.out.printf("Altura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenors);
        System.out.println("Pessoas com menos de 16 anos: ");

        for (int i = 0; i < n; i++){
            if(pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }



        sc.close();

    }




}
