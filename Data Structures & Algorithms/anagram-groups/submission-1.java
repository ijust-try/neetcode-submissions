class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>>map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] characters= strs[i].toCharArray();

            Arrays.sort(characters);

            String key = new String(characters);

            if(!map.containsKey(key))
            {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                map.put(key,group);
            }

            else
            {
                map.get(key).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());
    }
}
