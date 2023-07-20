/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.heap;

/**
 *
 * @author akash
 */
public class MaxPriorityQueue {

    public int[] heap;
    public int n;//size of max heap

    public MaxPriorityQueue(int capacity) {
        heap = new int[capacity + 1];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void resize(int size) {
        int temp[] = new int[size];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    //bottom-up reheapify(Swim)
    public void insert(int x) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    public void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;
        }
    }

    //top-down reheapify(sink)
    public int deleteMax() {
        int max = heap[n];
        swap(1, n);
        n--;
        sink(1);
        if (n > 0 && n == (heap.length - 1) / 4) {
            resize(heap.length / 2);
        }

        return max;
    }

    public void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && heap[j] < heap[j + 1]) {
                j++;
            }
            if (heap[k] >= heap[j]) {
                break;
            }
            swap(k, j);
            k = j;
        }

    }

    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void printMaxpq() {
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {

        MaxPriorityQueue mpq = new MaxPriorityQueue(3);
        mpq.insert(20);
        mpq.insert(3);
        mpq.insert(12);
        mpq.insert(66);
        mpq.insert(7);
        mpq.insert(9);
        mpq.insert(14);
        mpq.insert(16);

        int result = mpq.deleteMax();
//        mpq.deleteMax();

        mpq.printMaxpq();
        System.out.println("size of " + mpq.size() + " " + mpq.isEmpty() +" "+ "length of n is " + mpq.n + " Delete is " + result);

    }
}
