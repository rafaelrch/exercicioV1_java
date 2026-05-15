package application;

import entities.BankSlip;
import entities.CreditCard;
import entities.Order;
import entities.Pix;

import java.text.ParseException;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        List<Order> list = new ArrayList<>();

        Order order1 = new Order(1111, 1000.0, new CreditCard(9999));
        Order order2 = new Order(2222, 2000.0, new Pix("rafael@gmail.com"));
        Order order3 = new Order(3333, 3000.0, new BankSlip(LocalDate.of(2024, 12, 20)));
        Order order4 = new Order(3333, 4000.0, new CreditCard(8888));


        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);

        Collections.sort(list);

        for (Order o : list){
            o.getPaymentMethod().printReceipt(o.getTotal());
        }


        sc.close();
    }
}