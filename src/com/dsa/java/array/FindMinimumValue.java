/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

/**
 *
 * @author akash
 */
public class FindMinimumValue {

    public static void main(String[] args) {
        int[] arr = {5, 68, 33, 6, 3, 12, 2, 1};
        int result = new FindMinimumValue().minimumNumber(arr);
        System.out.println("Result : " + result);
    }

    public int minimumNumber(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }

}
