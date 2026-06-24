class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> ans = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        
        int j = 0;
        int i = 1;
        while(j<target.length){
            stack.push(i);
            ans.add("Push");
            if(!stack.isEmpty()){
                if(stack.peek()==target[j]){
                    j++;
                }
                else{
                    stack.pop();
                    ans.add("Pop");
                }
            }
            i++;
        }
        return ans;
    }
}