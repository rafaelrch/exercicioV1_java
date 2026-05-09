package entities;


public abstract class Contibuinte {
    private String nome;
    private Double rendaAnual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public Contibuinte(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public abstract double pagarImposto();

    @Override
    public String toString() {
        return nome + ": $" + pagarImposto();
    }
}


