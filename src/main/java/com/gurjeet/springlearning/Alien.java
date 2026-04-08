package com.gurjeet.springlearning;

public class Alien {
    private Computer com;
    private int age;

    public Alien() {
        System.out.println("Alien Object created and age is " + this.age);
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code() {

        if(com.computing()) System.out.println("Coding...");
    }
}
