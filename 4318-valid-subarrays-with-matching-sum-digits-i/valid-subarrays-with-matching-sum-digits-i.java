class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;

        int count = 0;
        for(int i = 0; i < n; i++){
            long sum = 0;   // changed from int to long

            for(int j = i; j < n; j++){
                sum += nums[j];

                String str = String.valueOf(sum);
                int size = str.length();
                int first = str.charAt(0) - '0';
                int last = str.charAt(size - 1) - '0';

                if(first == x && last == x)
                    count++;
            }
        }
        return count;
    }
}