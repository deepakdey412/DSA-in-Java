public class BracketBalancingCountMinimumBracketRemoval {
    public static void main(String[] args) {
        String str = "}{{}}{{{";
        System.out.println("Minimum bracket removal : " + findCount(str));
    }

    public static int findCount(String str) {
        int open = 0;   // count of unmatched '{'
        int close = 0;  // count of unmatched '}'

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{') {
                open++; // push an opening
            } else if (ch == '}') {
                if (open > 0) {
                    // match found → reduce unmatched open
                    open--;
                } else {
                    // no opening to match → extra closing
                    close++;
                }
            }
        }

        // total removals = unmatched open + unmatched close
        return open + close;
    }
}
