class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();
        int counta = 0;
        int countb = 0;
        int countc = 0;
        int left = 0;
        int ans = 0;

        for(int i = 0; i<n; i++){
            if(s.charAt(i)=='a') counta++;
            else if(s.charAt(i)=='b') countb++;
            else countc++;

            while(counta>=1 && countb>=1 && countc>=1){
                ans+=n-i;
                if(s.charAt(left)=='a') counta--;
                else if(s.charAt(left)=='b') countb--;
                else countc--;
                left++;  
            }
        }    
        return ans;
    }
}