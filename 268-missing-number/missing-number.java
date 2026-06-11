class Solution {
    public int missingNumber(int[] nums) {

        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
        
        int ogSum = 0;
        for(int i = 0; i<=nums.length; i++){
            ogSum+=i;
        }
        return ogSum-sum;
    }
}