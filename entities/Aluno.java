package entities;

public class Aluno {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public String notaFinal(){
        double notaF = nota1 + nota2 + nota3;
        if(notaF >= 60.00){
            System.out.println("FINAL GRADE = " + String.format("%.2f", notaF));
            return "PASS";
        }else {
            double faltouNota = 60 - notaF;
            System.out.println("FINAL GRADE = " + String.format("%.2f", notaF));
            return "FAILED" + " MISSING " + String.format("%.2f", faltouNota) + " POINTS";
        }
    }
}
