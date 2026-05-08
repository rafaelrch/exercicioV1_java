package entities;

public class Passaro extends Animal{
    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom(){
        return "Piu";
    }
}
