/*Programador: Caroline
 * Data: 23/02/2017
 * Objetivo: diferenca entre dois valores
 */

import javax.swing.JOptionPane;

public class ExModularizado18 {
    static Integer n1, n2, diferenca; 
    public static void main(String args[]) {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        CalculoDiferenca();
    }
    
    static void CalculoDiferenca() 
    {
                
        if (n1 >= n2) {
            diferenca = (n1 - n2);
        } else {
            diferenca = (n2 - n1);
        }
        {
            JOptionPane.showMessageDialog(null, "diferenca = " + diferenca);
        }
    }
}
