import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        int totalNumOfDigits = countDigits(inputNum);
        System.out.println("Number of digits are  : "+totalNumOfDigits);
    }
    public static int countDigits(int num){
        int count =0;
        while (num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
//Time Complexity : O(log10(N))