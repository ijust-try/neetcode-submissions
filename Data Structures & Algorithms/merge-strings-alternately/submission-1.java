class Solution {
    public String mergeAlternately(String word1, String word2) {

        int w1=0;
        int w2=0;

        int x= word1.length()+word2.length();

        StringBuilder nw = new StringBuilder();

        for(int i=0;i<x;i++)
        {
            if(w1<word1.length())
            nw.append(word1.charAt(w1));

            if(w2<word2.length())
            nw.append(word2.charAt(w2));

            w1++;
            w2++;
        }

        return nw.toString();
         
    }
}