class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> li = new ArrayList<>();
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                li.add(i);
            }
        }

        return li;
    }
}