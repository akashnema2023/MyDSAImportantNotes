/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

/**
 *
 * @author akash
 */
public class PracticeArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int print : arr) {
            System.out.println(print);
        }
        System.out.println("below program is char ");
        String demo = "hello";
        char chara[] = demo.toCharArray();
        for (int i = 0; i <= chara.length - 1; i++) {
            if (chara[i] == 'h') {
                System.out.println("true");
            }
        }
        for (char c : chara) {
            if (c == 'h') {
                System.out.println("true");
            }
        }
//        System.out.println(chara[2]);
    }
}
