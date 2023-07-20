/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class IsPrimeNumber {

    public static void main(String[] args) {
  
        isPrimeNumber(13);
        isPrimeNumber(12);
        isPrimeNumber1to100(100);
    }

    public static void isPrimeNumber(int num) {
        int flag = 0;
        int m = num / 2;
        System.out.println("m is "+m);
        if (num == 0 || num == 1) {
            System.out.println(num + " is Not Prime Number");
        }
        for (int i = 2; i <= m; i++) {
            int val=num%i;
            if (val== 0) {
                System.out.println(num + " is Not Prime Number");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(num+" Prime Number");
        }

    }
    public static void isPrimeNumber1to100(int num){
        boolean isprime=true;
        String primenumbersString=" ";
        for(int i=2;i<=num;i++){
            isprime=isPrime(i);
            if(isprime){
//                primenumbersString=primenumbersString+i+" ";
                  System.out.println(i+" ");
            }
        }
        System.out.println(primenumbersString);
    }
    public static boolean isPrime(int numberisprime){
        int reminder;
        for(int i=2;i<numberisprime/2;i++){
            reminder=numberisprime%i;
            if(reminder==0){
                return false;
            }
        }
        return true;
    }
}
