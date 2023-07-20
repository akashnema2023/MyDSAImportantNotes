/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class ConvertStringToIntegerAndIntegerToString {
    public static void main(String[] args) {
        //Integer to String
        int num=12345;
        String wayString1=Integer.toString(num);
        String wayString2=String.valueOf(num);
        System.out.println("Integer to String");
        System.out.println("wayString1 is "+wayString1+", "+"wayString2 is "+wayString2);
        //String to Integer
        String num1="12345";
        int wayInteger1=Integer.parseInt(num1);
        int wayInteger2=Integer.valueOf(num1);
        int sum=wayInteger1+1;
        System.out.println("Way 1 is "+wayInteger1+", "+"Way 2 is "+wayInteger2+", sum is "+sum);
        
    }
}
