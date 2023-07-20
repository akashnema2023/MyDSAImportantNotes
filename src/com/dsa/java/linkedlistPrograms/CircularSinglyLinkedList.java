/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.linkedlistPrograms;

/**
 *
 * @author akash
 */
public class CircularSinglyLinkedList {

    private ListNode lastNode;
    private int length;

    public class ListNode {

        private ListNode nextNode;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        lastNode = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularSll() {
        ListNode firstNode = new ListNode(5);
        ListNode secoNode = new ListNode(23);
        ListNode thiredNode = new ListNode(11);
        ListNode fourthNode = new ListNode(9);

        firstNode.nextNode = secoNode;
        secoNode.nextNode = thiredNode;
        thiredNode.nextNode = fourthNode;
        fourthNode.nextNode = firstNode;

        lastNode = fourthNode;
        System.out.println("successfully");
    }

    private void printNodes() {
        ListNode firstNode = lastNode.nextNode;
        while (firstNode != lastNode) {
            System.out.print(firstNode.data + "---->");
            firstNode = firstNode.nextNode;
        }
        System.out.println(firstNode.data + " ");
    }
    
    public void insertNodeAtBegin(int value){
        ListNode tempNode=new ListNode(value);
        if(lastNode==null){
            lastNode=tempNode;
        }else{
           tempNode.nextNode= lastNode.nextNode;
        }
        lastNode.nextNode=tempNode;
        length++;
    }
//*********************************

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularSll();
        csll.printNodes();
        csll.insertNodeAtBegin(27);
        csll.insertNodeAtBegin(42);
        csll.printNodes();
    }
}
