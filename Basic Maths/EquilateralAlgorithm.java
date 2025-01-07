import java.util.Scanner;

public class EquilateralAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number : ");
        int secondNum = sc.nextInt();

        int resultGCD = findGCDByEquilaterlAlgo(firstNum, secondNum);
        System.out.println("the GCD of " + firstNum + " and  " + secondNum + " is : " + resultGCD);
    }

    public static int findGCDByEquilaterlAlgo(int num1, int num2) {
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;// this will give the reminder which will be the gcd
            } else {
                num2 = num2 % num1;// this will give the reminder which will be the gcd
            }
        }
        if (num1 == 0) {
            return num2;
        } else {
            return num1;
        }
    }
}

//TC . =
//O(log to the base smallest number(min(num1, num2)))