package com.gurjeet.springlearning;

public class Alien {
    Computer com;
    int age;

    public Alien(int age, Computer com) {
        System.out.println("Alien Object created and age is " + age);
        com.computing();
        this.age = age;
        this.com = com;
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
