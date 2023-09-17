// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//import javax.swing.plaf.synth.SynthInternalFrameUI;
package Java_Lab_1;
import java.util.Scanner;
public class Task1 {
    private final int n1;
    private final int n2;
    private final char operator;

   public Task1(int n1, int n2, char operator) {
       this.n1 = n1;
       this.n2 = n2;
       this.operator = operator;
   }
    public void calculate() {

        switch (operator) {
            case '+':
                System.out.print(n1 + n2);
                break;
            case '-':
                System.out.print(n1 - n2);
               break;
            case '*':
                System.out.print(n1 * n2);
              break;
            case '/':
                if (n2 == 0) {
                    System.out.println(" You can't divide by zero!");
                } else {
                    System.out.print(n1 / n2);
                }
              break;
            default:
                System.out.println(" You entered the wrong operator!");
        }
    }
}