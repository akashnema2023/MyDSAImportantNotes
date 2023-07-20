/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stringpro;

/**
 *
 * @author akash
 */
public class FindFirstCharacterNotRepeated {

    public static void main(String[] args) {
        String inputString = "AABCDEBFGDEFMC";
        for (int i = 0; i < inputString.length(); i++) {
            boolean result = true;
            for (int j = 0; j < inputString.length(); j++) {
                if (i != j && inputString.charAt(i) == inputString.charAt(j)) {
                    result = false;
                    break;
                }
            }
            if (result) {
                System.out.println(inputString.charAt(i)+" Not Repeated value in the String ");
                break;
            }
        }
    }
}
