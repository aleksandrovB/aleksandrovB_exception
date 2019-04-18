package com.clouway;

import com.clouway.CustomExceptions.ListEmptyException;
import com.clouway.CustomExceptions.ListFullException;

public class Main {

    public static void main(String[] args) {
        ListOperator listOperator = new ListOperator(4);
        try {
            listOperator.remove();
        } catch (ListEmptyException e) {
            e.printStackTrace();
        }
        for(int i = 0 ; i<6 ; i++){
            try {
                listOperator.add(String.valueOf(i));
            } catch (ListFullException e) {
                e.printStackTrace();
            }
        }

            StackOperator stackOperator = new StackOperator(5);

        try {
            stackOperator.remove();
        } catch (ListEmptyException e) {
            e.printStackTrace();
        }
        for(int i = 0 ; i<6 ; i++){
                try {
                    stackOperator.add(i);
                } catch (ListFullException e) {
                    e.printStackTrace();
                }
            }
            stackOperator.printAllElements();

        try {
            new SumStrings().sum("", null);
        } catch (NullPointerException | NumberFormatException e){
            e.printStackTrace();
        }
    }
}
