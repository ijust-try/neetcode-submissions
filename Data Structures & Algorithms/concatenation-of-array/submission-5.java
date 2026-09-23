class Solution {
    public int[] getConcatenation(int[] nums) {

        int i=0;
        int [] nums2 = new int[nums.length*2];
        int p= nums.length;

        while(p<nums2.length)
        {
            nums2[i]= nums[i];
            nums2[p]=nums[i];
            p++;
            i++;
        }
        return nums2;
    }
}