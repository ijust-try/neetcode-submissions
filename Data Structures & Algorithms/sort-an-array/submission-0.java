class Solution {
    public int[] sortArray(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count how many times each number appears
        for(int i = 0; i < nums.length; i++)
        {
            int key = nums[i];

            if(!map.containsKey(key))
            {
                map.put(key, 1);
            }
            else
            {
                map.put(key, map.get(key) + 1);
            }
        }

        // Create an array containing all distinct keys
        int[] keys = new int[map.size()];

        int index = 0;

        for(int key : map.keySet())
        {
            keys[index] = key;
            index++;
        }

        // Sort the keys using Bubble Sort
        for(int i = 0; i < keys.length - 1; i++)
        {
            for(int j = 0; j < keys.length - 1 - i; j++)
            {
                if(keys[j] > keys[j + 1])
                {
                    int temporary = keys[j];
                    keys[j] = keys[j + 1];
                    keys[j + 1] = temporary;
                }
            }
        }

        // Put each key back into nums according to its frequency
        int position = 0;

        for(int i = 0; i < keys.length; i++)
        {
            int key = keys[i];
            int count = map.get(key);

            for(int j = 0; j < count; j++)
            {
                nums[position] = key;
                position++;
            }
        }

        return nums;
    }
}