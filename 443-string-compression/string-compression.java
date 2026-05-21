class Solution {
    public int compress(char[] chars) {
        String s = "";
        int i = 0;
        int j = 0;
        int len = chars.length;
        int count = 0;

        while (j < len) {

            if (j < len && chars[i] == chars[j]) {
                count++;
                j++;
            }

            if (j == len || chars[i] != chars[j]) {
                char ch = chars[i];
                s += ch;

                if (count > 1) {
                    String num = Integer.toString(count);
                    s += num;
                }

                count = 0;
                i = j;
            }
        }

        for (int k = 0; k < s.length(); k++) {
            chars[k] = s.charAt(k);
        }

        return s.length();
    }
}