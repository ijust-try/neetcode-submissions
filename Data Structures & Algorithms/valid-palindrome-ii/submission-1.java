class Solution {
    public boolean validPalindrome(String s) {

        s = s.toLowerCase();

        int r = s.length() - 1;
        int l = 0;

        while (r > l) {

            if (s.charAt(r) == s.charAt(l)) {
                l++;
                r--;
            }
            else {
                int left = l + 1;
                int right = r;

                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }

                if (left >= right) {
                    return true;
                }

                left = l;
                right = r - 1;

                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }

                if (left >= right) {
                    return true;
                }

                return false;
            }
        }

        return true;
    }
}