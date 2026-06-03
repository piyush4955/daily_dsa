class Solution {
    public String frequencySort(String s) {
        int check[] = new int[128];
        Integer cross[] = new Integer[128];
        int n = s.length();

        for(int i = 0; i < n; i++){
            int idx = s.charAt(i);   // fixed
            check[idx]++;
        }

        for(int i = 0; i < 128; i++){
            cross[i] = i;
        }

        Arrays.sort(cross, (a, b) -> check[b] - check[a]);

        String ans = "";

        for(int i = 0; i < 128; i++){
            for(int j = 0; j < check[cross[i]]; j++){
                ans += (char)(int)cross[i];   // fixed
            }
        }

        return ans;
    }
}