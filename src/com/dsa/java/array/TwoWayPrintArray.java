/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

/**
 *
 * @author akash
 */
public class TwoWayPrintArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        TwoWayPrintArray resultArray=new TwoWayPrintArray();
        resultArray.forEach(arr);
        resultArray.loopmethod(arr);
    }
    public void forEach(int arr[]){
                for(int printarr:arr){
                    System.out.println(printarr);   
                }
    }
    public void loopmethod(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
