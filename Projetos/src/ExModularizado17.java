/*Programador: Caroline
 * Data: 09/02/2017
 * Objetivo: Quantidade de litros gastos em uma viagem 
 */

import javax.swing.JOptionPane;

public class ExModularizado17 {

    static Double tempopercurso, velocidadeMedia, quantidadelitros;

    public static void main(String args[]) {
        tempopercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso"));
        velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media"));
       CalculoLitros();
    }

    static void CalculoLitros() {
        quantidadelitros = (velocidadeMedia * tempopercurso / 12);

        {
            JOptionPane.showMessageDialog(null, "Litros gastos = " + quantidadelitros);
        }
    }
}
