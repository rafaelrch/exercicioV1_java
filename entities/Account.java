package entities;

public class Account {

    private String nome;
    private int numConta;
    private double saldo;

    /*
    public double dinheiroDepositado;
    public double dinheiroSacado; */



    public Account(int numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
    }

    public Account(int numConta, String nome, double initialDeposit){
        this.numConta = numConta;
        this.nome = nome;
        depositar(initialDeposit);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void depositar(double amount){
        saldo += amount;
    }

    public void sacar(double amount){
        saldo -= amount + 5.0;
    }



    /*    public void depositar(double dinheiroDepositado){
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
    }*/

    public String toString() {
        return "Account "
                + getNumConta()
                + ", Holder: "
                + getNome()
                + ", Balance: $"
                + String.format("%.2f", getSaldo() );
    }
}
