package easy;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int idx1 = 0;
        int idx2 = s.length() - 1;

        while (idx1 < idx2) {
            while (idx1 < idx2 && !alphaNum(s.charAt(idx1))) {
                idx1++;
            }

            while (idx2 > idx1 && !alphaNum(s.charAt(idx2))) {
                idx2--;
            }

            if (Character.toLowerCase(s.charAt(idx1)) != Character.toLowerCase(s.charAt(idx2))) {
                return false;
            }

            idx1++; idx2--;
        }

        return true;
    }

    public static boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
}
