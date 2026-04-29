package application;

import entities.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Name: ");
        aluno.name = sc.nextLine();

        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno.notaFinal());




        sc.close();

    }




}
