/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

/**
 *
 * @author akash
 */
public class RemoveOddNumber {
    public static void main(String[] args) {
        int arry[]={41,20,33,60,40,28};
   
        int result[]=new RemoveOddNumber().removeoddNumbers(arry);
        RemoveOddNumber rmOddNumber=new RemoveOddNumber();
        rmOddNumber.printarr(result);
    }
    public int[] removeoddNumbers(int arr[]){
        int eventcount=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                eventcount++;
            }
        }
        int idx=0;
        int newarr[]=new int[eventcount];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2==0){
                newarr[idx]=arr[i];
                idx++;
            }
        }
        return newarr;
    }
    public void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
   
}
