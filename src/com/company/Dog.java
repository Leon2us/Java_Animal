package com.company;

import java.util.Scanner;

public class Dog {
    int age;
    String breed;
    String name;
    private String color;
    double height;
    double weight;

    public Dog(String name, String breed, String color, int age, double height, double weight){
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Dog(){

    }

    public void setBreed (String s){
        this.breed = s;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        this.age = a;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double a){
        this.height = a;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double a){
        this.weight = a;
    }

    public void sayHello(){
        System.out.println("Woof, woof!");
    }

    public String sayAboutUrself(String s){
        return s;
    }
}