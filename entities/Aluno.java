package entities;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0.0;
    }

    public Aluno(String nome, int matricula, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public void situacao(){
        if(this.nota >= 7){
            System.out.println("APROVADO");
        }else if(this.nota >= 5 && this.nota < 7){
            System.out.println("RECUPERAÇÃO");
        }else{
            System.out.println("REPROVADO");
        }

    }


}
