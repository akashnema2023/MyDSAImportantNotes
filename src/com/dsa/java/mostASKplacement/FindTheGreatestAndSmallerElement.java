/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class FindTheGreatestAndSmallerElement {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        int[] arr={10,20,30,2,80,90};
        int max=arr[0];
        int min=arr[0];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
                if(max<arr[i]){
                    max=arr[i];
                }  
        }
        for (int i = 0; i < arr.length; i++) {
                if(min>arr[i]){
                    min=arr[i];
                }  
        }
        System.out.println("result is "+max+", "+min);
    }
}
