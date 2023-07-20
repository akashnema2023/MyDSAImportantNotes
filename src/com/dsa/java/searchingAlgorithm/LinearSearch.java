/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.searchingAlgorithm;

/**
 *
 * @author akash
 */
public class LinearSearch {

    public static int searchElement(int arr[], int key,int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={22,44,76,24,55,11};
        int size=arr.length;
        int key=11;
        System.out.println("Element is found "+searchElement(arr,key,size));
                
    }
}
