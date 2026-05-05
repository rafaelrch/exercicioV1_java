package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("How many employees will be registered? ");
        n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();

        List<Employee> result = employeeList.stream().filter(x -> x.getId() == idIncrease).collect(Collectors.toList());

        if(result.isEmpty()){
            System.out.println("This id does not exist!");
        }else{
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            for(Employee x : result){
                x.setSalary(x.getSalary() + x.getSalary() * percentage / 100);
            }
        }

        System.out.println("List of employees:");
        System.out.println(employeeList);


        sc.close();

    }




}
