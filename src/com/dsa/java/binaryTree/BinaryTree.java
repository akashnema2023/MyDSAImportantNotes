/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author akash
 */
public class BinaryTree {

    private TreeNode rootNode;

    public class TreeNode {

        private TreeNode rightNode;
        private TreeNode leftNode;
        private int data;

        public TreeNode(int data) {
            this.data = data;
            this.rightNode = null;
            this.leftNode = null;
        }
    }

    public void createBinaryTree() {
        BinaryTree bt = new BinaryTree();
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(30);
        TreeNode node4 = new TreeNode(40);
        TreeNode node5 = new TreeNode(50);
        TreeNode node6 = new TreeNode(60);

        rootNode = node1;
        rootNode.leftNode = node2;
        rootNode.rightNode = node3;
        node2.leftNode = node4;
        node2.rightNode = node5;
        node3.leftNode=node6;
    }

    public void recursivePreOrderTraverse(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        System.out.print(rootNode.data + "---->");
        recursivePreOrderTraverse(rootNode.leftNode);
        recursivePreOrderTraverse(rootNode.rightNode);
    }

    public void recursiveInOrderTraverse(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        recursiveInOrderTraverse(rootNode.leftNode);
        System.out.print(rootNode.data + "---->");
        recursiveInOrderTraverse(rootNode.rightNode);
    }

    public void recursivePostorderTraversal(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        recursivePostorderTraversal(rootNode.leftNode);
        recursivePostorderTraversal(rootNode.rightNode);
        System.out.print(rootNode.data + "---->");
    }

    public TreeNode createInsertByUserTree() {
        TreeNode rootNode;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data : ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        rootNode = new TreeNode(data);
        System.out.println("insert data left of " + data);
        rootNode.leftNode = createInsertByUserTree();
        System.out.println("insert data right of " + data);
        rootNode.rightNode = createInsertByUserTree();

        return rootNode;
    }

    public void iterativeInorderUsingStackTraversal(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        TreeNode tempNode = rootNode;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || tempNode != null) {
            if (tempNode != null) {
                stack.push(tempNode);
                tempNode = tempNode.leftNode;
            } else {
                tempNode = stack.pop();
                System.out.print(tempNode.data + "---->");
                tempNode = tempNode.rightNode;
            }
        }
    }

    public void iterativePostOrderUsingStackTraversal() {

        TreeNode currentNode = rootNode;
        Stack<TreeNode> stack = new Stack<>();
        while (currentNode != null || !stack.isEmpty()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.leftNode;
            } else {
                TreeNode tempNode = stack.peek().rightNode;
                if (tempNode == null) {
                    tempNode = stack.pop();
                    System.out.print(tempNode.data + "---->");
                    while (!stack.isEmpty() && tempNode == stack.peek().rightNode) {
                        tempNode = stack.pop();
                        System.out.print(tempNode.data + "---->");
                    }
                } else {
                    currentNode = tempNode;
                }
            }
        }
    }

    public void levelWiseTraverse(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(rootNode);//add()
        while (!queue.isEmpty()) {
            TreeNode tempNode 
                    = queue.poll();//remove()
            System.out.print(tempNode.data+"---->");
            
            if(tempNode.leftNode!=null){
                queue.offer(tempNode.leftNode);//add()
            }
            if(tempNode.rightNode!=null){
                queue.offer(tempNode.rightNode);//add()
            }
        }
    }
    
    public int maximumValueBinaryTree(TreeNode rootNode){
        if(rootNode==null){
            return Integer.MIN_VALUE;
        }
        int result=rootNode.data;
        int left=maximumValueBinaryTree(rootNode.leftNode);
        int right=maximumValueBinaryTree(rootNode.rightNode);
        if(left>result){
            result=left;
        }
        if(right>result){
            result=right;
        }
        return result;
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root.leftNode);
        stack.push(root.rightNode);
        while(!stack.empty()){
            TreeNode n1=stack.pop();
            TreeNode n2=stack.pop();
            if(n1==null && n2==null)continue;
            if(n1==null || n2==null ||n1.data!=n2.data){
                return false;
            }
            stack.push(n1.leftNode);
            stack.push(n2.rightNode);
            stack.push(n1.rightNode);
            stack.push(n2.leftNode);
        }
        return true;
    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();

//        TreeNode treenode= binaryTree.createInsertByUserTree();
//        binaryTree.recursiveInOrderTraverse(treenode);
        System.out.println("Recursive PreOrder Traverse");
        binaryTree.recursivePreOrderTraverse(binaryTree.rootNode);
        System.out.println("null ");
        System.out.println("Recursive InOrder Traverse");
        binaryTree.recursiveInOrderTraverse(binaryTree.rootNode);

        System.out.println("null");
        System.out.println("Recursive Postorder traversal");
        binaryTree.recursivePostorderTraversal(binaryTree.rootNode);

        System.out.println("null");
        System.out.println("Iterative using Stack InOrder traversal ");
        binaryTree.iterativeInorderUsingStackTraversal(binaryTree.rootNode);

        System.out.println("null ");
        System.out.println("Iterative using Stack PostOrder traversal ");
        binaryTree.iterativePostOrderUsingStackTraversal();

        System.out.println("null");
        System.out.println("Level Wise Traversing");
        binaryTree.levelWiseTraverse(binaryTree.rootNode);
        
        System.out.println("null");
        System.out.println("Maximum Value in BinaryTree");
        int result=binaryTree.maximumValueBinaryTree(binaryTree.rootNode);
        System.out.println("Maximum Value : "+result);
        
        System.out.println("Input User...");
//        binaryTree.createInsertByUserTree();

        System.out.println("Symetric binary tree");
        System.out.println("Result is binary = "+ isSymmetric(binaryTree.rootNode));
    }
}
