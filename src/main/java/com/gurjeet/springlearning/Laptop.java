package com.gurjeet.springlearning;

public class Laptop implements Computer{

    public Laptop() {
        System.out.println("Laptop Object created");
    }

    static boolean compile(){
        System.out.println("Compilled from Laptop");
        return true;
    }

    @Override
    public boolean computing() {
        return Laptop.compile();
    }
}
