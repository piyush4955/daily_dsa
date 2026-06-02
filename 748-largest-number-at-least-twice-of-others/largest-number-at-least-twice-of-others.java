class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i = 0; i<n; i++){
            max = Math.max(max,nums[i]);
        }
        int idx = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]==max){
                idx = i;
            }
        }
        for(int i = 0; i<n; i++){
            if(i==idx){
                continue;
            }
            else if(nums[i]*2<=max){
                continue;
            }
            else{
                return -1;
            }
        }
        return idx;
    }
}