package entities;

public class PessoaJuridica extends Contibuinte{
    private Integer nFuncionarios;

    public Integer getnFuncionarios() {
        return nFuncionarios;
    }

    public void setnFuncionarios(Integer nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
        super(nome, rendaAnual);
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public double pagarImposto() {
        double imposto = getRendaAnual() * 0.16;
        if(nFuncionarios > 10){
            return imposto = getRendaAnual() * 0.14;
        }
        return imposto;
    }
}
