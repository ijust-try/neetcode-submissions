class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length())
            return false;

        HashMap<Character,Integer>map1 = new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();

            int l=0;
            int r= l+s1.length()-1;
        
        
        for(int i=0;i<s1.length();i++)
        {
            if(map1.containsKey(s1.charAt(i)))
                map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);

            else
                map1.put(s1.charAt(i),1);
        }
        

        for(int i=l;i<=r;i++)
        {
            if(map2.containsKey(s2.charAt(i)))
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);

            else
                map2.put(s2.charAt(i),1);
        }

        while(r+1<s2.length())

        {
        
        if(map1.equals(map2))
            return true;
        
        else{
                if(map2.get(s2.charAt(l))==1)
                    map2.remove(s2.charAt(l));
                
                else
                
                 map2.put(s2.charAt(l),map2.get(s2.charAt(l))-1);

            r++;
            l++;
            if (map2.containsKey(s2.charAt(r))) {
                map2.put(s2.charAt(r), map2.get(s2.charAt(r)) + 1);
            } 
            
            else {
                map2.put(s2.charAt(r), 1);
            }
           
        }

        }

        return map1.equals(map2);
    }
}
