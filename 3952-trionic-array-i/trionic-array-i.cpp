#include <vector>
using namespace std;

class Solution {
public:
    bool isTrionic(vector<int>& nums) {
        int n = nums.size();
        // A trionic array needs at least p=1, q=2, so n must be at least 4 
        // to satisfy 0 < p < q < n-1.
        if (n < 4) return false;

        int i = 0;

        // 1. First segment: Strictly Increasing (Up to p)
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        // Must have increased at least once, and cannot be at the very end
        if (i == 0 || i >= n - 2) return false;

        // 2. Second segment: Strictly Decreasing (Down to q)
        int p = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        // Must have decreased at least once, and cannot be the last element
        if (i == p || i == n - 1) return false;

        // 3. Third segment: Strictly Increasing (Up to the end)
        int q = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Return true only if we successfully reached the last index
        return i == n - 1;
    }
};