/*Programador: Caroline
 * Data: 09/03/2017
 * Objetivo: Pegar 2 números e calcular os impares entre eles
 */

import javax.swing.JOptionPane;

public class ExModularizado38 {

    static Integer Num1, Num2, Contador = 0, MaiorNum, MenorNum;

    public static void main(String args[]) {
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1º valor:"));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2º valor:"));
        Calculo38();
    }

    static void Calculo38() {
        if (Num1 > Num2) {
            MaiorNum = Num1;
            MenorNum = Num2;
        } else {
            MaiorNum = Num2;
            MenorNum = Num1;
        }

        while (MenorNum < MaiorNum) {
            if (MenorNum % 2 == 1) {
                Contador = Contador + MenorNum;
            } else {
            }
            MenorNum++;
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + Contador);
    }
}
