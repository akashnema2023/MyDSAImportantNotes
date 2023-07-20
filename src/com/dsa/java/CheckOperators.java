/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class CheckOperators {
    public static void main(String[] args) {
        method(6,2);
    }
   static void method(int x,int y){
       int a=x;
       int b=y;
       System.out.println("Operation is apply these values : " +a+ " And "+b);
       System.out.println("Operation is : "+a+" / "+b);
       int sum1=a/b;
       System.out.println("Result : "+sum1);
       System.out.println("Operation is : "+a+" % "+b);
       int sum2=a%b;
       System.out.println("Result : "+sum2);
       System.out.println("testing successfully done....");
   }
   
}
