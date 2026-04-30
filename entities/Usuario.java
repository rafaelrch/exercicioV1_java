package entities;

public class Usuario {

    private String nome;
    private int numConta;
    private double saldo;
    public double dinheiroDepositado;
    public double dinheiroSacado;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDinheiroDepositado(){
        return dinheiroDepositado;
    }

    public void setDinheiroDepositado(double dinheiroDepositado) {
        this.dinheiroDepositado = dinheiroDepositado;
    }

    public double getDinheiroSacado(){
        return dinheiroSacado;
    }

    public void setDinheiroSacado(double dinheiroSacado) {
        this.dinheiroSacado = dinheiroSacado;
    }

    public void depositar(double dinheiroDepositado){
        saldo += dinheiroDepositado;
    }

    public double sacar(double dinheiroSacado){
        int taxa = 5;

        if(saldo < 0){
            System.out.println("Saldo negativo, impossível realizar saque!");
        }else {
            saldo -= dinheiroSacado;
        }
        return saldo -= taxa;
    }

    public String toString() {
        return "Account "
                + getNumConta()
                + ", Holder: "
                + getNome()
                + ", Balance: $"
                + String.format("%.2f", getSaldo() );
    }
}
