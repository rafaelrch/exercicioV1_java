package application;

import entities.Aluno;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Aluno aluno1, aluno2, aluno3;

        aluno1 = new Aluno("Rafael", 1111);
        aluno2 = new Aluno("Maria" , 2222 , 9);
        aluno3 = new Aluno("Marcelo", 3333, 6);

        aluno1.situacao(0);
        aluno2.situacao(9);
        aluno3.situacao(6);
        sc.close();

    }




}
