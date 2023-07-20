/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class UseStaticKeword {

    //static method
    static int cube(int x) {
        return x * x * x;
    }
    

    public static void main(String args[]) {
        int result = cube(5);//use of the static method
        System.out.println(result);
    }
}
