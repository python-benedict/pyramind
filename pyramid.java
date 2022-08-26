/**
 * nested
 */
import java.util.Scanner;
public class pyramid {

    public static void main(String[] args) {

        
        while (true) {
            System.out.println("Enter the number of times you want in integer");
            Scanner num1 = new Scanner(System.in);
            int num = num1.nextInt();

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }
}