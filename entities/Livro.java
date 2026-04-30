package entities;

public class Livro {
    private String titulo;
    private String autor;
    private int numPagina;

    public Livro(){
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
    }

    public Livro(String titulo, String autor, int numPagina){
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro " +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPagina=" + numPagina +
                ' ';
    }
}
