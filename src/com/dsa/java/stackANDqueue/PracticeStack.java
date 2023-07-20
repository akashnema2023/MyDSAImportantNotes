/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stackANDqueue;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class PracticeStack {
    public static void main(String[] args) {
        Progam pgProgam=new Progam();
        pgProgam.implementation();
    }
}
class Progam{
    int max=5;
    int arr[]=new int[max];
    int top=-1;
    Scanner scanner=new Scanner(System.in);
    public void implementation(){
        
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("4. Exit Program");
        
        while(true){
            System.out.println("Enter the choice");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    push();                   
                    break;
                case 2:
                    pop();
                    break;
                case 3:{
                    display();
                    break;
                }
                 default:
                     System.out.println("give valid number");
                     break;
             }
        }
    }
    public void push(){
           if(top==max-1){
               System.out.println("Stack is overflow");
           }else{
               System.out.println("Enter the value");
               int data=scanner.nextInt();
               top++;
               arr[top]=data;
              
           }


    }
    public void pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }else{
            System.out.println("Element is poped : "+arr[top]);
            top--;
            
        }
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
