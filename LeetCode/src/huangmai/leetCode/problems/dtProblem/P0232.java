package huangmai.leetCode.problems.dtProblem;

import java.util.Stack;

public class P0232{
    private Stack<Integer> s1, s2;
    public P0232(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    // Push element x to the back of queue.
    public void push(int x) {
        s1.push(x);
    }
    
    private void turn(){
        if(s2.empty()){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        turn();
        s2.pop();
    }

    // Get the front element.
    public int peek() {
        turn();
        return s2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}
