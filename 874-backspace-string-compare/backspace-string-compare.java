class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch!='#') ans1.append(ch);
            else if (ans1.length() > 0) {
                ans1.deleteCharAt(ans1.length() - 1);
            }
        }
        for(char ch : t.toCharArray()){
            if(ch!='#') ans2.append(ch);
            else if (ans2.length() > 0) {
                ans2.deleteCharAt(ans2.length() - 1);
            }
        }
        return ans1.toString().equals(ans2.toString());
    }
}