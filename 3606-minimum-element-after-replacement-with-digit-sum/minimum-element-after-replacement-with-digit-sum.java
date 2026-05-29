class Solution {
    public int minElement(int[] nums) {
        int size = nums.length;
        int ans[] = new int[size];

        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int sum = 0;
            while(num>0){
                int digit = num%10;
                sum += digit ; 
                num = num/10;
            }
            ans[i] = sum;
        }
        int min = ans[0];
        for(int i = 0; i<size; i++){
            if(ans[i]<min){
                min = ans[i];
            }
        }
        return min;
    }
}