class MinStack {
    private Deque<Integer> st;
    private Deque<Integer> minSt;

    public MinStack() {
        st = new ArrayDeque<>();
        minSt = new ArrayDeque<>();
    }

    public void push(int val) {
        st.push(val);

        // Keep minimum history in a second stack.
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }

    public void pop() {
        int x = st.pop();

        // Sync min stack when current minimum is removed.
        if (x == minSt.peek()) {
            minSt.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }
}