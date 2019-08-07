/*Programador: Caroline
 * Data: 09/03/2017
 * Objetivo: Tabuada 
 */
import javax.swing.JOptionPane;

public class ExModularizado37 {

    static Integer numero, contador;

    public static void main(String args[]) {
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor entre 1 e 10"));
        Calculo37();
    }

    static void Calculo37() {

        //JOptionPane.showMessageDialog(null,"Tabuada de " + num + " é :");
        System.out.println("Tabuada de " + numero + " é :");

        for (contador = 1; contador <= 10; contador++) //JOptionPane.showMessageDialog(null,num+"x"+res+": "+(num*res));
        {
            System.out.println(numero + "x" + contador + ": " + (numero * contador));
        }
    }
}
