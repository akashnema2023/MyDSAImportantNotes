/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class RecursionConcept {
    public static void main(String[] args) {
        printloop(1);
    }
    public static void printloop(int n){
        if(n==6){
            System.exit(0);
        }
        System.out.println(n);
        printloop(n+1);
    }
    
}
