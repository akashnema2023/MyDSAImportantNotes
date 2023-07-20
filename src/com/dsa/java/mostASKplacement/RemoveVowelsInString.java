/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author akash
 */
public class RemoveVowelsInString {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        Set<Character> vowelsSet=Set.of('a','e','i','o','u');
        StringBuffer sb=new StringBuffer();
        String inpString="what is your name?";
        
        char charr[]=inpString.toCharArray();
        for(char ch : charr){
            if(!vowelsSet.contains(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
