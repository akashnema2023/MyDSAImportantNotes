/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

/**
 *
 * @author akash
 */
public class MovesZero {

    public static void main(String[] args) {
        int arr[] = {8, 0, 6, 0, 2, 1, 9};
        int arrlength=arr.length;
        int result[]=new MovesZero().movezero(arr, arrlength);
        for (int i = 0; i < arrlength; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public int[] movezero(int array[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != 0 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if (array[j] != 0) {
                j++;
            }
        }
        return array;
    }
}
