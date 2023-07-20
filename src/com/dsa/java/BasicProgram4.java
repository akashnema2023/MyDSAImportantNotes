/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class BasicProgram4 {
    public static void main(String[] args) {
        newClass demoClass=new newClass();
        demoClass.testing();
    }
    
}
class oldclass{//super class,base class,father
    int a=200;
}
class newClass extends oldclass{//sub class,drived class,child
    int a=100;
     public void testing()
     {
         System.out.println("result is "+a);
         System.out.println("result is "+super.a);
     }
             
}
