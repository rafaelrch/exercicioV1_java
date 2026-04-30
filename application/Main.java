package application;

import entities.Livro;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Livro livro1, livro2;
        livro1 = new Livro();
        livro2 = new Livro("Sapiens", "Rafael Rocha", 438);

        System.out.println(livro1);
        System.out.println(livro2);

        sc.close();

    }




}
