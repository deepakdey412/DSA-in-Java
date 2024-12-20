//  Given two integers n and m (m != 0). Find the number closest to n and divisible by m.
//  If there is more than one such number, then output the one having maximum absolute value.
//
//  Examples:
//
//  Input: n = 13, m = 4
//  Output: 12
//  Explanation: 12 is the closest to 13, divisible by 4.
//
//
//  Input: n = -15, m = 6
//  Output: -18
//  Explanation: Both -12 and -18 are closest to -15, but-18 has the maximum absolute value.

public class ClosestDivisible {

    public static void main(String[] args) {
        int n = 13;
        int m = 4;
        int closestDivisible = findClosestDivisible(n, m);
        System.out.println("Closest divisible number: " + closestDivisible);
    }

    public static int findClosestDivisible(int n, int m) {
        int quotient = n / m;
        int lowerMultiple = quotient * m;
        int higherMultiple = (quotient + 1) * m;

        if (Math.abs(n - lowerMultiple) < Math.abs(n - higherMultiple)) {
            return lowerMultiple;
        } else if (Math.abs(n - lowerMultiple) > Math.abs(n - higherMultiple)) {
            return higherMultiple;
        } else {
            // If both multiples are equally close, return the one with higher absolute value
            return Math.abs(lowerMultiple) > Math.abs(higherMultiple) ? lowerMultiple : higherMultiple;
        }
    }

}