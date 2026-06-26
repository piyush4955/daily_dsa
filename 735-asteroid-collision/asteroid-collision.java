class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int rock : asteroids) {
            if (rock > 0)
                stack.push(rock); // right going rocks in stack
            else { // if rock is going left
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(rock);
                    continue;
                }

                if (stack.peek() > Math.abs(rock))
                    continue;

                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(rock)) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() == Math.abs(rock)) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(rock);
                }
            }
        }

        int size = stack.size();
        int[] ans = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}