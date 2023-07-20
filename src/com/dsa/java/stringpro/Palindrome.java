/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stringpro;

/**
 *
 * @author akash
 */
public class Palindrome {
    public static void main(String[] args) {
        String strtest="nitin";
        boolean result=new Palindrome().isPalindrom(strtest);
        System.out.println("Result  is "+result);
        
    }
    public boolean isPalindrom(String str){
        char charArr[]=str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(charArr[start]!=charArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
