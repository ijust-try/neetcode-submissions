class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int n1 = 0;
        int n2 = 0;
        int[] arr = new int[m + n];

        for (int i = 0; i < m + n; i++) {

            if (n1 < m && n2 < n) {

                if (nums1[n1] <= nums2[n2]) {
                    arr[i] = nums1[n1];
                    n1++;
                } else {
                    arr[i] = nums2[n2];
                    n2++;
                }

            } else if (n1 < m) {
                arr[i] = nums1[n1];
                n1++;

            } else {
                arr[i] = nums2[n2];
                n2++;
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}