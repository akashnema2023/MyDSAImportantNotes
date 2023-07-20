/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.linkedlistPrograms;

import java.util.NoSuchElementException;

/**
 *
 * @author akash
 */
public class DoublyLinkedlist1 {

    private ListNode headListNode;
    private ListNode tailListNode;
    private int length;

    private class ListNode {

        private int data;
        private ListNode nextNode;
        private ListNode previousNode;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedlist1() {
        this.headListNode = null;
        this.tailListNode = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void insertvalueAtbegin(int value) {
        ListNode newListNode = new ListNode(value);
        if (isEmpty()) {
            tailListNode = newListNode;
        } else {
            headListNode.previousNode = newListNode;
        }
        newListNode.nextNode = headListNode;
        headListNode = newListNode;
        length++;

    }

    public void insertvalueAtEnding(int value) {
        ListNode newListNode = new ListNode(value);
        if (isEmpty()) {
            tailListNode = newListNode;
        } else {
            tailListNode.nextNode = newListNode;
            newListNode.previousNode = tailListNode;
        }
        tailListNode = newListNode;
        length++;
    }

    public void printvalues() {
        //using while loop
        ListNode tempListNode = headListNode;
        while (tempListNode != null) {
            System.out.print(tempListNode.data + "---->");
            tempListNode = tempListNode.nextNode;
        }
        //using for loop
//        for(ListNode tempListNode=headListNode;tempListNode!=null;tempListNode=tempListNode.nextNode){
//            System.out.print(tempListNode.data+"---->");
//        }
        System.out.println("null");
    }

    public ListNode deletebegin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode tempListNode = headListNode;
        if (headListNode == null) {
            tailListNode = null;
        } else {
            headListNode.nextNode.previousNode = null;
        }
        headListNode = headListNode.nextNode;
        tempListNode.nextNode = null;
        length--;
        return tempListNode;
    }

    public ListNode deletelastnode() {
        ListNode tempListNode = tailListNode;
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            tailListNode.previousNode.nextNode = null;
        }
        tailListNode = tailListNode.previousNode;
        tempListNode.previousNode = null;
        length--;
        return tempListNode;

    }
    
    public boolean isPalindrome(){
        ListNode startNode=headListNode;
        ListNode endNode=headListNode;
        while(endNode.nextNode!=null){
            endNode=endNode.nextNode;
        }
        while(startNode!=endNode){
            if(startNode.data!=endNode.data){
                return false;
            }
            startNode=startNode.nextNode;
            endNode=endNode.previousNode;
            
        }
        return true;
    }
    //***********************

    public static void main(String[] args) {
        DoublyLinkedlist1 ddl = new DoublyLinkedlist1();

        //insertvalueAtbegin method..
        ddl.insertvalueAtbegin(20);
        ddl.insertvalueAtbegin(37);
        ddl.insertvalueAtbegin(27);
        ddl.insertvalueAtbegin(40);

        //insertvalueAtEnding method..
//        ddl.insertvalueAtEnding(65);
//        ddl.insertvalueAtEnding(89);
//        ddl.insertvalueAtEnding(5);
//        ddl.insertvalueAtEnding(33);
//        ddl.insertvalueAtEnding(22);
//delete node at beginining
//        ddl.deletebegin();
//        ddl.deletebegin();
//        ddl.deletebegin();
//delete node at ending
//        ddl.deletelastnode();
//        ddl.deletelastnode();
//        ddl.deletelastnode();

        ddl.printvalues();

        System.out.println("list " + ddl.length() + ",,");
        DoublyLinkedlist1 ddllDoublyLinkedlist1=new DoublyLinkedlist1();
        ddllDoublyLinkedlist1.insertvalueAtEnding(1);
        ddllDoublyLinkedlist1.insertvalueAtEnding(2);
        ddllDoublyLinkedlist1.insertvalueAtEnding(2);
        ddllDoublyLinkedlist1.insertvalueAtEnding(1);
        ddllDoublyLinkedlist1.isPalindrome();
        
    }

}
