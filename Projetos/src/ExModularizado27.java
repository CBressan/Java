/*Programador: Caroline
 * Data: 02/03/2017
 * Objetivo: Velocidade média em km/h
 */

import javax.swing.JOptionPane;

public class ExModularizado27 {

    static Double voltas, extensãocircuito, tempoDuracao, velocidademedia;

    public static void main(String args[]) {
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas"));
        extensãocircuito = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros"));
        tempoDuracao = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração em minutos"));
        CalculoKm();
    }

    static void CalculoKm() {

        velocidademedia = (voltas * extensãocircuito / tempoDuracao);
        velocidademedia = (velocidademedia * 3.6);
        {
            JOptionPane.showMessageDialog(null, "Resultado= " + velocidademedia);
        }
    }
}
