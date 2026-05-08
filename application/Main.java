package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n; i++){
            System.out.println("Product #" + i + " data:");
            sc.nextLine();
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);

            if (ch == 'i'){
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                Product p = new ImportedProduct(name, price, customsFee);
                list.add(p);
            } else if (ch == 'u') {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));

            }else{
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                Product p = new Product(name, price);
                list.add(p);
            }

        }

        System.out.println("PRICE TAGS:");
        for (Product p : list){
            System.out.println(p.priceTag());
        }


        sc.close();


    }
}