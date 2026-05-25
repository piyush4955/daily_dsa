class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int sum = 0;

        // first window
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                sum += customers[i];
            }
        }

        int max = sum;

        int start = 0;
        int end = minutes - 1;

        // sliding window
        for (int i = minutes; i < customers.length; i++) {

            if (grumpy[i] == 1) {
                sum += customers[i];
            }

            if (grumpy[i - minutes] == 1) {
                sum -= customers[i - minutes];
            }

            if (sum > max) {
                max = sum;
                start = i - minutes + 1;
                end = i;
            }
        }

        int ans = 0;

        for (int i = 0; i < customers.length; i++) {

            if (grumpy[i] == 0) {
                ans += customers[i];
            }
            else if (i >= start && i <= end) {
                ans += customers[i];
            }
        }

        return ans;
    }
}