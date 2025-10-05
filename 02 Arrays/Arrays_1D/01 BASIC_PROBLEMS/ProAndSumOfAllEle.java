package Basic;

public class ProAndSumOfAllEle {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,45,52};
        System.out.println(product(arr));
        System.out.println(sum(arr));
    }
    public static int product(int[] arr){
        int product = 1;
        for (int val : arr){
            product*=val;
        }
        return product;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int val : arr){
            sum+=val;
        }
        return sum;
    }
}
