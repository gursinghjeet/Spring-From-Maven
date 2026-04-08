package com.gurjeet.springlearning;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop Object created");
    }

    @Override
    public boolean computing() {
        System.out.println("Desktop Windows");
        return true;
    }
}
