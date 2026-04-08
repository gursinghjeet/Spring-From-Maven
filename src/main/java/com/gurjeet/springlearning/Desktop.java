package com.gurjeet.springlearning;

public class Desktop implements Computer {
    @Override
    public boolean computing() {
        System.out.println("Desktop Windows");
        return true;
    }
}
