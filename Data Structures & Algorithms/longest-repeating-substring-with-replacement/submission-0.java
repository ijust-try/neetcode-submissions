class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int l=0, r=0;
        int maxFreq=0, maxLen=0;

        for( r=0;r<s.length();r++)
        {
            if( map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r))+1);

            }
                
            
            else
            {
                map.put(s.charAt(r),1);
            }

            maxFreq= Math.max(maxFreq,map.get(s.charAt(r)));

            while(r-l+1-maxFreq>k)
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }

            int currLen = r-l+1;
            maxLen= Math.max(maxLen,currLen);
        }


       return maxLen; 
    }
}
