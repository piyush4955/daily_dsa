class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            int freq[] = new int[26];
            for(int j = i; j<s.length(); j++){
                int idx = s.charAt(j)-'a';
                freq[idx]++;
                int max = 0;
                int min = Integer.MAX_VALUE;
                int diff = 0;
                for(int k = 0; k<26; k++){
                    if(freq[k]>0){
                        max = Math.max(max,freq[k]);
                        min = Math.min(min,freq[k]);
                    }
                }
                diff = max-min;
                if(diff>0){
                    sum+=diff;
                }
            }
        }
        return sum;
    }
}