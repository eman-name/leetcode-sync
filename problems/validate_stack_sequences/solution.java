class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        int j = 0; // track pop index
        for(int x: pushed) {
            stack.push(x);
            while(!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        
        return j == popped.length;
    }
}