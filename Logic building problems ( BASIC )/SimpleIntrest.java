import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price : ");
        float price = sc.nextFloat();
        System.out.print("\nEnter the time : ");
        float time = sc.nextFloat();
        System.out.print("\nEnter the rate of intrest : ");
        float rate = sc.nextFloat();

        float finalAmount = findSimpleIntrest(price, time, rate);
        System.out.println("the Final amount after +" + time + " years at rate of " + rate + " % is " + finalAmount);
    }

    public static float findSimpleIntrest(float p, float t, float r) {
        float amount = 0;
        amount = p * t * r / 100;
        return amount;
    }
}
