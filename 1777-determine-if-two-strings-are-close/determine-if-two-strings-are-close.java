class Solution {
    public boolean closeStrings(String word1, String word2) {
        int size1 = word1.length();
        int size2 = word2.length();
        if(size1!=size2){
            return false;
        }
        
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(char ch1 : word1.toCharArray()){
            freq1[ch1-'a']++;
        }
        for(char ch2 : word2.toCharArray()){
            freq2[ch2-'a']++;
        }
        for(int i = 0; i<26; i++){
            if(freq1[i]>0 && freq2[i]==0){
                return false;
            }
            if(freq1[i]==0 && freq2[i]>0){
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}