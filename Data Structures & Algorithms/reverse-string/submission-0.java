class Solution {
    public void reverseString(char[] s) {

        char[] revArr = new char[s.length];

        for (int i = 0; i < s.length; i++) {

            char[] chars = s;

            for (int j = s.length - 1; j >= 0; j--) {

                revArr[j] = chars[i];

                i++;
            }
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = revArr[i];
        }
    }
}