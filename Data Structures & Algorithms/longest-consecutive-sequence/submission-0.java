class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int[] drop = new int[nums.length];
        int c = 0;

        drop[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

                c++;
                drop[c] = nums[i];

            }

        }

        int current = 1;
        int longest = 1;

        for (int i = 1; i <= c; i++) {

            if (drop[i] == drop[i - 1] + 1) {

                current++;

            } else {

                longest = Math.max(longest, current);
                current = 1;

            }

        }

        longest = Math.max(longest, current);

        return longest;
    }
}