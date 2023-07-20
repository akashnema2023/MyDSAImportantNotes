/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.sortingAlgorithm;

/**
 *
 * @author akash
 */
public class InsertionSort {

    public void sortingArray(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
    public void printArray(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,3,6,2,8,4,1,7};
        InsertionSort is=new InsertionSort();
        is.sortingArray(arr);
        is.printArray(arr);
    }
}
