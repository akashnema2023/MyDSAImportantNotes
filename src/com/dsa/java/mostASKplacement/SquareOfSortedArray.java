/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class SquareOfSortedArray {

    public static void main(String[] args) {

        int arr[] = {9,-4, 2, -7,-10};
        SquareOfSortedArray sortedArray = new SquareOfSortedArray();
        int[] result = sortedArray.squareofsortedarray(arr);
        for (int i = 0; i <= result.length - 1; i++) {
            System.out.print(result[i] + "  ");
        }

    }

    public int[] squareofsortedarray(int arr[]) {
        int n = arr.length;
        int[] result = new int[n];
        int i = 0;
        int j = n - 1;
        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {//abs means absolute value thats method will gives absolute value of the numbers such as -2=2,-7=7
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        return result;

    }
}
