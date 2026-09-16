class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r= nums.length-1;
        int mid= (l+r)/2;

        while(l<=mid && r>=mid)
        {
            if(nums[mid]>target)
            {
                if(nums[l]!=target)
                     ++l;
                else
                    return l;
            }

            else
            {
                if(nums[r]!=target)
                    r--;
                else
                    return r;
            }
        }
        return -1;
        
    }
}
