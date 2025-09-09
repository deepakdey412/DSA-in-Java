public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = " I am a   Boy studying in Btech   ";
        System.out.println("Length of last word : " + lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String str) {
        if (str == null || str.isEmpty()) return -1;

        str = str.trim();
        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
