import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the input
        System.out.print("Enter the number you want to check : ");
        int inputNum = sc.nextInt();//storing in the variable inputNum

        boolean result = checkEvenOrOdd(inputNum);//Method calling and storing the return value in the result variable

        //Checking the result value
        if (result) {
            System.out.println("The input number " + inputNum + " is even.");
        } else {
            System.out.println("The input number " + inputNum + " is odd.");
        }
    }

    //Function to check even or odd
    public static boolean checkEvenOrOdd(int num) {
        boolean flag = false;
        if (num % 2 == 0) {
            flag = true;
            return flag;
        }
        return flag;
    }
}
