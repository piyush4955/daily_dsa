class Solution {
public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        int j=0;
        ans.add(intervals[0]);//[1,3]
        int n=intervals.length;
        for(int i=1;i<n;i++){
            if(intervals[i][0] <= ans.get(j)[1]){
                ans.get(j)[1]=Math.max(ans.get(j)[1],intervals[i][1]);
            }
            else{
                ans.add(intervals[i]);
                j++;
            }
        }
        return ans.toArray(new int[j][]);
    }
}