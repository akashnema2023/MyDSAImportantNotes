/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        String inputString="sandeep";
        char ch[]=inputString.toCharArray();
        int i=0;
        int vowels=0;
        int consonants=0;
        while(ch.length>i){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                vowels++;
            }else{
                consonants++;
            }
            i++;
        }
        System.out.println("Vowels = "+vowels+" Consonants = "+consonants);
    }
}
