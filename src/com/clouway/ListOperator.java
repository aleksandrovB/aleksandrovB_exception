package com.clouway;

import com.clouway.CustomExceptions.ListEmptyException;
import com.clouway.CustomExceptions.ListFullException;

import java.util.LinkedList;
import java.util.List;

public class ListOperator {
    private int maxLength;
    private List<Object> list = new LinkedList<>();

    /**
     * Constructor
     * @param length maximum length of list
     */
    public ListOperator(int length) {
        this.maxLength = length;
    }

    /**
     * Getters and setters
     */
    public int getMaxLength() {return maxLength;}
    public void setMaxLength(int maxLength) {this.maxLength = maxLength;}

    /**
     * Adds object at the end of list
     * @param object object being added
     * @throws ListFullException if list is full
     */
    public void add(Object object) throws ListFullException {
        if(list.size()< maxLength)
            list.add(object);
        else {
            throw new ListFullException("List is full");
        }
    }

    /**
     * Removes last element from list
     * @throws ListEmptyException if list has nothing to remove
     */
    public void remove() throws ListEmptyException {
        try {
            list.remove(list.size()-1);
        } catch (IndexOutOfBoundsException e){
            throw new ListEmptyException("List is empty");
        }
    }

    /**
     * Prints every element contained in list
     */
    public void printAllElements(){
        for (Object ob:list) {
            System.out.println(ob);
        }
    }


}
