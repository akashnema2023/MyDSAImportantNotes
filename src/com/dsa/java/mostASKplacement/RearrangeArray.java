/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class RearrangeArray {

    //Rearrange the array in such a way to store integers in even[MAX] and odd[MIN]
    public static void main(String[] args) {

        int[] arr={2,3,5,6,8,9};
        RearrangeArray rearrangeArray=new RearrangeArray();
        rearrangeArray.rearrangeArray(arr);
        for (int i = 0; i < arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public void rearrangeArray(int arr[]) {

        int minIdx = 0;
        int maxIdx = arr.length - 1;
        int max = arr[maxIdx]+1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + (arr[maxIdx] % max) * max;//store integer in even index place
                maxIdx--;
            } else {
                arr[i] = arr[i] + (arr[minIdx] % max) * max;//store integer in odd index place
                minIdx++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]/max;
        }
    }
}
