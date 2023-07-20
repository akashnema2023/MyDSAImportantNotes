/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.linkedlistPrograms;

/**
 *
 * @author akash
 */
public class SinglyLLAdditionOfTwoList {

    Node head;

    public static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;

        } else {
            tail.next = a;
        }
        return dummy.next;

    }

    public void printsinglylinkedlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLLAdditionOfTwoList sll = new SinglyLLAdditionOfTwoList();
        //merge

        SinglyLLAdditionOfTwoList slla = new SinglyLLAdditionOfTwoList();
        slla.head = new Node(20);
        Node second = new Node(3);
        Node third = new Node(6);
        Node fourth = new Node(40);

        SinglyLLAdditionOfTwoList slla1 = new SinglyLLAdditionOfTwoList();
        slla1.head = new Node(2);
        Node second1 = new Node(20);
        Node third1 = new Node(4);
        Node fourth1 = new Node(10);

        SinglyLLAdditionOfTwoList result = new SinglyLLAdditionOfTwoList();

        result.head = sll.merge(slla.head, slla1.head);

        sll.printsinglylinkedlist();

    }
}
