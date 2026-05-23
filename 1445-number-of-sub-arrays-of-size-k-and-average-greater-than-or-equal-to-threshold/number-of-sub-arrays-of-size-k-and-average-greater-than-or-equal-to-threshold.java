class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int sum = 0;
        int count = 0;
        for(int i = 0; i<k; i++){
            sum+=arr[i];
        }
        int temp = sum/k;
        if(temp>=threshold){
            count++;
        }

        for(int i = k; i<arr.length; i++){
            sum+=arr[i];
            sum-=arr[i-k];
            temp = sum/k;
            if(temp>=threshold){
                count++;
            }
        }
        return count;
    }
}