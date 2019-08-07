
public class Livros {

    int quantidadeemprestimos;
    int anodolivro;
    String autor;
    String titulo;

    Livros() {
        this(0,0,"","");
    }

    public Livros(int qtd, int ano, String tit, String aut) {
        anodolivro = ano;
        quantidadeemprestimos = qtd;
        autor = aut;
        titulo = tit;
    }
}
