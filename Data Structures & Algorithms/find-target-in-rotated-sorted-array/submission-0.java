class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        // Step 1: Find the boundary
        while (l < r) {

            int m = l + (r - l) / 2;

            if (nums[m] > nums[r]) {
                l = m + 1;
            }
            else {
                r = m;
            }
        }

        int boundary = l;

        // Step 2: Decide which sorted half to search
        if (target >= nums[boundary] && target <= nums[nums.length - 1]) {

            l = boundary;
            r = nums.length - 1;
        }
        else {

            l = 0;
            r = boundary - 1;
        }

        // Step 3: Normal binary search
        while (l <= r) {

            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                return m;
            }
            else if (nums[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        return -1;
    }
}