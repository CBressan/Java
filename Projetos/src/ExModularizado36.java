/*Programador: Caroline
 * Data: 09/03/2017
 * Objetivo: Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N
 */
import javax.swing.JOptionPane;

public class ExModularizado36 {

    static Integer numero = 0;

    public static void main(String args[]) {
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        Calculo36();
    }

    static void Calculo36() {
        while (numero
                < 100) {
            numero = (numero + 1);
            System.out.println("O número é: 1/" + numero);
        }
    }
}
