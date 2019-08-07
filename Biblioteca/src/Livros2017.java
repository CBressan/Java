import java.io.IOException;
import javax.swing.JOptionPane;

public class Livros2017 {

    public Livros[] FCadastro(Livros[] l) {
        for (int i = 0; i < 500; i++) {
            l[i] = new Livros();
        }
        for (int i = 0; i < 500; i++) {
            l[i].autor = JOptionPane.showInputDialog(null, "Insira o autor do livro");
            l[i].titulo = JOptionPane.showInputDialog(null, "Insira titulo do livro");
            l[i].quantidadeemprestimos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de livros emprestados"));
            l[i].anodolivro = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do livro"));
        }
        return l;
    }

    public int maisVendido(Livros[] l) throws IOException{ 
        int maior = 0;
        for (int i = 0; i < 500; i++) {
            if (i == 0) {
                maior = l[i].quantidadeemprestimos;
            } else if (l[i].quantidadeemprestimos > maior) {
                maior = l[i].quantidadeemprestimos;
            }
        }
        return maior;
    }

    public int menosVendido(Livros[] l) throws IOException{
        int menos = 0;
        for (int i = 0; i < 500; i++) {
            if (i == 0) {
                menos = l[i].quantidadeemprestimos;
            } else if (l[i].quantidadeemprestimos < menos) {
                menos = l[i].quantidadeemprestimos;
            }
        }
        return menos;
    }

    public int media(Livros[] l) {
        int media = 0;

        for (int i = 0; i < 500; i++) {
            media = media + l[i].quantidadeemprestimos;
        }
        media = media / 500;
        return media;

    }

}