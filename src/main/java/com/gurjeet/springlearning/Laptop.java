package com.gurjeet.springlearning;

public class Laptop implements Computer{

    static boolean compile(){
        System.out.println("Compilled");
        return true;
    }

    @Override
    public boolean computing() {
        return Laptop.compile();
    }
}
