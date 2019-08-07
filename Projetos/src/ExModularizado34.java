/*Programador: Caroline
 * Data: 09/03/2017
 * Objetivo: Quadrado entre 10 e 150 
 */

public class ExModularizado34 {

    static Integer r = 0, i = 10;

    public static void main(String args[]) {
        CalculoQuadrado();
    }

    static void CalculoQuadrado() {
        while (i <= 150) {
            r = (i * i);

            //JOptionPane.showMessageDialog(null, "Resultado= " +r);
            System.out.println("Resultado= " + r);
            i = (i + 1);
        }

    }
}
