class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b) -> (b[1]-b[0])-(a[1]-a[0]));
        int ans = tasks[0][1];
        int diff1 = tasks[0][1]-tasks[0][0];
        for(int i = 0; i<tasks.length-1; i++){
            
            if(diff1>=tasks[i+1][1]){
                diff1 = diff1-tasks[i+1][0];
            }
            else{
                int add = tasks[i+1][1]-diff1;
                diff1 = diff1+add- tasks[i+1][0];
                ans += add;
            }
        }
        return ans;
    }
}