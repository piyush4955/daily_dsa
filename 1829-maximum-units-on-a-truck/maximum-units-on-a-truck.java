class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> (b[1] - a[1]));
        int n = boxTypes.length;
        int units = 0;
        for(int i = 0; i<n; i++){
            int pickedBoxes = Math.min(truckSize,boxTypes[i][0]);
            truckSize-=pickedBoxes;
            units+=(pickedBoxes*boxTypes[i][1]);
            }
        return units;
    }
}