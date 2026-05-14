class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int check = nums[n-1];
        if(check!=n-1){
            return false;
        }
        else{
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                int idx = nums[i];
                arr[idx]++;
            }
            for(int i = 1; i<n-1; i++){
                if(arr[i]!=1){
                    return false;
                }
            }
            if(nums[n-1]==nums[n-2] && arr[n-1]==2){
                return true;
            }
        }
        return false;
    }
}