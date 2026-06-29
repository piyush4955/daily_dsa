class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int ans[] = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.fill(ans,-1);

        for(int i = 0; i<2*n; i++){
            while(!stack.isEmpty() && nums[i%n]>nums[stack.peek()]){
                int idx = stack.pop();
                ans[idx] = nums[i%n];
            }
            if(i<n){
                stack.push(i);
            }
        } 
        return ans;
    }
}