class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("+") ||
                tokens[i].equals("-") ||
                tokens[i].equals("*") ||
                tokens[i].equals("/")) {

                int secondNumber = stack.pop();
                int firstNumber = stack.pop();

                if (tokens[i].equals("+")) {
                    stack.push(firstNumber + secondNumber);
                } 
                else if (tokens[i].equals("-")) {
                    stack.push(firstNumber - secondNumber);
                } 
                else if (tokens[i].equals("*")) {
                    stack.push(firstNumber * secondNumber);
                } 
                else {
                    stack.push(firstNumber / secondNumber);
                }

            } 
            else {
                int number = Integer.parseInt(tokens[i]);
                stack.push(number);
            }
        }

        return stack.pop();
    }
}