class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int size = nums1.length;
        int nge[] = new int[n];
        Arrays.fill(nge,-1);

        Deque<Integer> stack = new ArrayDeque<>();
        int ans[] = new int[size];

        for(int i = 0; i<n; i++){
            while(!stack.isEmpty() && nums2[i]>nums2[stack.peek()]){
                int idx = stack.pop();
                nge[idx] = nums2[i];
            }
            stack.push(i);
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(nums2[i],nge[i]);
        }
        for (int i = 0; i<size; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}