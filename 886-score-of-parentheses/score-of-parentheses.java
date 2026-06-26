class Solution {
    public int scoreOfParentheses(String s) {

        int score = 0;
        int countopen = 0;
        int n = s.length();
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
                countopen++;
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                    countopen--;
                    if(s.charAt(i - 1) == '('){
                        score += (int)Math.pow(2, countopen);
                    }
                }
            }
        }

        return score;
    }
}