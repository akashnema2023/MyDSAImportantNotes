/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.sortingAlgorithm;

/**
 *
 * @author akash
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr1={2,5,7};
        int[] arr2={3,4,9};
        int[]result=merge(arr1, arr2, arr1.length, arr2.length);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] merge(int arr1[],int arr2[],int n,int m){
        int[] sortedarr=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(arr1[i]<arr2[j]){
                sortedarr[k]=arr1[i];
                i++;
            }else{
                sortedarr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            sortedarr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            sortedarr[k]=arr2[j];
            k++;
            j++;
        }
        return sortedarr;
    }
}
