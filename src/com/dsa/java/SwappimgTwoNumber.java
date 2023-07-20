/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class SwappimgTwoNumber {
    public static void main(String[] args) {
        int arr[]={22,44,33,55,66};
        int temp=arr[2];
        arr[2]=arr[1];
        arr[1]=temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" ___________________");
        for(int te : arr){
            System.out.print(te);
        }
        
    }
}
