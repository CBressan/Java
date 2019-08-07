/*Programador: Caroline
 * Data: 09/02/2017
 * Objetivo: Salário a receber
 */

import javax.swing.JOptionPane;

public class ExModularizado16 {

    static Double horastrabalhadas, valorporhora, percentualdedesconto, numerodesconto, salarioliquido, salariobruto, salarioreceber;

    public static void main(String args[]) {

        horastrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas"));
        valorporhora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
        percentualdedesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));
        numerodesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de descendentes"));
        CalculoSalario();
    }

    static void CalculoSalario() {
        salariobruto = (horastrabalhadas * valorporhora);
        salarioliquido = (salariobruto - percentualdedesconto);
        salarioreceber = salarioliquido + (numerodesconto * 100);
        {
            JOptionPane.showMessageDialog(null, "Salário a receber = " + salarioreceber);
        }
    }
}
