class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff = 0;
        if(n == 1){
            return 0;
        }
        else if(n==2){
            return Math.abs(nums[1]-nums[0]);
        }
        
        else {
            int mid = n/2;
            int median = nums[mid];
            for(int i = 0; i<n; i++){
                diff += Math.abs(nums[i]-median);
            }
            return diff;
        }
        // else{
        //     int mid1 = n/2;
        //     int mid2 = n/2+1;
        //     int median = (nums[mid1]+nums[mid2])/2;
        //     for(int i = 0; i<n; i++){
        //         diff+=Math.abs(nums[i]-median);
        //     }
        //     return diff;
        // }
    }
}