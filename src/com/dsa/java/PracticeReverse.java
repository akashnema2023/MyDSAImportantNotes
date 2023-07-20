/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class PracticeReverse {
    public static void main(String[] args) {
        String str="helloworld";
        char[] ch=str.toCharArray();
        char[] temp=new char[ch.length];
        int count=0;
        for(int i=ch.length-1;i>=0;i--){
            temp[count]=ch[i];
            count++;
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]);
        }
    }
}
