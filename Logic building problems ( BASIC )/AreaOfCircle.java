import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float radius = sc.nextFloat();

        float area = findAreaOfCircle(radius);
        System.out.println("area of circle of radius " + radius + " is " + area);
    }

    public static float findAreaOfCircle(float radius) {

        return (float) (3.14 * radius * radius);
    }
}
