package com.company;

public class Main {
    public static void main (String [] args){
        Dog dog1 = new Dog();
        dog1.setAge(6);
        dog1.setBreed("Vivcharka");
        System.out.println(dog1.getAge());

        System.out.println(dog1.getBreed());

        dog1.setName("Mike");

        System.out.println(dog1.name);
    }
}
