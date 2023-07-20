/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stringpro;

/**
 *
 * @author akash
 */
public class SomeStringMethods {
    public static void main(String[] args) {
        String str1="hello";
        String str2="";
        System.out.println(str1);
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(1, 4));
        System.out.println(str1.concat("world"));
        str2= str2.concat(str1.substring(1,3));
        System.out.println(str2);
    }
}
