class Solution {
    public boolean isValid(String S) {
        Deque<Character> stack = new ArrayDeque<Character>();
        
        for(char c : S.toCharArray())  {
            if(stack.size() >= 2 && c == 'c' && stack.peek() == 'b') {
                stack.pop();
                stack.pop();
            } else stack.push(c);
        }
        
        return stack.isEmpty();
    }
}