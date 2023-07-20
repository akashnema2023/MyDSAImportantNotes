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
public class CreateStackusingArray {
    public static void main(String[] args) {
        Program obj1= new Program();
        obj1.disp();
    }
}
class Program
{
    int MAX =5;
    int a[]=new int[MAX];
    int top=-1;
    int ch;
    Scanner obj= new Scanner(System.in);
    void disp(){
        System.out.println("1.Push or Insert");
        System.out.println("2.Pop or Delete");
        System.out.println("3.Display");
        System.out.println("4.End Program");
        while(true) {
            System.out.println("Enter choice :");
            ch = obj.nextInt();
            switch (ch) {
                case 1: {
                    push();
                    break;
                }
                case 2: {
                    pop();
                    break;
                }
                case 3: {
                    display();
                    break;
                }
                case 4: {
                    exit();

                }
                default: {
                    System.out.println("Wrong Choice");
                }
            }
        }
    }
    void push()
    {
        int data;
        if (top==MAX-1){
            System.out.println("overflow or stack is full");
        }
        else {
            System.out.println("Enter Element to be Pushed :");
            data=obj.nextInt();
            top++;
            a[top]=data;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped Element :"+a[top]);
            top--;
        }

    }
    void display(){
        int i;
        if (top>=0){
            System.out.println("Elements:");
            for(i=top;i>=0;i--) {
                System.out.println(a[i]);
            }

        }
        else{
                System.out.println("The stack is empty");
            }

    }
    void exit(){
        System.exit(0);
    }


}
