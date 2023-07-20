/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class KnowAboutConstructor {

    public static void main(String[] args) {
        //first way to assent the value in the constructor using parameters.
        CheckConstructor p1 = new CheckConstructor();
        int result = p1.pAdditionMethod1();
        System.out.println(result);
        //second way to assenting the value in the constructor.
        int result2 = new CheckConstructor().pMultiplyMethod1(2, 3);
        System.out.println(result2);
        //thired way to assent the value in the constructor
        CheckConstructor objCheckConstructor = new CheckConstructor();
        objCheckConstructor.setAvalue(70);
        int result3 = objCheckConstructor.getAvalue();
        System.out.println("A is " + result3);

        //whenever we create the object of the class that have a default constructor it would be called first...
        System.out.println("if creating the object only");
        CheckConstructor testingCheckConstructor = new CheckConstructor();

    }
}

class CheckConstructor {

    int a;
    int b;

    public CheckConstructor() {
//        System.out.println("Default constructor is called...");
        this(20,30);
    }

    public CheckConstructor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setAvalue(int a) {
        this.a = a;
    }
   
    public int getAvalue() {
        return a;
    }

    public void printpclass() {
        System.out.println(a + " " + b);
    }

    public int pAdditionMethod1() {
        return a + b;
    }

    public int pMultiplyMethod1(int a, int b) {
        return a * b;
    }
}
