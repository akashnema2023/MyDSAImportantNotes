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
public class QueueUsingArray {

    public static void main(String[] args) {
        Program1 plProgram1=new Program1();
        plProgram1.implementation();
    }
}

class Program1 {

    int rear = -1, front = -1;
    int MAX = 5;
    int q[] = new int[MAX];
    Scanner obj = new Scanner(System.in);

    void implementation() {
        System.out.println("1.Enqueue or Insert");
        System.out.println("2.Dequeue or Delete");
        System.out.println("3. Display");
        System.out.println("4.Exit");
        while (true) {
            System.out.println("Enter the choice");
            int ch = obj.nextInt();
            switch (ch) {
                case 1: {
                    enqueue();
                    break;
                }
                case 2: {
                    dequeue();
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

    void enqueue() {
        if (rear == MAX - 1) {
            System.out.println("queue is overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            System.out.println("Enter Element to be Enqueue :");
            int data = obj.nextInt();
            rear++;
            q[rear] = data;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("queue is empty");
        } else {
            System.out.println("Dequeue :" + q[front]);
            front++;
        }
    }

    void display() {
        int i;
        if (front == -1) {
            System.out.println("queue is empty");
        } else {
            System.out.println("Elements :");
            for (i = front; i <= rear; i++) {
                System.out.println(q[i]);
            }
        }
    }

    void exit() {
        System.exit(0);
    }

}
