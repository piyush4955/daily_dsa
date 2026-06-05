class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char ch : stones.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int sum = 0;
        for(char cha : jewels.toCharArray()){
            if(mp.containsKey(cha)){
                sum+=mp.get(cha);
            }
        }
        return sum;
    }
}