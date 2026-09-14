class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();

        // Store frequency of characters required from t
        for (int i = 0; i < t.length(); i++) {
            if (mapt.containsKey(t.charAt(i))) {
                mapt.put(t.charAt(i), mapt.get(t.charAt(i)) + 1);
            } else {
                mapt.put(t.charAt(i), 1);
            }
        }

        int l = 0;
        int have = 0;
        int need = mapt.size();

        int minLength = Integer.MAX_VALUE;
        int bestLeft = 0;

        for (int r = 0; r < s.length(); r++) {

            // Add s[r] to the current window
            if (maps.containsKey(s.charAt(r))) {
                maps.put(s.charAt(r), maps.get(s.charAt(r)) + 1);
            } else {
                maps.put(s.charAt(r), 1);
            }

            // A required character has now reached its required frequency
            if (mapt.containsKey(s.charAt(r))
                    && maps.get(s.charAt(r)).equals(mapt.get(s.charAt(r)))) {
                have++;
            }

            // Current window contains everything required
            while (have == need) {

                int currentLength = r - l + 1;

                if (currentLength < minLength) {
                    minLength = currentLength;
                    bestLeft = l;
                }

                // Remove s[l] from the window
                if (maps.get(s.charAt(l)) == 1) {
                    maps.remove(s.charAt(l));
                } else {
                    maps.put(s.charAt(l), maps.get(s.charAt(l)) - 1);
                }

                // Removing this character made the window invalid
                if (mapt.containsKey(s.charAt(l))
                        && maps.getOrDefault(s.charAt(l), 0) < mapt.get(s.charAt(l))) {
                    have--;
                }

                l++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(bestLeft, bestLeft + minLength);
    }
}