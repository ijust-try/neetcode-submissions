class Solution {
    public boolean isPalindrome(String s) {

        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int r= s.length()-1;
        int l=0;

        while(r>l)
        {
            if(s.charAt(r)!=s.charAt(l))
            {
                return false;
            }

            r--;
            l++;
        }

        return true;
    }
}
