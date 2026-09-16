class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = 0;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > r) {
                r = piles[i];
            }
        }

        while (l <= r) {

            int m = l + (r - l) / 2;

            long totalHours = 0;

            for (int i = 0; i < piles.length; i++) {

                long hoursForEachPile = (piles[i] + (long)m - 1) / m;

                totalHours += hoursForEachPile;
            }

            if (totalHours <= h) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }

        return l;
    }
}