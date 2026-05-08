package application;

import entities.Animal;
import entities.Cachorro;
import entities.Gato;
import entities.Passaro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Animal> list = new ArrayList<>();

        Animal a1 = new Cachorro("Michael");
        list.add(a1);

        Animal a2 = new Gato("Malte");
        list.add(a2);

        Animal a3 = new Passaro("Bento");
        list.add(a3);

        for (Animal x : list){
            System.out.println(x.getNome() + " | Som: " + x.emitirSom());
        }


        sc.close();


    }
}