class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int right = 0;
        for(right = 0; right<nums.length; right++){
            sum+=nums[right];
            while(sum>=target){
                count = right-left+1;
                min = Math.min(count,min);
                sum-=nums[left];
                left++; 
            }
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}