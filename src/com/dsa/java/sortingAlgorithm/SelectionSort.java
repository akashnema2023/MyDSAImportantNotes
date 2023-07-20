/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.sortingAlgorithm;

import javax.sound.midi.MidiEvent;

/**
 *
 * @author akash
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 7, 9, 2};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
         for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
