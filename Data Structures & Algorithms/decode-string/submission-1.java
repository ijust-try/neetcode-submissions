
class Solution {
    public String decodeString(String s) {

        String op = "";

        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int number = 0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                number = 0;

                while (Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i--;
            }

            else if (s.charAt(i) == '[') {

                numberStack.push(number);
                stringStack.push(op);

                op = "";
            }

            else if (s.charAt(i) == ']') {

                int repeat = numberStack.pop();
                String previousString = stringStack.pop();

                String repeatedString = "";

                for (int j = 0; j < repeat; j++) {
                    repeatedString = repeatedString + op;
                }

                op = previousString + repeatedString;
            }

            else {
                op = op + s.charAt(i);
            }
        }

        return op;
    }
}