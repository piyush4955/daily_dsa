class Solution {
    public int lengthOfLongestSubstring(String s) {

        int check[] = new int[128];
        int count = 0;
        int left = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++) {

            int idx = s.charAt(right);
            check[idx]++;

            for(int i = 0; i < 128; i++) {

                if(check[i] > 1) {

                    while(check[i] > 1) {
                        int index = s.charAt(left);
                        check[index]--;
                        left++;
                    }
                }
            }

            count = right - left + 1;
            max = Math.max(count, max);
        }

        return max;
    }
}