package application;


import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String date = sc.next();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many items to this order? ");
        int qntdItems = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), status, new Client(name, email, sdf.parse(date)));

        for (int i = 1; i <= qntdItems; i ++){
            sc.nextLine();
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String nameP = sc.nextLine();
            System.out.print("Product price: ");
            double priceP = sc.nextDouble();
            System.out.print("Quantity: ");
            int qntd = sc.nextInt();

            OrderItem item = new OrderItem(qntd, priceP, new Product(nameP, priceP));
            order.addItem(item);
        }

        System.out.println();
        System.out.println(order);


        sc.close();
    }
}