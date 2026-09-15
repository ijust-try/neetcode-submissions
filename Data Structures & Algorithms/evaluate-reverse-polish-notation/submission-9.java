class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+"))
            {
                int prev= stack.pop();
                int prev2= stack.pop();
                int sum = prev+ prev2;
                stack.push(sum);
            }

            else if(tokens[i].equals("*"))
            {
                int prev= stack.pop();
                int prev2= stack.pop();
                int mul = prev* prev2;
                stack.push(mul);                
            }
            
            else if(tokens[i].equals("-"))
            {
                int prev= stack.pop();
                int prev2= stack.pop();
                int sub = prev2- prev;
                stack.push(sub);                
            }
            else if(tokens[i].equals("/"))
            {
                int prev= stack.pop();
                int prev2= stack.pop();
                int div = prev2 / prev;
                stack.push(div);                
            }

            else{
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            }

        }
        int res=0;
        while(!stack.isEmpty())
            res=stack.pop();
        
        return res;
    }
}
