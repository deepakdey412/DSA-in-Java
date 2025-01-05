import java.util.Scanner;

public class FirstPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputRowAndCol = sc.nextInt();
        printPattern(inputRowAndCol);

    }

    public static void printPattern(int num) {
        for (int i = 1; i <= num; i++) {//For Rows
            for (int j = 1; j <= num; j++) {// For coloum
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
