package com.clouway;

import com.clouway.CustomExceptions.ListEmptyException;
import com.clouway.CustomExceptions.ListFullException;

import java.util.Stack;

public class StackOperator {
    private int length;
    private Stack<Object> stack = new Stack<>();

    /**
     * Constructor
     * @param length max length of stack
     */
    public StackOperator(int length) {
        this.length = length;
    }

    /**
     * Adds element on top of stack
     * @param object element being added
     * @throws ListFullException if stack is full
     */
    public void add(Object object) throws ListFullException {
        if(stack.size()<length)
            stack.add(object);
        else {
            throw new ListFullException("Stack is full");
        }
    }

    /**
     * Removes top element of stack
     * @throws ListEmptyException if stack has nothing to remove
     */
    public void remove() throws ListEmptyException {
        if(!stack.isEmpty())
            stack.pop();
        else
            throw new ListEmptyException("Stack is empty");
    }

    /**
     * Prints every element in stack
     */
    public void printAllElements(){
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }


}
