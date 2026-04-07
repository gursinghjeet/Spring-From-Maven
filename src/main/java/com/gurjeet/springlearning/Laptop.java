package com.gurjeet.springlearning;

public class Laptop implements Computer{

    public boolean compile(){
        System.out.println("Compilled");
        return true;
    }

    @Override
    public void computing() {
        this.compile();
    }
}
