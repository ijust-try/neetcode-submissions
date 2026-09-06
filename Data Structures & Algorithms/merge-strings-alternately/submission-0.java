class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder nw = new StringBuilder();

        int w1 = word1.length();
        int w2 = word2.length();
        int x = w2;

        if (w1 > w2) {
            x = w1;
        }

        for (int i = 0; i < x; i++) {

            if (i < w1) {
                nw.append(word1.charAt(i));
            }

            if (i < w2) {
                nw.append(word2.charAt(i));
            }
        }

        return nw.toString();
    }
}