class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int countzero = 0;
        int count = 0;
        int max = 0;
        for(int right = 0; right<nums.length; right++){
            if(nums[right]==1){
                count++;
            }
            else if(nums[right]==0){
                count++;
                countzero++;
            }
            while(countzero>k){
                if(nums[left]==1){
                    count--;
                    left++;
                }
                else if(nums[left]==0){
                    count--;
                    countzero--;
                    left++;
                }
            }
            max = Math.max(count,max);
        }
        return max;
    }
}