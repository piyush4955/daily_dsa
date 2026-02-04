#include <vector>
#include <algorithm>
#include <climits>

using namespace std;

class Solution {
public:
    long long maxSumTrionic(vector<int>& nums) {
        int n = nums.size();
        
        // l_inc[i] is the max sum of an increasing subarray ending at i (length >= 2)
        // If no such subarray exists (i.e., nums[i-1] >= nums[i]), we store -1e18
        vector<long long> l_inc(n, -2e18); 
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                // Either extend a previous increasing subarray or start a new one of length 2
                l_inc[i] = max((long long)nums[i] + nums[i-1], nums[i] + l_inc[i-1]);
            }
        }

        // r_inc[i] is the max sum of an increasing subarray starting at i (length >= 2)
        vector<long long> r_inc(n, -2e18);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                r_inc[i] = max((long long)nums[i] + nums[i+1], nums[i] + r_inc[i+1]);
            }
        }

        long long ans = LLONG_MIN;

        // Find strictly decreasing segments nums[p...q]
        for (int i = 0; i < n - 1; ) {
            if (nums[i] > nums[i + 1]) {
                int p = i;
                long long mid_sum = 0; 
                int j = i;
                
                while (j + 1 < n && nums[j] > nums[j + 1]) {
                    j++;
                    int q = j;
                    // mid_sum will track the sum of elements STRICTLY between p and q
                    if (q > p + 1) mid_sum += nums[q-1];

                    // Check if we can form a trionic subarray using peak p and valley q
                    if (l_inc[p] > -1e18 && r_inc[q] > -1e18) {
                        long long current = l_inc[p] + mid_sum + r_inc[q];
                        ans = max(ans, current);
                    }
                }
                i = j; 
            } else {
                i++;
            }
        }
        return ans;
    }
};