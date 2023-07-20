/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.sortingAlgorithm;

/**
 *
 * @author akash
 */
public class MergeSortAlgoritham {
    public static void main(String[] args) {
        int[] arr=new int[]{8,5,2,3,6,7,4};
        int[] temp=new int[arr.length];
        MergeSortAlgoritham msa=new MergeSortAlgoritham();
        msa.sort(arr, temp, 0, arr.length-1);
        msa.printArray(arr);
        
    }
    public void printArray(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
   
    public void sort(int[] arr,int temp[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            sort(arr, temp, low, mid);//divide left sub array
            sort(arr, temp, mid+1, high);//divie rigth sub array
            merge(arr, temp, low, mid, high);//merge both sub array
            
        }
    }
    public void merge(int arr[], int temp[],int low,int mid,int high){
        for(int i=low;i<=high;i++){
            temp[i]=arr[i];//copy all the elements in temp array
        }
        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid&&j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }else{
                arr[k]=temp[j];
                j++;
            }
            k++;   
        }
        while(i<=mid){
            arr[k]=temp[i];
            i++;
            k++;
        }
        while(j<=high){
            arr[k]=temp[j];
            j++;
            k++;
        }
    }
}
