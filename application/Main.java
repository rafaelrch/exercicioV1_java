package application;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String path = "/Users/rafaelrocha/Documents/PROJETOS/testes-java/exercicio 1/application/in.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }



            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> emailsUp = list.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(p -> p.getEmail())
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
            emailsUp.forEach(System.out::println);

            double soma = list.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, Double::sum);


            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", soma));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}