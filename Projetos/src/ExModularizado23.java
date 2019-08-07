/*Programador: Caroline
 * Data: 02/03/2017
 * Objetivo: Quatro números em ordem crescente
 */

import javax.swing.JOptionPane;

public class ExModularizado23 {

    static Integer n1, n2, n3, n4;

    public static void main(String args[]) {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o menor valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo menor valor"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro menor valor"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor valor"));
        CalculoOrdem();
    }

    static void CalculoOrdem() {

        if (n3 < n4) {
            JOptionPane.showMessageDialog(null, "Resultado= \n" + n1 + "\n" + n2 + "\n" + n3 + "\n" + n4);
        } else if (n4 > n2) {
            JOptionPane.showMessageDialog(null, "Resultado= \n" + n1 + "\n" + n2 + "\n" + n4 + "\n" + n3);
        } else if (n4 > n1) {
            JOptionPane.showMessageDialog(null, "Resultado= \n" + n1 + "\n" + n4 + "\n" + n2 + "\n" + n3);
        } else {
            JOptionPane.showMessageDialog(null, "Resultado= \n" + n4 + "\n" + n1 + "\n" + n2 + "\n" + n3);

        }

    }
}
