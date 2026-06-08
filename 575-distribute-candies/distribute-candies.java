class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> temp = new HashSet<>();
        for(int type : candyType){
            temp.add(type);
        }
        int half = candyType.length/2;
        return Math.min(temp.size(),half);
    }
}