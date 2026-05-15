package application;


import entities.*;

import java.text.ParseException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        Product p1 = new Product("Macbook", 9900.00);
        Product p2 = new Product("TV", 4000.45);
        Product p3 = new Product("Iphone 17", 5000.30);
        Product p4 = new Product("Microondas", 2400.00);
        Product p5 = new Product("Ventildador", 100.00);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);



        Collections.sort(list);
        for (Product p : list){
            System.out.println(p);
        }


        sc.close();
    }
}