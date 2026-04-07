package com.gurjeet.springlearning;

public class Alien {

    Laptop lap;
    Desktop desk;
    int age;

    public void setDesk(Computer desk) {
        this.desk = (Desktop) desk;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLap(Computer lap) {
        this.lap = (Laptop) lap;
    }

    public void code(){
        if(lap.compile()) System.out.println("Coding...");
    }
}
