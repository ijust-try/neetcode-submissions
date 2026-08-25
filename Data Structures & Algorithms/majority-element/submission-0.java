class Solution {
    public int majorityElement(int[] nums) {

        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int key = nums[i];
           
            if(!map.containsKey(key))
            {
               map.put(key,1);
            }

            else
            {
                map.put(key,map.get(key)+1);
            }
        }

        for(int key: map.keySet())
        {
            if(map.get(key)>nums.length/2)
            {
                return key;
            }
        }
        return -1;
    }
}