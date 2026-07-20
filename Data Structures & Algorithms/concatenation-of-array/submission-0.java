class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr = new int[2*nums.length];

        int p1 = 0;
        int p2 = nums.length;

        
                while(p1< nums.length){
                    arr[p1]= nums[p1];
                    arr[p2]=nums[p1];
                    
                    p1++;
                    p2++;
                }
            
        

        return arr;
    }
}