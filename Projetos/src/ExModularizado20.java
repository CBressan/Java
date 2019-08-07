/*Programador: Caroline
 * Data: 23/02/2017
 * Objetivo: Existência de raizes reais
 */

import javax.swing.JOptionPane;

public class ExModularizado20 {
    static Double a, b, c, x1, x2, delta ; 
    public static void main(String args[]) {
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c"));
        CalculoRaiz();
    }
    
    static void CalculoRaiz()
    {
        
        delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Não possui raiz real");
        } else {
            if (a == 0);
            JOptionPane.showMessageDialog(null, "Não é equação de segundo grau");
            if (delta == 0) ;
            JOptionPane.showMessageDialog(null, "Há apenas uma raiz real");
            x1 = (-b + Math.sqrt(delta) / (2 * a));
            x2 = (-b - Math.sqrt(delta) / (2 * a));

        }
    }
}
