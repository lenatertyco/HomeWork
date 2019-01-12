public class Main {

    public static void main (String [] args) {
        String input = "aacccccde";
        System.out.println(getLongestSubstringLength(input));

        System.out.println(getLongestSubstring(input)); // ccccc
    }

    public static int getLongestSubstringLength(String input) {
        char[] chars = input.toCharArray();
        int counter = 1;
        int max = 1;
        for(int i=0; i<chars.length-1; i++) {
            if (chars[i] == chars[i+1]) {
                counter ++;
                if(counter > max) {
                    max = counter;
                }
            } else {
                counter = 1;
            }
        }
        return max;
   }

   public static String getLongestSubstring(String input) {

   }
}
