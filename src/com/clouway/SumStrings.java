package com.clouway;

public class SumStrings {
    public SumStrings() {
    }

    public String sum(String a, String b){
        String result = null;
        try {
            result = String.valueOf(Float.parseFloat(a) + Float.parseFloat(b));
        } catch (NumberFormatException e){
            System.err.println(e.getMessage()+" is not a parsable float");
        } catch (NullPointerException e){
            System.err.println("Input cannot be null");
        }
        return result;
    }
}
