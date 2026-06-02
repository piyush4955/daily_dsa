class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = Math.abs(arr[1]-arr[0]);
        int i = 0;
        int j = 1;
        while(i<arr.length && j<arr.length){
            if(Math.abs(arr[j]-arr[i])==diff){
                i++;
                j++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}