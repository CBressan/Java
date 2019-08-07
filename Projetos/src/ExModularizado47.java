/*Programador: Caroline
 * Data: 09/03/2017
 * Objetivo: Ex47
 */
import javax.swing.JOptionPane;

public class ExModularizado47 {

    static Double Expoente, Base, Potencia;

    public static void main(String args[]) {

        Base = Double.parseDouble(JOptionPane.showInputDialog("Digite o número da base"));
        Expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o número do expoente"));
        Calculo47();
    }

    static void Calculo47() {

        Potencia = Math.pow(Base, Expoente);
        JOptionPane.showMessageDialog(null, "Resultado= " + Potencia);
    }
}
