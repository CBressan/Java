/*Programador: Caroline
 * Data: 23/02/2017
 * Objetivo: Média de um aluno
 */

import javax.swing.JOptionPane;

public class ExModularizado21 {
    static Double bimestre1, bimestre2, bimestre3, bimestre4;  
    public static void main(String args[]) {
        bimestre1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota:\n 1ºBimestre"));
        bimestre2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota:\n 2ºBimestre"));
        bimestre3 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota:\n 3ºBimestre"));
        bimestre4 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota:\n 4ºBimestre"));
        CalculoMedia();
    }
              
    static void CalculoMedia()
    {
        bimestre1 = ((bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4);
        if (bimestre1 < 3) {
            JOptionPane.showMessageDialog(null, "Média: " + bimestre1 + "\nAluno Retido");
        } else if (bimestre1 < 6) {
            JOptionPane.showMessageDialog(null, "Média: " + bimestre1 + "\nAluno de Exame");
        } else {
            JOptionPane.showMessageDialog(null, "Média: " + bimestre1 + "\nAluno Aprovado");
        }

    }
}
