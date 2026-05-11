class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String ans = new StringBuilder(clean).reverse().toString();
        if(clean.equals(ans)) return true;
        else return false;
    }
}