class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0; int  j = 0;
        int s1 = nums1.length;
        int s2 = nums2.length;

        while(i<s1 && j<s2){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{
                return nums2[j];
            }
        }
        return -1;
    }
}