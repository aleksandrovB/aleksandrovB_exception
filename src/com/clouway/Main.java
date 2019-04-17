package com.clouway;

public class Main {

    public static void main(String[] args) {
        SumStrings smstr = new SumStrings();
        System.out.println(smstr.sum("2","3.123a"));
        System.out.println(smstr.sum("3",null));

    }
}
