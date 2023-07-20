/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.linkedlistPrograms;

/**
 *
 * @author akash
 */
public class SinglyLinkedList {

    private Node head;

    public static class Node {

        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printsinglylinkedlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printsinglylinkedlistusingParameter(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int countinglist() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertValueAtBeginning(int value) {
        Node newnode = new Node(value);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void insertValueAtEnding(int value) {
        Node newnode = new Node(value);

        if (head == null) {
            head = newnode;
            return;
        }
        Node current = head;
        while (null != current.next) {
            current = current.next;

        }
        current.next = newnode;
    }

    public void insertNodeAtPosition(int value, int position) {
        System.out.println("insert the value at the positon : " + position);
        Node newNode = new Node(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = newNode;
            newNode.next = current;

        }
    }

    public Node deleteFirstNode() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;

    }

    public Node deleteEndingNode() {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void deleteNodeAtPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            Node previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = current.next;
//            previous.next=previous.next.next;
        }
    }

    public Node removeNthFromEnd(Node head, int n) {
        if (head.next == null) {
            return null;
        }
        //find size
        int size = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }
        Node prev = head;
        int i = 1;
        while (i < size - n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public String searchElement(int searchkey) {
        Node current = head;
        int count = 1;
        while (current != null) {
            if (current.data == searchkey) {
                return "found data at position " + count;
            }
            count++;
            current = current.next;
        }
        return "not found";
    }

    public Node reverseNode(Node head) {
        if (head == null) {
            return head;
        }
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;//previous ko current krdo now previous points current
            current = next;//current ko nextnode krdo now current points next
        }
        return previous;
    }

    //merge two node in sorted order
    public Node merge(Node a, Node b) {
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

//    addition of two list in reverse order
    public Node additionList(Node a, Node b) {
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;//12/10=1
            tail.next = new Node(sum % 10);//12%10=2
//            Node newnodeNode=new Node(sum%10);
//            tail.next=newnodeNode;
            tail = tail.next;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }

        if (carry > 0) {
            tail.next = new Node(carry);
        }

        return dummyNode.next;
    }

    public void removeduplicate() {
        Node currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.data == currentNode.next.data) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        //adding data in nodes
        sll.head = new Node(10);//head(data,next)-->null
        Node second = new Node(20);//second-->null
        Node third = new Node(30);//third-->null
        Node fourth = new Node(40);//fourth-->null

        //linking the all nodes together with each line.
        sll.head.next = second;//10-->20-->null
        second.next = third;//10-->20-->30-->null
        third.next = fourth;//10-->20-->30-->40-->null
        System.out.println("list : " + sll.head.data);

        //printing nodes
        sll.printsinglylinkedlist();

        //lenght of the list in counting value
        int result1 = sll.countinglist();
        System.out.println("Number of the List count : " + result1);

        int result2 = sll.length();
        System.out.println("lenght of the node " + result2);

        System.out.println("Inserting Methods");
        //inserting value at beginning of the list
        sll.insertValueAtBeginning(87);
        sll.printsinglylinkedlist();//check

        //insert value at ending
        sll.insertValueAtEnding(36);
        sll.printsinglylinkedlist();//check

        //inserting node at given position
        sll.insertNodeAtPosition(32, 2);
        sll.printsinglylinkedlist();//check

        //delete first node in singlylinkedlist
        System.out.println("Delete Methods ");
//        sll.deleteFirstNode();
        sll.printsinglylinkedlist();//check

        //delete end node at singlylinkedlist
//        sll.deleteEndingNode();
        sll.printsinglylinkedlist();//check

//        sll.deleteNodeAtPosition(2);
        sll.printsinglylinkedlist();

        System.out.println("Reverse list");

        Node headNode = new Node(10);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(40);
        Node fourthNode = new Node(55);

        headNode.next = second;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        SinglyLinkedList reverLinkedList = new SinglyLinkedList();
        Node revereseNode = reverLinkedList.reverseNode(headNode);
        reverLinkedList.printsinglylinkedlistusingParameter(revereseNode);
        //searh node data
        System.out.println("Search Node at given position");
        String result3 = sll.searchElement(10);
        System.out.println(result3);

        //merge two lists in sorted manner
        System.out.println("merge two list");
        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.insertValueAtEnding(1);
        sll1.insertValueAtEnding(4);
        sll1.insertValueAtEnding(8);

        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.insertValueAtEnding(3);
        sll2.insertValueAtEnding(6);

        SinglyLinkedList result = new SinglyLinkedList();
        result.head = sll.merge(sll1.head, sll2.head);
//         result.head= sll.mergell(sll1.head, sll2.head);
        result.printsinglylinkedlist();

        //addition of two list
        System.out.println("Addition of two list");
        SinglyLinkedList sll4 = new SinglyLinkedList();
        sll4.insertValueAtEnding(7);
        sll4.insertValueAtEnding(4);
        sll4.insertValueAtEnding(9);

        SinglyLinkedList sll5 = new SinglyLinkedList();
        sll5.insertValueAtEnding(5);
        sll5.insertValueAtEnding(6);
        SinglyLinkedList result4 = new SinglyLinkedList();
        result4.head = sll.additionList(sll4.head, sll5.head);
        result4.printsinglylinkedlist();

        System.out.println("Remove duplicate");
        SinglyLinkedList sll6 = new SinglyLinkedList();
        sll6.insertValueAtEnding(1);
        sll6.insertValueAtEnding(1);
        sll6.insertValueAtEnding(2);
        sll6.insertValueAtEnding(3);
        sll6.insertValueAtEnding(3);
        sll6.insertValueAtEnding(3);
        sll6.insertValueAtEnding(4);
        System.out.println("Original List some duplicate data's are there");
        sll6.printsinglylinkedlist();

        System.out.println("After applying method list is ");
        sll6.removeduplicate();
        sll6.printsinglylinkedlist();

//        System.out.println("Remove Nth From End");
//        SinglyLinkedList sll7=new SinglyLinkedList();
//        sll7.removeNthFromEnd(sll7.head, 3);
//        sll7.printsinglylinkedlist();
    }
}
