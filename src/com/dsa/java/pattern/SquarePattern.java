/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.pattern;

/**
 *
 * @author akash
 */
public class SquarePattern {

    public static void main(String[] args) {
        int size = 5;

        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size; j++) {
                if (i == 0 || i == size - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == size - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
