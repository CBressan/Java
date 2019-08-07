/*Programador: Caroline
 * Data: 02/03/2017
 * Objetivo: Verificar se um número se um número é multiplo do menor 
 */

import javax.swing.JOptionPane;

public class ExModularizado26 {

    static Integer n1, n2, resto;

    public static void main(String args[]) {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
        Calculo26();
    }

    static void Calculo26() {

        if (n1 > n2) {
            resto = (n1 % n2);
        } else {
            resto = (n2 % n1);
        }
        if (resto == 0) {
            JOptionPane.showMessageDialog(null, "É multiplo");
        } else {
            JOptionPane.showMessageDialog(null, "Não é multiplo");
        }
    }
}
