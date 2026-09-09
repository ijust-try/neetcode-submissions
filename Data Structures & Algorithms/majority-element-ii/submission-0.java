class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int t= nums.length/3;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i <nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }

            else{
                map.put(nums[i],map.get(nums[i])+1);
            }

        }

        for(Integer key: map.keySet())
        {
            if(map.get(key)> t)
            {
                res.add(key);
            }
        }
        

        return res;
        
    }
}