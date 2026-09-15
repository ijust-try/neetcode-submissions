
class Solution {
    public String simplifyPath(String path) {

        Stack<String> s = new Stack<>();

        String[] directories = path.split("/");

        for (int i = 0; i < directories.length; i++) {

            if (directories[i].equals("") || directories[i].equals(".")) {
                continue;
            }

            else if (directories[i].equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            }

            else {
                s.push(directories[i]);
            }
        }

        String result = "";

        while (!s.isEmpty()) {
            result = "/" + s.pop() + result;
        }

        if (result.equals("")) {
            return "/";
        }

        return result;
    }
}