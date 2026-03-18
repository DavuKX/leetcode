package easy;

public class MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder word3 = new StringBuilder();
       int lenWord1 = word1.length();
       int lenWord2 = word2.length();

        for (int i = 0; i < Math.max(lenWord1, lenWord2); i++) {
            if (i < lenWord1) {
                word3.append(word1.charAt(i));
            }

            if (i < lenWord2) {
                word3.append(word2.charAt(i));
            }
        }

        return word3.toString();
    }
}
