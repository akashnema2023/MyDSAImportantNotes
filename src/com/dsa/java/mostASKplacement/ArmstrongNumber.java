/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=371;//153,371,407 is also armstrong number
        int num1=num;//num1=153
        double arm=0;
        int num2=num;
        int n=0;
        //Finding number of digits
        while(num2!=0){
            num2=num2/10;
            n++;
        }
        
        while(num!=0){
            arm+=Math.pow(num%10, n);
            num=num/10;
        }
        System.out.println("Result "+arm);
        if(num1==arm){
            System.out.println(num1+" is arms number");
        }else{
            System.out.println(arm+" is not a arms number");
        }
    }
   
}
