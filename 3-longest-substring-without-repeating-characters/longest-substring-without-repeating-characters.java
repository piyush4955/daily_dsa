class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            int count = 0;

            for (int j = i; j < s.length(); j++) {

                if (temp.contains(String.valueOf(s.charAt(j)))) {
                    break;
                }

                temp += s.charAt(j);
                count++;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}