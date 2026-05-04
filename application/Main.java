package application;

import entities.Pessoa;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, maisVelha;
        String pessoaMaisVelha;

        maisVelha = 0;
        pessoaMaisVelha = " ";




        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            Pessoa pessoa = new Pessoa(nome, idade);
            pessoas[i] = pessoa;

            if(pessoas[i].getIdade() > maisVelha){
                maisVelha = pessoas[i].getIdade();
                pessoaMaisVelha = pessoas[i].getNome();
            }

        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);


        sc.close();

    }




}
