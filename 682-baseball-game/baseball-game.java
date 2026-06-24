class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("+") && !operations[i].equals("D") && !operations[i].equals("C")) {
                stack.push(Integer.parseInt(operations[i]));
            }
            else if (operations[i].equals("C")) {
                stack.pop();
            }
            else if (operations[i].equals("+")) {
                int num2 = stack.pop(); // upper
                int num1 = stack.pop(); // bottom
                int add = num1 + num2;
                stack.push(num1);
                stack.push(num2);
                stack.push(add);
            }
            else {
                stack.push(stack.peek() * 2);
            }
        }

        int sum = 0;
        for (int num : stack) {
            sum += num;
        }

        return sum;
    }
}