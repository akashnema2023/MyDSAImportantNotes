/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stringpro;

/**
 *
 * @author akash
 */
public class CountString {

    public static void main(String[] args) {
        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        int result = new CountString().getlength(str);
        System.out.println("length of the string " + result);
    }

    public int getlength(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            count++;
        }
        return count;
    }
}
