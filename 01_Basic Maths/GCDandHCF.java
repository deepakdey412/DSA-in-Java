import java.util.Scanner;

public class GCDandHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number : ");
        int firstNum = sc.nextInt();
        System.out.print("Enter your second number : ");
        int secondNum = sc.nextInt();

        int resultGCD = findGCD(firstNum, secondNum);
        System.out.println("the GCD of " + firstNum + " , " + secondNum + " is : " + resultGCD);
    }

    public static int findGCD(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
//TC = O(min(num1,num2))
