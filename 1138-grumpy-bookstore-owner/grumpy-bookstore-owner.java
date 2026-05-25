class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int extra = 0;

        // first window
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }

        int maxExtra = extra;
        int start = 0;

        // sliding window
        for (int i = minutes; i < customers.length; i++) {

            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            if (grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }

            if (extra > maxExtra) {
                maxExtra = extra;
                start = i - minutes + 1;
            }
        }

        int end = start + minutes - 1;

        int ans = 0;

        // final answer
        for (int i = 0; i < customers.length; i++) {

            // already satisfied
            if (grumpy[i] == 0) {
                ans += customers[i];
            }

            // power window
            else if (i >= start && i <= end) {
                ans += customers[i];
            }
        }

        return ans;
    }
}