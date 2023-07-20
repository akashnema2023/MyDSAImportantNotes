/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class ReverseIntergerNumber {

    public static void main(String[] args) {
        method1();
        int result=method2(-1234);
        System.out.println(result);
    }

    public static void method1() {
        int num = 1234;
        String numString = "";

        while (num > 10) {
            numString += Integer.toString(num % 10);
            num = num / 10;
        }
        numString += Integer.toString(num);
        int result = Integer.parseInt(numString);
        System.out.println(result);
    }

    public static int method2(int num) {
        boolean isNegative = num < 0;
        if (isNegative) {
            num = num * -1;
        }
        String numString = "";
        while (num > 10) {
            numString += Integer.toString(num % 10);
            num = num / 10;
        }
         numString += Integer.toString(num);
         int result = Integer.parseInt(numString);
         return isNegative?result*-1:result;
    }
}
