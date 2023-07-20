/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

/**
 *
 * @author akash
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int n=4;
        int n1=0;
        int n2=1;
        int n3=0;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
