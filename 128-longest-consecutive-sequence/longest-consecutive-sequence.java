class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int j = 1;
        int max = 0;
        int length =1;

        if(list.size()==0){
            return 0;
        }

        for(int i = 1; i<list.size(); i++){
            if(list.get(i)-list.get(i-1)==1){
                length++;
            }
            else{
                length = 1;
            }
            max = Math.max(max,length);
        }
        max = Math.max(max,length);
        return max;
    }
}