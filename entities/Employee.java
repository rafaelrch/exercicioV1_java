package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    public double newSalary;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        double increase = grossSalary * percentage/100;
        this.newSalary = grossSalary + increase;

    }

    public String toString(){
        return "Employee: " + name + ", $" +  String.format("%.2f", netSalary());
    }

}
