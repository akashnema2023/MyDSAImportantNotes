/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class FindMinimumElement {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,9,1};
        int mid=arr[0];
//        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(mid<arr[j]){
                    
                }else{
                    mid=arr[j];
                }
            }
//        }
        System.out.println(mid);
    }
}
