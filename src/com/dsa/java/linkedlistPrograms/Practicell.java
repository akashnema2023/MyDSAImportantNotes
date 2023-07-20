/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.linkedlistPrograms;

/**
 *
 * @author akash
 */
public class Practicell {

    private Node head;

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void displayll() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
            count++;
        }
        System.out.print("null");
        System.out.println(" ");
        System.out.println("count " + count);
    }

    public void insertbegin(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertatposition(int value, int position) {
        Node newNode = new Node(value);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previousNode = head;
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.next;
                count++;
            }
            Node current = previousNode.next;
            previousNode.next = newNode;
            newNode.next = current;
            System.out.println("count " + count);
        }
    }

    public void insertatgivenposition(int value, int position) {
        Node newNode = new Node(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previousNode = head;
            int count = 1;

            while (count < position - 1) {
                previousNode = previousNode.next;
                count++;
            }
            Node curreNode = previousNode.next;
            previousNode.next = newNode;
            newNode.next = curreNode;
        }
    }

    public Node mergell(Node aNode, Node bNode) {
        Node dummyNode = new Node(0);
        Node tempNode = dummyNode;
        while (aNode != null && bNode != null) {
            if (aNode.data <= bNode.data) {
                tempNode.next = aNode;
                aNode = aNode.next;
            } else {
                tempNode.next = bNode;
                bNode = bNode.next;
            }
            tempNode = tempNode.next;
        }
        if (aNode == null) {
            tempNode.next = bNode;
        } else {
            tempNode.next = aNode;
        }
        return dummyNode.next;
    }

    public Node addtwolist(Node aNode, Node bNode) {
        Node dummyNode = new Node(0);
        Node tailNode = dummyNode;
        int carry = 0;
        while (aNode != null || bNode != null) {
            int x = (aNode != null) ? aNode.data : 0;
            int y = (bNode != null) ? bNode.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tailNode.next = new Node(sum % 10);
            tailNode = tailNode.next;

            if (aNode != null) {
                aNode = aNode.next;
            }
            if (bNode != null) {
                bNode = bNode.next;
            }
        }
        if (carry > 0) {
            tailNode.next = new Node(carry);

        }
        return dummyNode.next;
    }

    public Node removefirst() {
        Node tempNode = head;
        if (head == null) {
            return head;
        }

        head = head.next;
        tempNode.next = null;
        return tempNode;

    }

    public Node removeendNode() {
        if (head == null || head.next == null) {
            return head;
        }
        Node tempNode = head;
        Node previousNode = null;
        while (tempNode.next != null) {
            previousNode = tempNode;
            tempNode = tempNode.next;
        }
        previousNode.next = null;

        return tempNode;
    }

    public Node reverseNode(){
        Node currentNode=head;
        Node previousNode=null;
        Node nextNode=null;
        while(currentNode!=null){
            nextNode=currentNode.next;
            currentNode.next=previousNode;
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }
    
    public static void main(String[] args) {
        Practicell hl = new Practicell();
//        hl.head = new Node(10);
//        Node second = new Node(20);
//        Node third = new Node(30);
//
//        hl.head.next = second;
//        second.next = third;
//        hl.displayll();
//
//        System.out.println("");
//        System.out.println("insert begining ");
//        hl.insertbegin(40);
//        hl.displayll();
//
//        System.out.println(" ");
//        System.out.println("insert ending");
//        hl.insertend(60);
//        hl.displayll();
//
//        System.out.println(" ");
//        System.out.println("insert at position");
//        hl.insertatposition(45, 2);
//
//        hl.insertatgivenposition(55, 1);
//        hl.displayll();

        System.out.println("merge");
        Practicell hfirstlist1 = new Practicell();

        hfirstlist1.insertend(1);
        hfirstlist1.insertend(4);
        hfirstlist1.insertend(8);

        Practicell hseconglist2 = new Practicell();

        hseconglist2.insertend(3);
        hseconglist2.insertend(6);
        Practicell resultPracticell1 = new Practicell();
        resultPracticell1.head = hl.mergell(hfirstlist1.head, hseconglist2.head);
        resultPracticell1.displayll();

        System.out.println("addition of two list");
        Practicell hfirstlist = new Practicell();

        hfirstlist.insertend(7);
        hfirstlist.insertend(4);
        hfirstlist.insertend(9);

        Practicell hseconglist = new Practicell();

        hseconglist.insertend(5);
        hseconglist.insertend(6);

        Practicell resultPracticell = new Practicell();
        resultPracticell.head = hl.addtwolist(hfirstlist.head, hseconglist.head);
        resultPracticell.displayll();

        System.out.println("remove");
        Practicell pll = new Practicell();
        pll.insertend(20);
        pll.insertend(4);
        pll.insertend(55);
        pll.removefirst();
        pll.removeendNode();

        pll.displayll();

        
        System.out.println("Check is Palindrome or not ");
        Practicell pll2=new Practicell();
        pll2.insertend(1);
        pll2.insertend(2);
        pll2.insertend(3);
        pll2.insertend(1);
//       boolean result= pll2.isPalindrome();
//        System.out.println("Result is "+result);
    }
}
