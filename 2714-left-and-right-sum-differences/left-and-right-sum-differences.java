class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            sum1 += nums[i];
            prefix[i] = sum1;
        }

        for(int j = n - 1; j >= 0; j--){
            sum2 += nums[j];
            suffix[j] = sum2;
        }

        for(int i = 0; i < n; i++){
            ans[i] = Math.abs(prefix[i] - suffix[i]);
        }

        return ans;
    }
}