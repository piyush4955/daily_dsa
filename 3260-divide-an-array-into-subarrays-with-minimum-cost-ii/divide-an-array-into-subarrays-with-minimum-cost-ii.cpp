#include <vector>
#include <set>
#include <algorithm>

using namespace std;

class Solution {
public:
    long long minimumCost(vector<int>& nums, int k, int dist) {
        int n = nums.size();
        // We must pick nums[0] and some nums[i1].
        // Then we need k-2 more elements from the window of size 'dist' starting after i1.
        int needed = k - 2;
        long long current_window_sum = 0;
        multiset<int> low, high;

        auto add = [&](int val) {
            low.insert(val);
            current_window_sum += val;
            if (low.size() > needed) {
                int moving = *low.rbegin();
                current_window_sum -= moving;
                high.insert(moving);
                low.erase(prev(low.end()));
            }
        };

        auto remove = [&](int val) {
            auto it = low.find(val);
            if (it != low.end()) {
                current_window_sum -= val;
                low.erase(it);
                if (!high.empty()) {
                    int moving = *high.begin();
                    current_window_sum += moving;
                    low.insert(moving);
                    high.erase(high.begin());
                }
            } else {
                high.erase(high.find(val));
            }
        };

        // Initial window for the very first possible i1 (which is index 1)
        // i1 = 1, so we look at elements from index 2 to 1 + dist
        for (int i = 2; i <= min(n - 1, 1 + dist); ++i) {
            add(nums[i]);
        }

        long long min_total = nums[0] + nums[1] + (needed > 0 ? current_window_sum : 0);

        // Slide i1 from 2 up to a point where we can still fit k-1 subarrays
        for (int i1 = 2; i1 <= n - (k - 1); ++i1) {
            // As i1 moves from i1-1 to i1:
            // 1. Remove the new i1 from the window (it's no longer a 'choice' element)
            remove(nums[i1]);
            
            // 2. Add the element that just entered the range [i1 + 1, i1 + dist]
            int new_idx = i1 + dist;
            if (new_idx < n) {
                add(nums[new_idx]);
            }

            long long cost = (long long)nums[0] + nums[i1] + (needed > 0 ? current_window_sum : 0);
            min_total = min(min_total, cost);
        }

        return min_total;
    }
};