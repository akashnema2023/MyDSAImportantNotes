/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.sortingAlgorithm;

/**
 *
 * @author akash
 */
public class BubbleSort {

    public int[] sortingArray(int arr[]) {
        int size = arr.length - 1;
        for (int i = 0; i <= size; i++) {
            for (int j = i + 1; j <= size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public void sortingArray1(int arr[]) {
        int size = arr.length;
        boolean isSwapping;
        for (int i = 0; i < size - 1; i++) {
            isSwapping = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapping = true;
                }
            }
            if (isSwapping == false) {
                break;
            }

        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {22, 54, 67, 12, 76, 88};
//        int[] newarr = new BubbleSort().sortingArray(arr);
        BubbleSort bs = new BubbleSort();
        bs.sortingArray(arr);
        bs.printArray(arr);
    }
}
