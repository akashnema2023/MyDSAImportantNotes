/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class ResizeArray {

    public static void main(String[] args) {
        int arr[] = {33, 5, 1, 65, 7, 30};
        System.out.println("Before array size is " + arr.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array capacity for extends array : ");
        int capacity = sc.nextInt();

        int[] result = new ResizeArray().resize(arr, capacity);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println(" ");
        System.out.println("After array size is " + result.length);

    }

    public int[] resize(int arr[], int capacity) {
        int resizeArr[] = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            resizeArr[i] = arr[i];
        }
        return resizeArr;
    }

}
