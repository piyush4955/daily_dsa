class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int j = n-1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n/2; i++){
            int sum = nums[i]+nums[j];
            max = Math.max(sum,max);
            j--;
        }
        return max;
    }
}