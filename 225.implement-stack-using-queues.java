import java.util.LinkedList;

/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start
class MyStack {
    LinkedList<Integer> ll = new LinkedList<>();
    int size;
    /** Initialize your data structure here. */
    public MyStack() {
        size = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        ll.addLast(x);
        size ++;
        
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        size --;
        return ll.removeLast();
        
    }
    
    /** Get the top element. */
    public int top() {
        return ll.getLast();
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

