/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stringpro;

/**
 *
 * @author akash
 */
public class PrintCharacterANDString {

    public static void main(String[] args) {
        String str = "hello";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        
        
        
        
        String demoString = "abcd";
        char ar[] = demoString.toCharArray();
        System.out.println(ar[3]);

        System.out.println(demoString);
        for (char i : demoString.toCharArray()) {
            if (i == 'c') {
                System.out.println("true,"+i+" is Present");
            }
            System.out.println("All Elements are : "+i);
        }
        for(int i=0;i<str.length()-1;i++){
            if('c'==ar[i]){
                System.out.println("true,"+ar[i]+" is present index : "+i);
            }
        }
    }
}
