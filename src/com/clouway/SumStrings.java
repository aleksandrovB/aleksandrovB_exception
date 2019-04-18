package com.clouway;

public class SumStrings {
    public SumStrings() {
    }

    /**
     * Sums two numbers
     * Rethrows possible exceptions with new message
     * @param a first number
     * @param b second number
     * @return float result casted to string
     */
    public String sum(String a, String b) {
        String result;
        try {
            result = String.valueOf(Float.parseFloat(a) + Float.parseFloat(b));
        } catch (NumberFormatException e){
            throw new NumberFormatException(e.getMessage()+" is not a parsable float");
        } catch (NullPointerException e){
            throw new NullPointerException(String.format("a = %s and b = %s cannot be null",a,b));
        }
        return result;

    }
}
