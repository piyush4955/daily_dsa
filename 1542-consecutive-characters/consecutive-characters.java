class Solution {
    public int maxPower(String s) {
        int  i = 0;
        int j = 0;
        int count = 0;
        int max = 0;
        while(i<s.length() && j<s.length()){
            if(s.length()==1){
                return 1;
            }
            if(s.charAt(i)==s.charAt(j)){
                count++;
                j++;
            }
            else{
                count = 0;
                i = j;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}