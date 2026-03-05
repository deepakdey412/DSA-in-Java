import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Deepak";
        reverse(word);
    }
    public static void reverse(String str){
        char[] arr = str.toCharArray();
        System.out.println("Original String array : "+Arrays.toString(arr));
        int  start = 0, end = arr.length - 1;
        while (start<end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed string array : "+Arrays.toString(arr));
    }

}
