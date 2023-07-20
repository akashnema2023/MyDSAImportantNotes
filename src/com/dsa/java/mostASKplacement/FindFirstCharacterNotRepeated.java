/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

import java.util.HashMap;

/**
 *
 * @author akash
 */
public class FindFirstCharacterNotRepeated {

    public static void main(String[] args) {
        String inputString = "AABWCDEBFGDEFMC";
        method1(inputString);
        int result=method2(inputString);
        System.out.println(result);
       
    }
    public static void method1(String inputString){
         for (int i = 0; i < inputString.length(); i++) {
            boolean result = true;
            for (int j = 0; j < inputString.length(); j++) {
                if (i != j && inputString.charAt(i) == inputString.charAt(j)) {
                    result = false;
                    break;
                }
            }
            if (result) {
                System.out.println(inputString.charAt(i)+" Not Repeated value in the String and index found it "+i);
                break;
            }
        }
    }
    public static int method2(String inputString){
        char[] cha=inputString.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch : cha){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                int n=map.get(ch);
                map.put(ch, n+1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < cha.length; i++) {
         
            if(map.get(cha[i])==1){
                return i;
            }
        }
        return -1;
    }
}
