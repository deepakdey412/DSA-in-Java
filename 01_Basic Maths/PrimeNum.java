public class PrimeNum {
    public static void main(String[] args) {
        int num = 11;
        int result = findPrimeNum(num);
        if (result > 2) {
            System.out.println("Not not prime");
        } else {
            System.out.println("Yes prime");
        }
    }

    public static int findPrimeNum(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (num / i != i) {
                    count++;
                }
            }
        }
        return count;
    }

}
