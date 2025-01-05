import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        countDigits(inputNum);
    }

    public static void countDigits(int num) {
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            if(rem!=0){//Print only non-zero digits
            System.out.print(rem);
            }
            num = num / 10;
        }

    }
}


