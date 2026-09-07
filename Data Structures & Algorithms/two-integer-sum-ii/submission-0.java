class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l=0;
        int r= numbers.length-1;
        int [] arr= new int[2];
        
        while(r>l)
        {
            if(numbers[r]+numbers[l]==target)
            {
                return new int[]{l+1,r+1};
            }

            else if(numbers[l]+numbers[r]<target)
            l++;

            else
            r--;
        }

        return new int[]{};
        
    }
}
