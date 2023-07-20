/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stackANDqueue;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author akash
 */
public class StackUsingLinkedList {

    public static void main(String[] args) {

        ImplementationProgram implementationProgram = new ImplementationProgram();
//        implementationProgram.callingmethod();
//        implementationProgram.pushElement(14);
//        implementationProgram.pushElement(32);
//        implementationProgram.pushElement(55);
//        implementationProgram.popElement();
//        System.out.println(implementationProgram.peek());
        String str = "abcd";
        System.out.println(implementationProgram.reverseStack(str));
//        implementationProgram.callingmethod();
        System.out.println("greater number..............");
        int arr[] = {4, 7, 3, 4, 8, 1};
        int result[] = implementationProgram.findgreaternumber(arr);
        for (int i = 0; i <= result.length - 1; i++) {
            System.out.print(" " + result[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Check parentheses is valid or not");
        String str1 = "{{}}";
        boolean re = implementationProgram.isValidParentheses(str1);
        System.out.println(re);
    }
}

class ImplementationProgram {

    private int length;
    private Node topNode;

    Stack<Integer> dataIntegers = new Stack<>();

    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ImplementationProgram() {
        topNode = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
    Scanner sc = new Scanner(System.in);

    public void callingmethod() {
        System.out.println("1.Push or Insert");
        System.out.println("2.Pop or Delete");
        System.out.println("3.Display");
        System.out.println("4.End Program");
        int choice;
        while (true) {
            System.out.println("Enter choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the value");
                    int val = sc.nextInt();
//                    pushElement(val);
                    dataIntegers.push(val);
                }
                case 2: {
                    int result = popElement();
//                    int result = dataIntegers.pop();
                    System.out.println("Deleted : " + result);
                    break;
                }

                default:
                    throw new AssertionError();
            }
        }
    }

    public void pushElement(int value) {
        Node tempNode = new Node(value);
        tempNode.next = topNode;
        topNode = tempNode;
        length++;
    }

    public int popElement() {
        if (topNode == null || isEmpty()) {
            return 0;
        }
        int result = topNode.data;
        topNode = topNode.next;
        length--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return topNode.data;
    }

    public String reverseStack(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chararr = str.toCharArray();
        for (char c : chararr) {
            stack.push(c);
        }
        for (int i = 0; i < chararr.length; i++) {
            chararr[i] = stack.pop();
        }
        return new String(chararr);
    }

    public int[] findgreaternumber(int arr[]) {
        int result[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public boolean isValidParentheses(String s) {
        //String str="()";
//        char arr[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if (c == ')' && top == '('
                            || c == '}' && top == '{'
                            || c == ']' && top == ']') {
                        stack.pop();
                    } else {
                        return false;
                    }

                }

            }

        }
        return stack.isEmpty();

    }
}
