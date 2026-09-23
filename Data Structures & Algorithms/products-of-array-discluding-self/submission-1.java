class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;

        int[] pre= new int[n];
        int []suf= new int[n];

        int prod=1;

        for(int i=0;i<n;i++)
        {
            pre[i]= prod;
            prod*= nums[i];
        }

        prod=1;

        for(int i=n-1;i>=0;i--)
        {
            suf[i]=prod;
            prod*= nums[i];
        }

        int []op = new int[n];

        for(int i=0;i<n;i++)
        {
            op[i]=pre[i]*suf[i];
        }

        return op;
    }
}  
