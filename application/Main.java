package application;

import entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        rectangle.area();
        rectangle.perimeter();
        rectangle.diagonal();

        System.out.println(rectangle);


        sc.close();

    }




}
