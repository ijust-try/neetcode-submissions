class Solution {
    public String longestPalindrome(String s) {

        char [] chars = s.toCharArray();
        //char [] ch = new char[s.length()];
        int longestStart=0;
        int longestLen=1;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int left=i;
                int right= j;
                
                boolean isPal = true;
                while(left<right){
                    if(chars[left]!=chars[right]){
                        isPal = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if(isPal){
                    int currentLen =j-i+1;

                    if(currentLen >longestLen){
                        longestLen =currentLen;
                        longestStart=i;
                    }
                }

            }
        }

        return s.substring(longestStart, (longestStart+longestLen));
        
    }
}
