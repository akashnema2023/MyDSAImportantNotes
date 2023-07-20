/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.searchingAlgorithm;

/**
 *
 * @author akash
 */
public class BinarySearch {

    public static void searchElementBS(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                System.out.println("found is " + (mid+1));
            }
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {23, 12, 47, 34, 72, 66,57, 89};
        //sorting order first
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        //print elements
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        //find element
        int key = 12;
        searchElementBS(arr, key);
    }
}
