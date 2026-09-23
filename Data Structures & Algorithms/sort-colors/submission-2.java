class Solution {
    public void sortColors(int[] nums) {
        
        int []c = new int [3];

        for(int n:nums)
        {
            c[n]++;
        }

        int i=0;
        for(int val=0;val<3;val++)
        {
            for(int k=0;k<c[val];k++)
            {
                nums[i++]=val;
            }
        }
    }
}