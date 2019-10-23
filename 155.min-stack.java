import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
class MinStack {
    /* use two stacks cost too much time and memory*/
    /*
    private int min;
    private Stack<Integer> sk;
    private Stack<Integer> ms;
    /** initialize your data structure here. 
    public MinStack() {
        min = Integer.MAX_VALUE;
        sk = new Stack<>();
        ms = new Stack<>();
    }
    
    public void push(int x) {
        min = min < x ? min : x;
        ms.push(min);
        sk.push(x);
    }
    
    public void pop() {
        sk.pop();
        ms.pop();
        if(!ms.empty()){
            min = ms.peek();
        }else{
            min = Integer.MAX_VALUE;
        }
        
    }
    
    public int top() {
        return sk.peek();
    }
    
    public int getMin() {
        return min;
    }
    */

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

