/*Programador: Caroline
 * Data: 23/02/2017
 * Objetivo: Maior número entre dois valores
 */

import javax.swing.JOptionPane;

public class ExModularizado19 {
    static Integer n1, n2 ;
    public static void main(String args[]) {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        CalculoMaior();
    }
    
    static void CalculoMaior()
    {
        
        if (n1 >= n2) {
            JOptionPane.showMessageDialog(null, "Resultado = " + n1);
        } else {
            JOptionPane.showMessageDialog(null, "Resultado = " + n2);
        }
    }
}
