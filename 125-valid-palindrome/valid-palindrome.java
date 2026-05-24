class Solution {
    public boolean isPalindrome(String s) {
        String og = s.toLowerCase();
        String ogtemp = "";

        for (int i = 0; i < s.length(); i++) {
            if ((og.charAt(i)>='a' && og.charAt(i)<='z') || (og.charAt(i)>='0' && og.charAt(i)<='9')) {
                ogtemp += og.charAt(i);
            } else {
                continue;
            }
        }

        String ogrev = "";
        int j = 0;

        for (int i = ogtemp.length() - 1; i >= 0; i--) {
            ogrev += ogtemp.charAt(i);
            j++;
        }

        for (int i = 0; i < ogtemp.length(); i++) {
            if (ogrev.charAt(i) != ogtemp.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}