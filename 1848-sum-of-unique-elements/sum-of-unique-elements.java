class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int sum = 0;
        for(int freq : mp.keySet()){
            if(mp.get(freq)==1){
                sum+=freq;
            }
        }
        return sum;
    }
}