class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int row = mat.length;
        int col = mat[0].length;
        int[] temp = new int[row*col];

        if(r*c!=row*col){
            return mat;
        }
        else{
            int idx = 0;
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    temp[idx] = mat[i][j];
                    idx++;
                }
            }
            int index = 0;
            for(int i = 0; i<r; i++){
                for(int j = 0; j<c; j++){
                    ans[i][j] = temp[index++];
                }
            }
        }
        return ans;
    }
}