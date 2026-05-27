class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        //fixed window
        for(int i = 0; i<k; i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        int min = count;

        for(int i = k; i<blocks.length(); i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
            if(blocks.charAt(i-k)=='W'){
                count--;
            }
            min = Math.min(count,min);
        }
        return min;
    }
}