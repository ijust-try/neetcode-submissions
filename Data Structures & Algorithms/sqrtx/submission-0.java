class Solution {
    public int mySqrt(int x) {

        int l = 0;
        int r = x;

        while (l <= r) {

            int m = l + (r - l) / 2;

            long prod = (long) m * m;

            if (prod == x) {
                return m;
            }

            else if (prod < x) {
                l = m + 1;
            }

            else {
                r = m - 1;
            }
        }

        return r;
    }
}