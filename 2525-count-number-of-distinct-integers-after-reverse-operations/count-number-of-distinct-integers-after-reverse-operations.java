class Solution {
    public int countDistinctIntegers(int[] nums) {

        HashSet<Integer> ans = new HashSet<>();
        for(int num: nums){
            ans.add(num);
            int rev = 0;
            while(num>0){
                int digit = num%10;
                rev = rev*10+digit;
                num/=10;
            }
            ans.add(rev);
        }
        return ans.size();
    }
}