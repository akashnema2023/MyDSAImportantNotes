/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

import java.io.File;
import java.util.Scanner;

public class One_dimensionalArray {
    public static void main(String[] args) {
//        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        int[] arr={20,30,54,87,9};
        System.out.println("Enter values");
        int[] arr1=new int[5];
        //inserting values
        for(int i=0;i<=5-1;i++){
                       arr1[i]=sc.nextInt();

        }
        //printing values
         for(int i=0;i<=5-1;i++){
                       System.out.println("print :"+arr1[i]);

        }
//       while(i<=4){
//           arr1[i]=sc.nextInt();
//           i++;
//       }
//         while(j<=4){
//           System.out.println(arr1[i]);
//           j++;
//       }
        System.out.println("Array :"+arr[3]);
    }
          
}
