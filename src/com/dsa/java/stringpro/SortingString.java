/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stringpro;

/**
 *
 * @author akash
 */
public class SortingString {
    public static void main(String[] args) {
        String str="rock";
        char arr[]=str.toCharArray();
        for(int i=0;i<=arr.length-1;i++){
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
                     
        }
         for(int i=0;i<=arr.length-1;i++){
             System.out.print(arr[i]);
         }
         System.out.println("");
    }
}
