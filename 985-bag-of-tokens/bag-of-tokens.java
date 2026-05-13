class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int small = 0;
        int large = tokens.length-1;
        int score = 0;
        int ans = 0;

        while(small<=large){
            
            if(tokens.length == 1 && (power<tokens[small])){
                return 0;
            }
            else{
                if(power>=tokens[small]){
                    power = power-tokens[small];
                    score++;
                    small++;
                    ans = Math.max(ans, score);
                }
                else if(score>=1 && small<large){
                    power = power+tokens[large];
                    score--;
                    large--; 
                }
                else{
                    break;
                }
            }      
        }
        return ans;
    }
}