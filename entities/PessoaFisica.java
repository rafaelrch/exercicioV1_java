package entities;


public class PessoaFisica extends Contibuinte{

    private Double gastosSaude;

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double pagarImposto(){
        double imposto = 0;
        if(getRendaAnual() < 20000 && gastosSaude == 0){
            return imposto = getRendaAnual() * 0.15;
        } else if (getRendaAnual() > 20000 && gastosSaude == 0) {
            return imposto = getRendaAnual() * 0.25;
        } else if (getRendaAnual() >= 20000 && gastosSaude > 0) {
            return imposto = (getRendaAnual() * 0.25) - (gastosSaude * 0.50);
        }
        return imposto;
    }
}
