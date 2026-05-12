class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(target == nums[mid]){
                int count1 = 0;
                int count2 = 0;
                for(int i = mid+1; i<nums.length; i++){
                    if(nums[i] == target) count1++;
                }
                for(int j = mid-1; j>=0; j--){
                    if(nums[j] == target) count2++;
                }
                ans[0] = mid-count2;
                ans[1] = mid+count1;
                return ans;
            }
            else if(target < nums[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}