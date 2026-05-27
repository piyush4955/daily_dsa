class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int[] freq = new int[26];
        int[] check = new int[26];
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }

        for(int i = 0; i<p.length(); i++){
            int idx = p.charAt(i) - 'a';
            freq[idx]++;
        }
        
        //fix window
        for(int i = 0; i<p.length(); i++){
            int idx1 = s.charAt(i) - 'a';
            check[idx1]++;
        }
        if(Arrays.equals(freq,check)){
            ans.add(0);
        }
        //slide karo window
        for(int i = p.length(); i<s.length(); i++){
            int idx2 = s.charAt(i) - 'a';
            check[idx2]++;

            int idx3 = s.charAt(i-p.length()) - 'a';
            check[idx3]--;
            if(Arrays.equals(check,freq)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}