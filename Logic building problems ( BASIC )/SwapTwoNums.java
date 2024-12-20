public class SwapTwoNums {
    public static void main(String[] args) {
        int num1 = 1000, num2 = 2000;
        System.out.println("First num : " + num1 + " Second num :" + num2);

        System.out.println("Swaping the numbers by using temp vairable : ");
        swap01(num1, num2);

        System.out.println("Swaping the numbers by using + and - operator : ");
        swap02(num1, num2);

        System.out.println("Swaping the numbers by using * and / operator : ");
        swap03(num1, num2);

        System.out.println("Swaping the numbers by using bit ^ operator : ");
        swap04(num1, num2);
    }

    public static void swap01(int num01, int num02) {
        int temp = 0;
        temp = num01;
        num01 = num02;
        num02 = temp;
        System.out.println("First num " + num01 + " Second num :" + num02);
    }

    public static void swap02(int num01, int num02) {
        num01 = num01 + num02;
        num02 = num01 - num02;
        num01 = num01 - num02;
        System.out.println("First num " + num01 + " Second num :" + num02);
    }

    public static void swap03(int num01, int num02) {
        num01 = num01 * num02;
        num02 = num01 / num02;
        num01 = num01 / num02;
        System.out.println("First num " + num01 + " Second num :" + num02);
    }

    public static void swap04(int num01, int num02) {
        num01 = num01 ^ num02;
        num02 = num01 ^ num02;
        num01 = num01 ^ num02;
        System.out.println("First num " + num01 + " Second num :" + num02);
    }


}
