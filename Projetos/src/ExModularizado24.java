/*Programador: Caroline
 * Data: 02/03/2017
 * Objetivo: Verificar se valor é dividido por 2 e 3
 */

import javax.swing.JOptionPane;

public class ExModularizado24 {
    static Integer n1, resto1, resto2 ;
    public static void main(String args[]) {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o menor valor"));
        CalculoResto();
    }
    
    static void CalculoResto()
    {
        
        resto1 = (n1 % 2);
        resto2 = (n1 % 3);
        if ((resto1 == 0) && (resto2 == 0)) {
            JOptionPane.showMessageDialog(null, "É divisível");
        } else {
            JOptionPane.showMessageDialog(null, "Não é divisível");
        }
    }
}
