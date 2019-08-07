/*Programador: Caroline
 * Data: 02/03/2017
 * Objetivo: Valor corrigido em 30 dias 
 */

import javax.swing.JOptionPane;

public class ExModularizado29 {

    static Double investimento, valorinvestimento, valorfinal;

    public static void main(String args[]) {
        investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite 1 se poupança, e 2 se renda fixa"));
        valorinvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));
        CalculoInvestimento();
    }

    static void CalculoInvestimento() {
        if (investimento
                == 1) {
            valorfinal = (valorinvestimento * 0.03);
        } else if (investimento
                == 2) {
            valorfinal = (valorinvestimento * 0.05);
        }

        {
            JOptionPane.showMessageDialog(null, "Resultado= " + valorfinal + investimento);
        }
    }
}
