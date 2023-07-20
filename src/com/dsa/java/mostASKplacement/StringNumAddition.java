/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class StringNumAddition {

    public static void main(String[] args) {
        String str = "3he4ki7j";
        int sum = sumofString(str);
        System.out.println(sum);
        int sum1=secondmethod(str);
        System.out.println(sum1);
    }

    public static int sumofString(String str) {
        char[] arr = str.toCharArray();
        int sum = 0;
        String temp = "0";
        for (int i = 0; i <= arr.length - 1; i++) {
            char c = arr[i];
            if (Character.isDigit(c)) {
                temp += arr[i];
            } else {
                if (temp != "0") {
                    sum += Integer.parseInt(temp);
                    temp = "0";
                }
            }
        }
        return sum;
    }

    public static int secondmethod(String str) {
        char[] arr = str.toCharArray();
        int sum = 0;
        String temp = "0";
        for (int i = 0; i <= arr.length - 1; i++) {
            char c = arr[i];
            if (Character.isDigit(c)) {
                temp+=arr[i];
                sum += Integer.parseInt(temp);
                temp="0";
            }
        }
        return sum;
    }
}
