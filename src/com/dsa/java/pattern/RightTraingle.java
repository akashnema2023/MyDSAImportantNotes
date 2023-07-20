/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.pattern;

/**
 *
 * @author akash
 */
public class RightTraingle {

    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i <size; i++) {
            for (int j = 1; j < size - i; j++) {
                System.out.print("1");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
