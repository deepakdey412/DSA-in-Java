public class Palindrome {
    public static void main(String[] args) {
        int num = 12121;
        int reverseNum = findReverse(num);
        if (reverseNum == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static int findReverse(int num) {
        int rem = 0;
        int revNum = 0;
        while (num > 0) {
            rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }
        return revNum;
    }
}
