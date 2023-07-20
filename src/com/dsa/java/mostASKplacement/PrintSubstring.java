/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class PrintSubstring {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        String inputString="abc";
        for(int i=0;i<= inputString.length()-1;i++){
            for(int j=i+1;j<=inputString.length();j++){
                String subString=inputString.substring(i, j);
                System.out.println(subString);
            }
        }
    }
}