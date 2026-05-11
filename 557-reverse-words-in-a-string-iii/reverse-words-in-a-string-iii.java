class Solution {
    public String reverseWords(String s) {
        int m = s.length();
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<m; i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                temp.append(ch);
            }
            
            else {
                if (temp.length() > 0) {
                    
                    ans.append(temp.reverse());
                    ans.append(" ");
                    temp.delete(0,temp.length());
                }
            } 
        }
        if (temp.length() > 0) {
            ans.append(temp.reverse());
        }
        return ans.toString().trim();
    }
}