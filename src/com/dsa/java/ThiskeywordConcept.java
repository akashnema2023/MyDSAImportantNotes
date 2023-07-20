/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class ThiskeywordConcept {
    
    public static void main(String[] args) {
//        UnderStandDupicate objStand=new UnderStandDupicate(20, 40);
//        System.out.println("Result : "+objStand.sum());

        UnderStandConstructor objConstructor = new UnderStandConstructor(20);
    }
}

class UnderStandDupicate {
    
    int a;
    int b;
    
    public UnderStandDupicate(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int sum() {
        return a + b;
    }
}

class UnderStandConstructor {
    
    public void testingmethod() {
        System.out.println("helloworld");
    }

    public UnderStandConstructor(int x, int y, int z) {
        System.out.println("X : " + x + " ,Y : " + y + " , Z : " + z + " = " + (x + y + z));
    }

    public UnderStandConstructor(int x, int y) {
        this(x, y, 10);
        System.out.println("X : " + x + " ,Y : " + y + " = " + (x + y));
    }
    
    public UnderStandConstructor(int x) {
        this(x, 10);//this method is used to call constructor
        this.testingmethod();//bydefault use no need to write this.
        System.out.println("x value is : " + x);
    }
    
}
