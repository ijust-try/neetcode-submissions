class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int threshold = nums.length / 3;
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if (map.get(num) == threshold + 1) {
                arr.add(num);
            }
        }

        return arr;
    }
}