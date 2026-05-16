import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        ArrayList<Integer> li = new ArrayList<>();

        for(int num : nums){
            li.add(num);
        }

        Collections.sort(li, Collections.reverseOrder());

        return li.get(k - 1);
    }
}