class Solution {
    public int maxDistance(String moves) {

        int n = moves.length();
        int sum = 0;
        int countU = 0;
        int countD = 0;
        int countL = 0;
        int countR = 0;
        int countunder = 0;

        for(int i = 0; i<n; i++){
            if(moves.charAt(i)=='U') countU++;
            else if(moves.charAt(i)=='D') countD++;
            else if(moves.charAt(i)=='L') countL++;
            else if(moves.charAt(i)=='R') countR++;
            else countunder++;
        }
        int n1 = Math.abs(countR-countL);
        int n2 = Math.abs(countU-countD);
        sum = n1+n2+countunder;
        return sum;
    }
}