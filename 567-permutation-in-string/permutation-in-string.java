import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] alphabetchar = new int[26];
        int[] alphabetcharcheck = new int[26];

        // frequency count for s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            alphabetchar[index]++;
        }

        // first window in s2
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s2.charAt(i);
            int index = ch1 - 'a';
            alphabetcharcheck[index]++;
        }

        // check first window
        if (Arrays.equals(alphabetchar, alphabetcharcheck)) {
            return true;
        }

        // sliding window
        for (int i = s1.length(); i < s2.length(); i++) {

            // add new character
            char ch2 = s2.charAt(i);
            int index = ch2 - 'a';
            alphabetcharcheck[index]++;

            // remove old character
            char ch3 = s2.charAt(i - s1.length());
            int index1 = ch3 - 'a';
            alphabetcharcheck[index1]--;

            // compare arrays
            if (Arrays.equals(alphabetchar, alphabetcharcheck)) {
                return true;
            }
        }

        return false;
    }
}