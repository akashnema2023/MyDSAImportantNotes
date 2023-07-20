/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class ProductExceptSelf {
    public static void main(String[] args) {
        exceptProduct();
    }
    public static void exceptProduct(){
        int arr[]={1,2,3,4};
        int temp[]=new int[arr.length];
        int multi = 1;
        for(int i=0;i<=arr.length-1;i++){
            multi*=arr[i];
        }
        for (int j = 0; j <= arr.length-1; j++) {
            temp[j]=multi/arr[j];
            System.out.print(temp[j]+" ");
        }
        
    }
}
