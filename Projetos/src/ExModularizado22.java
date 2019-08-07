/*Programador: Caroline
 * Data: 02/03/2017
 * Objetivo: Ordem crescente entre dois números
 */

import javax.swing.JOptionPane;

public class ExModularizado22 {

    static Integer n1, n2;

    public static void main(String args[]) {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        CalculoCresc();
    }

    static void CalculoCresc() {
        if (n1 <= n2) {
            JOptionPane.showMessageDialog(null, "Resultado = \n" + n1 + "\n" + n2);
        } else {
            JOptionPane.showMessageDialog(null, "Resultado = \n" + n2 + "\n+1");
        }
    }
}
