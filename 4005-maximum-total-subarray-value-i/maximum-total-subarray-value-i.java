class Solution {
    public long maxTotalValue(int[] nums, int k) {

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for(long num:nums){
            max = Math.max(num,max);
            min = Math.min(num,min);
        }
        return (max-min)*k;
    }
}