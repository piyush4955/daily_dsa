class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] arr = new int[2]; 

        while(left<right){
            int ans = numbers[left]+numbers[right];
            if(ans==target){
                arr[0] = left+1;
                arr[1] = right+1;
            }
            if(ans<target){
                left++;
            }
            else{
                right--;
            }
        }
        return arr;
    }
}