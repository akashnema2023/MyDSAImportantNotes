/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.adjucencyMatrix;

/**
 *
 * @author akash
 */
public class Graph {
    int[][] adjmatrix;
    public static void main(String[] args) {
        Graph gpGraph=new Graph(4);
        gpGraph.addEdges(0, 1);
        gpGraph.addEdges(1, 2);
        gpGraph.addEdges(2,3);
        gpGraph.addEdges(3, 0);
        gpGraph.printmatrix();
    }
    public Graph(int nodes){
        this.adjmatrix=new int[nodes][nodes];
    }
    public void addEdges(int u,int v){
        this.adjmatrix[u][v]=1;
        this.adjmatrix[v][u]=1;
    }
    public void printmatrix(){
        for (int i = 0; i < adjmatrix.length; i++) {
            for (int j = 0; j < adjmatrix.length; j++) {
                System.out.print(adjmatrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
