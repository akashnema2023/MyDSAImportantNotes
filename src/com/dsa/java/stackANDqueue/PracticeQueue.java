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
public class PracticeQueue {

    public static void main(String[] args) {
        String resultString = new PracticeQueue().enqueue();
        System.out.println("REsult " + resultString);
        PracticeQueue pq = new PracticeQueue();
        pq.display();
    }

    public void implemented() {

    }
    int max = 10;
    int front = -1, rear = -1;
    int arr[] = new int[max];
    Scanner sc = new Scanner(System.in);

    public String enqueue() {
        if (rear == max - 1) {
            System.out.println("stack is overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            System.out.println("Enter value enque terms :  ");
            int data = sc.nextInt();
            rear++;
            arr[rear] = data;

        }
        return "successfully...";
    }

    public void display() {
        if (front == -1) {
            System.out.println("queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
