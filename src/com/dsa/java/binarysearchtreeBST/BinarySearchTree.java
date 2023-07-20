/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.binarysearchtreeBST;

/**
 *
 * @author akash
 */
public class BinarySearchTree {
    
    private TreeNode rootNode;
    
    private class TreeNode {
        
        private TreeNode leftNode;
        private TreeNode rightNode;
        private int data;
        
        public TreeNode(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }
    
    public void insertNode(int value) {
        rootNode = insertNode(rootNode, value);
    }
    
    public TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.leftNode = insertNode(root.leftNode, value);
        }
        if (value > root.data) {
            root.rightNode = insertNode(root.rightNode, value);
        }
        return root;
    }
    
    public void preOrderTraversal() {
        preOrderTraversal(rootNode);
    }
    
    public void preOrderTraversal(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        System.out.print(rootNode.data + "---->");
        preOrderTraversal(rootNode.leftNode);
        preOrderTraversal(rootNode.rightNode);
    }
    
    public TreeNode searchValue(int value) {
        return searchValue(rootNode, value);
    }
    
    public TreeNode searchValue(TreeNode rootNode, int key) {
        if (rootNode == null || rootNode.data == key) {
            return rootNode;
        }
        if (key < rootNode.data) {
            return searchValue(rootNode.leftNode, key);
        } else {
            return searchValue(rootNode.rightNode, key);
        }
    }
    
    public boolean validateBST(TreeNode rootNode, long min, long max) {
        if (rootNode == null) {
            return true;
        }
        if (rootNode.data <= min || rootNode.data >= max) {
            return false;
        }
        boolean left = validateBST(rootNode.leftNode, min, rootNode.data);
        if (left) {
            boolean rigth = validateBST(rootNode.rightNode, rootNode.data, max);
            return rigth;
        }
        return false;
    }
    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.insertNode(21);
        bst.insertNode(42);
        bst.insertNode(5);
        bst.insertNode(11);
        bst.insertNode(4);
        bst.insertNode(33);
        bst.insertNode(66);
        bst.insertNode(bst.rootNode, 54);

//        bst.preOrderTraversal(bst.rootNode);
        bst.preOrderTraversal();
        System.out.println(" ");
        if (bst.searchValue(14) != null) {
            System.out.println("Key found!!!");
        } else {
            System.out.println("not found!!");
        }
      boolean result=  bst.validateBST(bst.rootNode, Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println("result"+result);
        
    }
}
