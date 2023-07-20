/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class StringConvertToCharacter {
    public static void main(String[] args) {
        String str="hellodeveloper";
        char[] cha=str.toCharArray();//Whole String converted to the character array.
        System.out.println(cha[4]);
        
        char cha1=str.charAt(0);//specific string converted to the character.
        System.out.println(cha1);
    }
}
