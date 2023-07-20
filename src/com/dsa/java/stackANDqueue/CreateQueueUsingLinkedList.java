/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stackANDqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class CreateQueueUsingLinkedList {

    private ListNode front;
    private ListNode rear;
    private int length;

    public class ListNode {

        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean ismpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void enqueueElement(int value) {
        ListNode tempNode = new ListNode(value);
        if (ismpty()) {
            front = tempNode;
        } else {
            rear.next = tempNode;
        }
        rear = tempNode;
        length++;
    }

    public void display() {
        if (ismpty()) {
            return;
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " ----> ");
            current = current.next;
        }
        System.out.print("Null");
    }

    public int dequeueElement() {
        if(ismpty()){
            return 0;
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return result;

    }
    
    public  String[] generateBinaryNumberSys(int n){
        String[] str1=new String[n];
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        for(int i=0;i<n;i++){
            str1[i]=q.poll();
            String p1=str1[i]+"0";
            String p2=str1[i]+"1";
            q.offer(p1);
            q.offer(p2);
        }
        return str1;
    }
     
    
    
    public void callingMethod(){
         Scanner sc=new Scanner(System.in);
        System.out.println("1.Enqueue Operation");
        System.out.println("2.Dequeue Operation");
        System.out.println("3.Display Operation");
        System.out.println("4.Exit Program");
        int choice;
        while(true){
            System.out.println("Enter Choice");
            choice= sc.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Enter value");
                    int val=sc.nextInt();
                    enqueueElement(val);
                    break;
                }
                case 2:{
                    dequeueElement();
                    break;
                }
                case 3:{
                    display();
                    break;
                }
                case 4:{
                     exitprogram();
                }
                    
                default:
                    throw new AssertionError();
            }
        }
        
        
    }
    public void exitprogram(){
        System.exit(0);
    }
    
    
   
    public static void main(String[] args) {
        CreateQueueUsingLinkedList cllList = new CreateQueueUsingLinkedList();
        cllList.enqueueElement(44);
        cllList.enqueueElement(48);
        cllList.enqueueElement(44);
        cllList.enqueueElement(67);

        int lengthis = cllList.length();
        System.out.println("Length is " + lengthis);
        cllList.display();

        System.out.println("");
        System.out.println("result " + cllList.dequeueElement());
        cllList.display();
        System.out.println(" ");
        System.out.println("Length is " + cllList.length());
        
        String resultString[]=cllList.generateBinaryNumberSys(10);
        for(int i=0;i<resultString.length;i++){
            System.out.println(resultString[i]);
        }
        
        
    }
}
