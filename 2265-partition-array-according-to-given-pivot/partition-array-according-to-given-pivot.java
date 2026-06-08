class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less = 0;
        int equal = 0;

        for (int num : nums) {
            if (num < pivot) {
                less++;
            } else if (num == pivot) {
                equal++;
            }
        }

        int[] ans = new int[nums.length];

        int i = 0;              // start of < pivot region
        int j = less;           // start of == pivot region
        int k = less + equal;   // start of > pivot region

        for (int num : nums) {
            if (num < pivot) {
                ans[i++] = num;
            } else if (num == pivot) {
                ans[j++] = num;
            } else {
                ans[k++] = num;
            }
        }

        return ans;
    }
}