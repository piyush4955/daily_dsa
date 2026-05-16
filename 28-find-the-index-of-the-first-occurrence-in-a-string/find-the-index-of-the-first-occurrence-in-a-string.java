class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                count++;
            }
            else{
                i=i-j+1;
                j=0;
                count=0;
            }
            if(count == needle.length()){
                return i-needle.length();
            }
        }
        return -1;
    }
}