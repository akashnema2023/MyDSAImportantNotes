/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class PrintArraySpiral {

    public static void main(String[] args) {
        int i, j, m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of ROW");
        m = sc.nextInt();
        System.out.println("Enter the size of COLUMN");
        n = sc.nextInt();

        int a[][] = new int[m][n];
        System.out.println("Enter the value");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                System.out.println("YOU ENTERD THE VALUE OF { " + i + " " + j + " }");
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        PrintArraySpiral pas = new PrintArraySpiral();
        pas.printSpiral(a, m, n);
    }

    public void printSpiral(int[][] matrix, int r, int c) {
        int i, k = 0, l = 0;//l=col, k=row,r=4,c=4
        while (k < r && l < c) {
            for (i = l; i < c; i++) {
                System.out.print(matrix[k][i] + "  ");
            }
            k++;
            for (i = k; i < r; i++) {
                System.out.print(matrix[i][c - 1] + "  ");
            }
            c--;
            if (k < r) {
                for (i = c - 1; i >= l; i--) {
                    System.out.print(matrix[r - 1][i] + "  ");
                }
                r--;
            }
            if (l < c) {
                for (i = r - 1; i >= k; i--) {
                    System.out.print(matrix[i][l] + "  ");
                }
                l++;
            }
        }
    }
}
