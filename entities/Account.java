package entities;


import exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withDraw(Double amount) throws DomainException{
        if(balance == 0 || balance < amount){
            throw new DomainException("Withdraw error: Not enough balance!");
        }else if(amount > getWithdrawLimit()){
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit!");
        }else {
            balance -= amount;
            System.out.println("New balance: " + String.format("%2.f", balance));
        }
    }
}
