package application;

import entities.Course;

import java.text.ParseException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);


       Set<Integer> a = new HashSet<>();
       Set<Integer> b = new HashSet<>();
       Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int nStudents = sc.nextInt();
        for (int i = 0; i < nStudents; i++){
            int id = sc.nextInt();
            a.add(id);
        }

        System.out.print("How many students for course B? ");
        int nStudents2 = sc.nextInt();
        for (int i = 0; i < nStudents2; i++){
            int id = sc.nextInt();
            b.add(id);
        }

        System.out.print("How many students for course C? ");
        int nStudents3 = sc.nextInt();
        for (int i = 0; i < nStudents3; i++){
            int id = sc.nextInt();
            c.add(id);
        }

        Set<Integer> set = new HashSet<>(a);
        set.addAll(b);
        set.addAll(c);

        System.out.println("Total students: " + set.size());
        sc.close();
    }
}