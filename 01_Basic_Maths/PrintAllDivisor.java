public class PrintAllDivisor {
    public static void main(String[] args) {
        int num = 36;
        printAllDivisor(num);
    }
    public static void printAllDivisor(int num){
        for (int i = 1;i<= num ;i++){
            if (num % i == 0){
                System.out.print( i + " ");
            }
        }
    }
}
//T.C = O(N)
