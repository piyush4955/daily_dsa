class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0;
        int m = players.length;
        int n = trainers.length;
        int j = 0;
        int i = 0;
        
        

        while(i < m && j < n){
            if(players[i]<=trainers[j]){
                i++;
                count++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
}