/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

/**
 *
 * @author akash
 */
public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {44, 3, 20, 5, 27};
        int start = 0;
        int end = arr.length - 1;
        ReverseArray ra = new ReverseArray();
        ra.reverseArr(arr, start, end);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
        //1 way to reverse array
         int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int temp[]=new int[arr1.length];
        int count=0;
        for(int i=arr1.length-1;i>=0;i--){
            temp[count]=arr1[i];
            count++;
        }
        arr1=temp;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        // 2 way to reverse array
        int low = 0;
        int high = arr1.length - 1;
        while (low < high) {
            int demo = arr1[low];
            arr1[low] = arr1[high];
            arr1[high] = demo;
            low++;
            high--;
        }
        
        String string="helloworld";
        reverseString(string);
    }

    public void reverseArr(int number[], int start, int end) {
        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }
    public static void reverseString(String st){
        char[] chars=st.toCharArray();
        for(int i=chars.length-1;i>0;i--){
            System.out.print(chars[i]);
        }
    }
}
