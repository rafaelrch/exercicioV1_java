package application;

import entities.Produto;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Produto produto1 = new Produto("Oculos de sol", 392.90);
        Produto produto2 = new Produto("PC", 9293.00, 2);

        produto1.exibirInfo();
        produto2.exibirInfo();

        sc.close();

    }




}
