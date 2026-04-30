package entities;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public void situacao(double nota){
        if(nota >= 7){
            System.out.println("APROVADO");
        }else if(nota >= 5 && nota < 7){
            System.out.println("RECUPERAÇÃO");
        }else{
            System.out.println("REPROVADO");
        }

    }


}
