/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class NegativeNumberStartFirst {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        int arr[]={-1,-20,90,30,-8,40};
        int temp[]=new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                temp[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                temp[j]=arr[i];
                j++;
            }
        }
        for( int result : temp){
            System.out.print(result+" ");
        }
    }
}
