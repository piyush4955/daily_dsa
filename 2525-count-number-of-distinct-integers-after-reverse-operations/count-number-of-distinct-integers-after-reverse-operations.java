class Solution {
    public int countDistinctIntegers(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            ans.add(num);
        }

        for(int i = nums.length - 1; i >= 0; i--){
            int rev = 0;
            int num = nums[i];

            while(num > 0){
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }
            ans.add(rev);
        }

        HashSet<Integer> dis = new HashSet<>();

        for(int num : ans){
            dis.add(num);
        }

        return dis.size();
    }
}