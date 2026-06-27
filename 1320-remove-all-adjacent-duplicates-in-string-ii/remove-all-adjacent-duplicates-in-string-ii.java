class Solution {
    public String removeDuplicates(String s, int k) {

        Deque<Character> stack = new ArrayDeque<>();
        Deque<Integer> countStack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                countStack.push(countStack.pop() + 1);
            } else {
                countStack.push(1);
            }

            stack.push(ch);

            if (countStack.peek() == k) {
                countStack.pop();
                for (int i = 0; i < k; i++) {
                    stack.pop();
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}