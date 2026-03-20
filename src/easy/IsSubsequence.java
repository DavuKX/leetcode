package easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) {
            return false;
        }

        int index = 0;

        for (int i = 0; i < t.length(); i++) {
            if (index == s.length()) {
                break;
            }
            if (t.charAt(i) == s.charAt(index)) {
                index++;
            }
        }

        return index == s.length();
    }
}
