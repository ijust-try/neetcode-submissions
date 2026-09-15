class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char currentCharacter = s.charAt(i);

            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
                stack.push(currentCharacter);
            } 
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char topCharacter = stack.peek();

                if ((currentCharacter == ')' && topCharacter != '(') ||
                    (currentCharacter == ']' && topCharacter != '[') ||
                    (currentCharacter == '}' && topCharacter != '{')) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}