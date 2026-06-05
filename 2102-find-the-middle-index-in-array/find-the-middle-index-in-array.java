class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < n; i++){
            sum1 += nums[i];
            prefix[i] = sum1;
        }

        for(int j = n - 1; j >= 0; j--){
            sum2 += nums[j];
            suffix[j] = sum2;
        }

        for(int i = 0; i < n; i++){
            if(prefix[i] - nums[i] == suffix[i] - nums[i]){
                return i;
            }
        }

        return -1;
    }
}