class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '(' || c == '{' || c == '[' ) { // open bracket detected
                stack.push(c);
            }
            
            if(c == ')' || c == '}' || c == ']' ) { // close bracket detected
                if(stack.isEmpty()) return false;
                
                char b = stack.pop();
                if(b != '(' && c == ')') return false;
                if(b != '{' && c == '}') return false;
                if(b != '[' && c == ']') return false;
            }
        }
        
        return stack.isEmpty();
    }
}