package entities;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome + ", preco: R$" + preco + ", Estoque: " + estoque + " unidades");
    }

}
