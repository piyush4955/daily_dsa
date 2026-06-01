class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int left = 0;
        int max = 0;
        int check[] = new int[1000000];

        for(int i = 0; i<nums.length; i++){
            check[nums[i]]++;
            sum+=nums[i];
            while(check[nums[i]]>1){
                sum-=nums[left];
                check[nums[left]]--;
                left++;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}