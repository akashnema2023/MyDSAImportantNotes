/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class ReverseString {
    public static void main(String[] args) {
        //using simple algorithm
//        String str="hello";
//        char[] charr=str.toCharArray();
//        for(int i=charr.length-1;i>=0;i--){
//            System.out.print(charr[i]);
//        }
          
          String str="hello";
          String revString="";
          for(int i=str.length()-1;i>=0;i--){
              revString+=str.charAt(i);
          }

          System.out.println("Result is "+revString);

    }
}
