class Solution {
    public int[] replaceElements(int[] arr) {
        
        int [] num = new int[arr.length];
        
        //int bn,cn;

        for(int i=0;i<arr.length-1;i++)
        {
            int greatest = arr[i+1];

            for(int j=i+1; j<arr.length;j++)
            {
            
                    if(arr[j]>greatest)
                    {
                        greatest = arr[j];
                    }
                
            }

            num[i]=greatest;
        }

        num[arr.length-1]=-1;

        return num;
    }
}