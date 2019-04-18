package com.clouway;

import com.clouway.CustomExceptions.InputOutOfBoundsException;

import java.util.Scanner;

public class ConsoleReaderInBounds {
    public ConsoleReaderInBounds() {
    }

    /**
     * Reads from console, parses it to int and compares it to leftBound and rightBound
     * Breaks if console input is not parsable integer or input is out of bounds
     * @param leftBound lower border
     * @param rightBound higher border
     * @throws InputOutOfBoundsException input is outside borders
     */
    public void readInBounds(int leftBound, int rightBound, String terminationString) throws InputOutOfBoundsException {
        Scanner scan = new Scanner(System.in);
        try {
            String nextLine;
            int input;
            do {
                nextLine = scan.nextLine();
                if (nextLine.equals(terminationString))
                    break;
                input = Integer.parseInt(nextLine);
                System.out.println(input);
            } while (leftBound <= input && input <= rightBound);
            if (!nextLine.equals(terminationString))
                throw new InputOutOfBoundsException("Number is out of bounds");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " is not a parsable integer");
        }

    }

    /**
     * Reads from console, parses it to int and compares it to leftBound and rightBound
     * Stops reading when "stop" is submitted
     * @param leftBound lower border
     * @param rightBound higher border
     */
    public void anotherReadInBounds(int leftBound, int rightBound, String terminationString) {
        Scanner scan = new Scanner(System.in);
        String nextLine;
        int input;
        do {
            nextLine = scan.nextLine();
            try {
                input = Integer.parseInt(nextLine);
                if(leftBound > input || input > rightBound){
                    throw new InputOutOfBoundsException("Input is out of bounds");
                }else
                    System.out.println(input);
            }catch (InputOutOfBoundsException e){
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                if(!nextLine.equals(terminationString))
                    System.out.println(e.getMessage() + " is not a parsable integer");
            }
        }while (!nextLine.equals(terminationString));

    }
}
