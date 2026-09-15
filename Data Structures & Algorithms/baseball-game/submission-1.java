class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();


        for(int i=0;i<operations.length;i++)

        {

            if(operations[i].equals("C"))
            {
                stack.pop();
            }

            else if(operations[i].equals("D"))
            {
                stack.push(stack.peek()*2);
            }

            else if(operations[i].equals("+"))
            {
                int prevscore = stack.peek();
                int secScore= stack.get(stack.size()-2);

                stack.push(prevscore+secScore);
            }
            else{
                int score = Integer.parseInt(operations[i]);
                stack.push(score);
            }
        }

        int sum=0;

        while(!stack.isEmpty())
        {
            sum+= stack.pop();
        }

        return sum;
        
    }
}