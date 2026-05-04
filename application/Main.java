package application;

import entities.Rooms;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("HOW MANY ROOMS WILL BE RENTED? ");
        n = sc.nextInt();
        Rooms[] rooms = new Rooms[10];



        for(int i = 0; i < n; i++){
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: " );
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            Rooms quarto = new Rooms(name, email, room);
            rooms[room] = quarto;
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i] != null){
                System.out.println(rooms[i]);
            }
        }

        sc.close();

    }




}
