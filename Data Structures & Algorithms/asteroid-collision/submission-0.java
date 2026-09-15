class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        

        for(int i=0;i<asteroids.length;i++)
        {
            stack.push(asteroids[i]);

            while(stack.size()>1)
            {
                int cur= stack.peek();
                int prev= stack.get(stack.size()-2);
                
                if(prev>0 && cur< 0)
                {
                    if(Math.abs(cur)==Math.abs(prev))
                    {
                        stack.pop();
                        stack.pop();
                    }

                    else if(Math.abs(prev)>Math.abs(cur))
                    {
                        stack.pop();
                    }

                    else{
                        stack.remove(stack.size()-2);
                    }
                }

                else
                    break;   

            }

        }

        int[] result = new int[stack.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
        

       
    }
}