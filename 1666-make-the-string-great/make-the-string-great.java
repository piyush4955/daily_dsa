class Solution {
    public String makeGood(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            stack.push((int) ch);
            if (stack.size() >= 2) {
                int ch1 = stack.pop();
                int ch2 = stack.pop();
                if (Math.abs(ch1 - ch2) == 32) {
                    continue;
                } else {
                    stack.push(ch2);
                    stack.push(ch1);
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int ch : stack) {
            ans.append((char) ch);
        }
        return ans.reverse().toString();
    }
}