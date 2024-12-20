import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the input
        System.out.print("Enter the number you want to check : ");
        int inputNum = sc.nextInt();//storing in the variable inputNum

        int sum = sumOfNaturalNumber(inputNum);//Call the mehtod and storing it into the variable
        System.out.println("the sum of " + inputNum + " natural numbers is : " + sum);
    }

    public static int sumOfNaturalNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {//num will be the range of the loop
            sum = sum + i;
        }
        return sum;
    }
}
