class Solution {
    public int maxVowels(String s, int k) {

        char[] temp = new char[k];
        int count = 0;

        // fixed window
        for (int i = 0; i < k; i++) {
            temp[i] = s.charAt(i);

            if (temp[i] == 'a' || temp[i] == 'e' || temp[i] == 'i' ||
                temp[i] == 'o' || temp[i] == 'u') {
                count++;
            }
        }

        int max = count;

        // slide window
        for (int i = k; i < s.length(); i++) {

            // remove left character
            char left = s.charAt(i - k);
            if (left == 'a' || left == 'e' || left == 'i' ||
                left == 'o' || left == 'u') {
                count--;
            }

            // add right character
            char right = s.charAt(i);
            if (right == 'a' || right == 'e' || right == 'i' ||
                right == 'o' || right == 'u') {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}