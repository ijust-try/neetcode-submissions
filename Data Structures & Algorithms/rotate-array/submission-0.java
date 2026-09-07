class Solution {
    public void rotate(int[] nums, int k) {

        int[] arr = new int[nums.length];

        k = k % nums.length;

        int m = nums.length - k;
        int l = 0;

        while (m < nums.length) {
            arr[l] = nums[m];
            l++;
            m++;
        }

        int i = 0;

        while (l < nums.length) {
            arr[l] = nums[i];
            l++;
            i++;
        }

        for (int j = 0; j < nums.length; j++) {
            nums[j] = arr[j];
        }
    }
}