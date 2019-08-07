/*Programador: Caroline
 * Data: 02/03/2017
 * Objetivo: Novo preço de um produto
 */

import javax.swing.JOptionPane;

public class ExModularizado28 {

    static Double precoAtual, mediaMensal, precoNovo;

    public static void main(String args[]) {
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual"));
        mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal"));
        CalculoNovo();
    }

    static void CalculoNovo() {

        if ((mediaMensal < 500) && (precoAtual < 30)) {
            precoNovo = (precoAtual * 1.10);
        } else if ((mediaMensal >= 500) && (mediaMensal < 1000) && (precoAtual >= 30) && (precoAtual < 80)) {
            precoNovo = (precoAtual * 1.15);
        } else if ((mediaMensal >= 1000) && (precoAtual >= 80)) {
            precoNovo = (precoAtual * 0.05);
        } else {
            precoNovo = precoAtual;
        }
        {
            JOptionPane.showMessageDialog(null, "Preço atual= " + precoAtual);
        }
    }
}
