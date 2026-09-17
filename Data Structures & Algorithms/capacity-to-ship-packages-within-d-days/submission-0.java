class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int l = 0;
        int r = 0;

        // l = largest package
        // r = total weight of all packages
        for (int i = 0; i < weights.length; i++) {

            if (weights[i] > l) {
                l = weights[i];
            }

            r += weights[i];
        }

        while (l <= r) {

            int m = l + (r - l) / 2;

            int currentWeight = 0;
            int daysNeeded = 1;

            // Check how many days are needed with capacity m
            for (int i = 0; i < weights.length; i++) {

                if (currentWeight + weights[i] > m) {
                    daysNeeded++;
                    currentWeight = weights[i];
                }
                else {
                    currentWeight += weights[i];
                }
            }

            // Capacity m works, try a smaller capacity
            if (daysNeeded <= days) {
                r = m - 1;
            }
            else {
                // Capacity m is too small, need a bigger capacity
                l = m + 1;
            }
        }

        return l;
    }
}