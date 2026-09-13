class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {

            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));

            int length = r - l + 1;

            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}