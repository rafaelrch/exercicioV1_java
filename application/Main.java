package application;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(func).collect(Collectors.toList());

        names.forEach(System.out::println);

       sc.close();
    }
}