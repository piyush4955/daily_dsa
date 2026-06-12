class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] check = map.keySet().toArray(new Integer[0]);

        Arrays.sort(check, (a, b) -> map.get(b) - map.get(a));

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = check[i];
        }

        return ans;
    }
}