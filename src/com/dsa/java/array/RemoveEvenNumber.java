/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

/**
 *
 * @author akash
 */
public class RemoveEvenNumber {

    public static void main(String[] args) {
        int arry[] = {43, 80, 2, 21, 7, 4};
        RemoveEvenNumber rmEvenNumber = new RemoveEvenNumber();
        int result[] = rmEvenNumber.removeEvenNumber(arry);
        rmEvenNumber.printarray(result);
    }

    public int[] removeEvenNumber(int arr[]) {
        int oddNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNum++;
            }
        }
        int oddlistedarr[] = new int[oddNum];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddlistedarr[idx] = arr[i];
                idx++;
            }

        }
        return oddlistedarr;
    }

    public void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
