import java.util.Scanner;

public class FindOppNumOfDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input number of which you want the opposite face number of dice : ");
        int inputNum = sc.nextInt();

        int oppFaceNum = findOppositeNum(inputNum);
        if (oppFaceNum > 0 && oppFaceNum <= 6) {
            System.out.println("the opposite number of the " + inputNum + " is " + oppFaceNum);
        } else {
            System.out.println("Enter the number between 1 to 6");
        }
    }

    public static int findOppositeNum(int num) {
        int oppNum = 0;
        if (num != 0 && num <= 6) {
            oppNum = 7 - num;
        } else {
            return -1;
        }
        return oppNum;
    }
}
