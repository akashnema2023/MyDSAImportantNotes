/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class IsvalidSequence {
    public static void main(String[] args) {
        String inputString1="abcde";
        String inputString2="aec";
        boolean result=isValid(inputString1, inputString2);
        System.out.println("Result is "+result);
    }
    public static boolean isValid(String str,String seq){
        int i=0;
        int j=0;
        char ch1[]=str.toCharArray();
        char ch2[]=seq.toCharArray();
        while(i<str.length()&&j<seq.length()){
            if(ch1[i]==ch2[j]){
                j++;
            }
            i++;
        }
        return j==seq.length();
    }
}
