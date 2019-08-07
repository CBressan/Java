
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws IOException {
        int opc = 0;
        Livros2017 l = new Livros2017();
        Livros[] l1 = new Livros[500];
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1- para cadastrar \n 2-para o menor valor \n 3-para o maior valor \n 4- para a média "));
            switch (opc) {
                case 1:

                    l.FCadastro(l1);
                    break;
                case 2:

                    JOptionPane.showMessageDialog(null, l.menosVendido(l1));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, l.maisVendido(l1));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, l.media(l1));
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }

    }
}
