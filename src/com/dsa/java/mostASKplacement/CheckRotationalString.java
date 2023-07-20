/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class CheckRotationalString {
    public static void main(String[] args) {
        System.out.println(isRotational("abcde", "cdeab"));
    }
    public static boolean isRotational(String str,String rotationString){
        if (str==null||rotationString==null) {
            return false;
        }else{
            String concatinateString=str+str;
            return concatinateString.contains(rotationString);
        }
    }
}
