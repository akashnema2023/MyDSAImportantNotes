/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

/**
 *
 * @author akash
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,6,7,8};
        int rs=findmissing(arr);
        System.out.println(rs);
    }
    public static int findmissing(int arr[]){
         int n= arr.length+1;
        int sum=n*(n+1)/2;
         for(int num : arr){
            sum=sum-num;
        }
         return sum;
    }
}
