class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int r=0;
        int l=0;
        int sum=0;
        int minLen= Integer.MAX_VALUE;

        for(r=0; r<nums.length;r++)
        {
            sum+=nums[r];

            while(sum>=target)
            {
                int currLen = r-l+1;
                minLen=Math.min(minLen,currLen);
                sum-=nums[l];
                l++;
            }

        }

        if(minLen==Integer.MAX_VALUE)
            return 0;

        return minLen;

        
        
    }
}