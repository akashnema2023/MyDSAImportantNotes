/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.hashAlgorithms;

/**
 *
 * @author akash
 */
public class HashTable {

    private HashNode[] buckets;
    private int numbofbuckets;//capacity
    private int size;//number of key value paires in hash table or number of hash nodes

    private class HashNode {

        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
            next=null;//
        }
    }

    public HashTable() {
        this(10);
    }

    public HashTable(int capacity) {
        this.numbofbuckets = capacity;
        buckets = new HashNode[numbofbuckets];
        this.size = 0;
    }

    public void put(Integer key, String value) {
        int bucketindex = getbucketIndex(key);
        HashNode head = buckets[bucketindex];
        while (head != null) {

            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketindex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketindex] = node;

    }

    public String remove(int key){
        int bucketindex=getbucketIndex(key);
        HashNode head=buckets[bucketindex];
        HashNode previous=null;
        while(head!=null){
            if(head.key.equals(key)){
                break;
            }
            previous=head;
            head=head.next;
        }
        if(head==null){
            return null ;
        }
        size--;
        if(previous!=null){
            previous.next=head.next;
        }else{
            buckets[bucketindex]=head.next;
        }
        
        return head.value;
        
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String get(Integer key) {
        int bucketIndex=getbucketIndex(key);
        HashNode head=buckets[bucketIndex];
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

//    public String remove(Integer key) {
//        int bucketIndex=getbucketIndex(key);
//        HashNode head=buckets[bucketIndex];
//        while(head.next!=null){
//            if(head.next.key.equals(key)){
//            }
//        }
//    }

    public int getbucketIndex(Integer key) {
        return key % buckets.length;
    }

    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(101, "hello");
        table.put(102, "hey");
        table.put(111, "welcome");
        System.out.println("Size of hashtable " + table.size);
        String resultString=table.get(111);
        System.out.println("Result is "+resultString);
         String n=table.remove(111);
         System.out.println("Removed "+n);
    }
}
