public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,10,4,3,3};
        int target = 10;
        linearSerch(arr, target);
    }
    public static void linearSerch(int[] arr , int target){
        int index = -1;
        for (int i=1;i<arr.length;i++){
            if (arr[i]==target){
                index = i;
            }
        }
        System.out.println(index);
    }
}
