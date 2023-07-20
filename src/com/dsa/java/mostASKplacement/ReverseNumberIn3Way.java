/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class ReverseNumberIn3Way {

    public static void main(String[] args) {
        //1.using algorithm
        int num = 1234;
        /*int rev=0;
        
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);*/

        //using StringBuffer class
        String num1 = String.valueOf(num);
        StringBuffer sb = new StringBuffer(num1);
        StringBuffer revBuffer = sb.reverse();
        System.out.println("Reverse is " + revBuffer);

    }
}
