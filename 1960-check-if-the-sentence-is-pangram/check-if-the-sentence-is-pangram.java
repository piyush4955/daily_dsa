class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        int[] alphabetCounts = new int[26];
        for(int i = 0; i<n; i++){
            char ch = sentence.charAt(i);
            int idx = ch - 'a';
            alphabetCounts[idx]++;
        }
        int count = 0;
        for(int i = 0; i<26; i++){
            if(alphabetCounts[i]==0){
                return false;
            }
        }
        return true;
        
    }
}