/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.sortingAlgorithm;

/**
 *
 * @author akash
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={5,2,0,1,6,3};
        QuickSort objQuickSort=new QuickSort();
        int result=objQuickSort.partition(arr, 0, arr.length-1);
        System.out.println(result);
        objQuickSort.sort(arr, 0, arr.length-1);
        objQuickSort.printArr(arr);
    }
    public void sort(int arr[],int low,int high){
        if(low<high){
            int p=partition(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
        
    }
    public int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low;
        int j=low;
        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
                
        }
        return j-1;
    }
    public void printArr(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
