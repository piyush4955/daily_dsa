class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double temp = 0;
        for(int i = 0; i<k; i++){
            sum += nums[i];
            temp = (double)sum/k;
        }
        double max = temp;

        for(int i = k; i<nums.length; i++){
            sum+=nums[i];
            sum-=nums[i-k];
            temp = (double)sum/k;
            max = Math.max(temp,max);
        }
        return max;
    }
}