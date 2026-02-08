class Solution {
public:
    int minimumDeletions(string s) {
        int n = s.length();
        int b_count = 0;
        int deletions = 0;
        
        for (char c : s) {
            if (c == 'b') {
                b_count++;
            } else {
                // We found an 'a'. We can either:
                // 1. Delete this 'a' (current deletions + 1)
                // 2. Keep this 'a' and delete a previous 'b' (b_count)
                deletions = min(deletions + 1, b_count);
            }
        }
        
        return deletions;
    }
};