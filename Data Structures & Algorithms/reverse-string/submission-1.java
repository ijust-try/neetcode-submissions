class Solution {
    public void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;
        char temp;

        while (r > l) {
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            r--;
            l++;
        }
    }
}