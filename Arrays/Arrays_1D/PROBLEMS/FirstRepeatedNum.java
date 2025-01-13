public class FirstRepeatedNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 9, 3, 4, 9, 5, 6};
        int duplicate = findFirstDuplicate(arr);

        if (duplicate != -1) {
            System.out.println("First duplicate element: " + duplicate);
        } else {
            System.out.println("No duplicate elements found. Return: " + duplicate);
        }
    }

    public static int findFirstDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];// Return the first duplicate element
                }
            }
        }
        return -1; // Return -1 if no duplicates are found
    }
}


