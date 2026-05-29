class Solution {
    int countFreq(int[] arr, int target) {
        int n = arr.length;

        // Lower Bound
        int low = 0, high = n - 1;
        int res1 = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                res1 = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Target not present
        if (res1 == n || arr[res1] != target)
            return 0;

        // Upper Bound
        int left = 0, right = n - 1;
        int res2 = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                res2 = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res2 - res1;
    }
}