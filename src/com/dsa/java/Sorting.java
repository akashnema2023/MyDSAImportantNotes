/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class Sorting {
    public static void main(String[] args) {
        int data[]={3,2,7,4,8,9} ,temp,i,j;
        for (i = 0; i <data.length ; i++) {
            for (j = i+1; j < data.length; j++) {
                if(data[i]<data[j]){
                 temp=data[i];
                 data[i]=data[j];
                 data[j]=temp;
                }
            }
            
        }
        for (int k = 0; k < data.length; k++) {
            System.out.println(data[k]);
        }
    }
}
