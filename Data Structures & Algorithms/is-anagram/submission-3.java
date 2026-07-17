class Solution {
    public boolean isAnagram(String s, String t) {

        char [] arrs= s.toCharArray();
        char [] arrt =t.toCharArray();

        Arrays.sort(arrs);
        Arrays.sort(arrt);

        if (arrs.length!= arrt.length)
        return false;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(arrs[i]==arrt[i]){
                c++;
            }

        }
        if(c==arrs.length)
        return true;

        else
        return false;
    }
}
