
import java.util.Scanner;

public class EightPattern {
    public static void printPattern(int n) {
        for (int i = 0; i <= n; i++) {
            //For space
            for (int p = 0; p <= i; p++) {
                System.out.print(" ");
            }
            //For Star
            for (int j = 1; j <= (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //For space
            for (int p = 0; p <= i; p++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        printPattern(inputNum);
    }
}

