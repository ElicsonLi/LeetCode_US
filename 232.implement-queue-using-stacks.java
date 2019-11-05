import java.util.Stack;

import sun.tools.jconsole.OutputViewer;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;
    /** Initialize your data structure here. */
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int x = peek();
        output.pop();
        return x;
        
    }
    
    /** Get the front element. */
    public int peek() {
        if(output.empty()){
            while(!input.empty()){
                int x = input.pop();
                output.push(x);
            }
        }
        return output.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.empty() && output.empty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

