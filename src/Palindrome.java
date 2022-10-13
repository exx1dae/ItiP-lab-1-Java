public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + ":" + isPalindrome(args[i]) + " ");
        }
    }

    public static String reverseString(String s) {
        String reverseString = "";
        for (int i = 0; i < s.length(); i++) {
            reverseString += s.charAt(s.length() - 1 - i);
        }
        return reverseString;
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            return true;
        }
        return false;
    }
}
