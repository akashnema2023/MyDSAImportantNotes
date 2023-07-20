/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class BasicProgram3 {
int a;//instanse val

    public static void main(String[] args) {
        int c;//local
        int result = new BasicProgram3().simple(20, 30);
        System.out.println("Result is " + result);

        BasicProgram3 owner = new BasicProgram3();
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter the room no...");
        int val = sc.nextInt();
         
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        
        owner.rooms(val,size);
        }
        
    }

    public int simple(int a1, int b) {
        BasicProgram3 demoBasicProgram3=new BasicProgram3();
         demoBasicProgram3.a = a1;
        int b1 = b;
        int sum = a1 + b1;
        return sum;
    }

    public void rooms(int value,int size) {

        switch (value) {
            case 101:
                System.out.println("nihal");
                push(size);
                break;
            
            case 202:
                System.out.println("vinod");
                
                break;

            default:
                System.out.println("NOt found");
        }

    }
    public void push(int size){
        int arr[]=new int[size];
     Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of array");
        for(int i=0;i<size;i++){
            arr[i]= scanner.nextInt();
        }
        
    }
}
