class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        int ans[] = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
            else if(nums[i]==pivot){
                equal.add(pivot);
            }
            else{
                greater.add(nums[i]);
            }
        }
        for(int i = 0; i<less.size(); i++){
            ans[i] = less.get(i);
        }
        int j = 0;
        for(int i = less.size(); i<less.size()+equal.size(); i++){
            ans[i] = equal.get(j);
            j++;
        }
        int k = 0;
        for(int i = less.size()+equal.size(); i<nums.length; i++){
            ans[i] = greater.get(k);
            k++;
        }
        return ans;
    }
}