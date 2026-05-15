package application;

import entities.Cart;
import entities.FixedDiscount;
import entities.NoDiscount;
import entities.PercentageDiscount;

import java.text.ParseException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        Cart c1 = new Cart(new PercentageDiscount(10.0));
        c1.add(100.0);
        c1.add(50.0);

        Cart c2 = new Cart(new FixedDiscount(30.0));
        c2.add(100.0);
        c2.add(50.0);

        Cart c3 = new Cart(new NoDiscount());
        c3.add(100.0);
        c3.add(50.0);

        System.out.println("Total com 10% de desconto: " + c1.total());
        System.out.println("Total com R$30 de desconto: " + c2.total());
        System.out.println("Total sem desconto: " + c3.total());

        sc.close();
    }
}