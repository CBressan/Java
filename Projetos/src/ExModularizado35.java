/*Programador: Caroline
 * Data: 09/03/2017
 * Objetivo: Fatorial de um número
 */

import javax.swing.JOptionPane;

public class ExModularizado35 {

    static Integer n, i, x = 1;

    public static void main(String args[]) {
        CalculoFatorial();
    }

    static void CalculoFatorial() {

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        for (i = 1; i <= n; i++) {
            x = (x * i);
        }
        JOptionPane.showMessageDialog(null, "Resultado= " + x);
    }
}
