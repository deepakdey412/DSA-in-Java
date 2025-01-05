public class PrintAllDivisor02 {
    public static void main(String[] args) {
        int num = 36;
        printAlldivisor(num);
    }

    public static void printAlldivisor(int num) {
        // Loop from 1 to sqrt(num)
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " "); // Print the divisor
                if (num / i != i) {       // Print the counterpart divisor if it's not the same
                    System.out.print((num / i) + " ");
                }
            }
        }
    }
}
