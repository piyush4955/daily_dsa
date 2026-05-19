class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> rows = new ArrayList<>();

        // Find minimum of each row
        for (int i = 0; i < matrix.length; i++) {
            int num1 = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                num1 = Math.min(num1, matrix[i][j]);
            }
            rows.add(num1);
        }

        List<Integer> cols = new ArrayList<>();

        // Find maximum of each column
        for (int j = 0; j < matrix[0].length; j++) {
            int num2 = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                num2 = Math.max(num2, matrix[i][j]);
            }
            cols.add(num2);
        }

        List<Integer> ans = new ArrayList<>();

        //compare rows and columsn to see common
        for (int k = 0; k < rows.size(); k++) {
            for (int m = 0; m < cols.size(); m++) {

                if (rows.get(k).equals(cols.get(m))) {
                    ans.add(rows.get(k));
                }
            }
        }

        return ans;
    }
}