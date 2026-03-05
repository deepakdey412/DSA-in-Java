public class AverageOfElementsOfArr {
    public static void main(String[] args) {
        int[] arr = {10, 2, 0, 5, 1, 3, 2, 5};
        System.out.println("Average of elements of array: " + average(arr));
    }

    public static double average(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}
