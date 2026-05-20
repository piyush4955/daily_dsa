class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;

        int[] temp = new int[n + 1];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            temp[A[i]]++;
            temp[B[i]]++;

            int count = 0;

            for (int j = 1; j <= n; j++) {
                if (temp[j] == 2) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }
}