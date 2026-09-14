class Solution {
    public int calPoints(String[] operations) {

        int sum=0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("C"))

            {
                list.remove(list.size()-1);
            }

            else if(operations[i].equals("D"))
            {
                int score = list.get(list.size()-1)*2;
                list.add(score);
            }
                

            else if(operations[i].equals("+"))
            {
                int score =list.get(list.size()-1)+list.get(list.size()-2);
                list.add(score);
            }

            else{
                int score = Integer.parseInt(operations[i]);
                list.add(score);
            }
                


        }

        for(int score:list)
        {
            sum+=score;
        }
        return sum;
        
    }
}