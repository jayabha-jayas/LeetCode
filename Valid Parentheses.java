class Solution {
    public boolean isValid(String s) {
        Stack<Character> charArray = new Stack();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                charArray.add(s.charAt(i));
                continue;
            }
            if (!charArray.empty()) {
             if (s.charAt(i) == ')' && charArray.peek() != '(') {
                return false;
            }
            else if (s.charAt(i) == ']' && charArray.peek() != '[') {
                return false;
            }
            else if (s.charAt(i) == '}' && charArray.peek() != '{') {
                return false;
            }
            else {
                charArray.pop();
            }   
            }
            else {
                return false;
            }
        }
        return charArray.isEmpty();
    }
}
