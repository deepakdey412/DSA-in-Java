import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the input
        System.out.print("Enter the number you want to make the table of it :");
        int inputNum = sc.nextInt();//storing in the variable inputNum

        printMultiple(inputNum);//Mehtod Calling (here it not returning the value)
    }

    public static void printMultiple(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
