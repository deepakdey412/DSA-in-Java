public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 3, 1, 2, 3, 1};

        int uniqueElement = findUniqueElement(arr);
        if (uniqueElement != -1) {
            System.out.println("The unique element is " + uniqueElement);
        } else {
            System.out.println("No unique element found.");
        }
    }

    public static int findUniqueElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i]; // This element appears only once
            }
        }
        return -1; // No unique element found
    }
}
