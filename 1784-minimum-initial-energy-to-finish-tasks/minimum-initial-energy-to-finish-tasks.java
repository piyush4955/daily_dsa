class Solution {
    public int minimumEffort(int[][] tasks) {

        Arrays.sort(tasks,(a,b) -> (b[1]-b[0])-(a[1]-a[0]));

        int ans = tasks[0][1];
        int diff1 = tasks[0][1] - tasks[0][0];

        for(int i = 0; i < tasks.length - 1; i++){

            if(diff1 < tasks[i+1][1]){
                int add = tasks[i+1][1] - diff1;
                ans += add;
                diff1 += add;
            }

            diff1 -= tasks[i+1][0];
        }

        return ans;
    }
}