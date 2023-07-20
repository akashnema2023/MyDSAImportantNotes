/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.pattern;

/**
 *
 * @author akash
 */
public class Downwardtriangle {
    public static void main(String[] args) {
        int size=5;
        for(int i=0;i<=size;i++){
            for(int j=i;j<=size;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("__________________________"); 
        
        for(int i=0;i<=size;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=size;k>i;k--){
                System.out.print("*");
            }
            System.out.println(); 
                   
        }
             
        
        
    }
         
}
