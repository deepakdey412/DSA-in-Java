
public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 1634;
        // int num = 371;
        int sumNum = findArmstrong(num);
        if (sumNum == num) {
            System.out.println("Yes Armstrong");
        } else {
            System.out.println("No not");
        }
    }

    public static int findArmstrong(int num) {
        int sum = 0;
        int rem = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        return sum;
    }
}
