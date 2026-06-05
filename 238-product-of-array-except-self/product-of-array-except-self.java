class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int mult1 = 1;
        int mult2 = 1;
        for(int i = 0; i<n; i++){
            mult1*=nums[i];
            prefix[i] = mult1;
        }
        for(int i = n-1; i>=0; i--){
            mult2*=nums[i];
            suffix[i] = mult2;
        }
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? 1 : prefix[i - 1];
            int right = (i == n - 1) ? 1 : suffix[i + 1];
            ans[i] = left * right;
        }
        return ans;
    }
}