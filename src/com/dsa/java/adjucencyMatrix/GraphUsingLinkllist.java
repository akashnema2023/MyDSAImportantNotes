/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.adjucencyMatrix;

import java.util.LinkedList;

/**
 *
 * @author akash
 */
public class GraphUsingLinkllist {
    LinkedList<Integer>[] adj;
    public static void main(String[] args) {
        GraphUsingLinkllist gul=new GraphUsingLinkllist(4);
        gul.addEdge(0, 1);
        gul.addEdge(1, 2);
        gul.addEdge(2, 3);
        gul.addEdge(3, 0);
    }
    public GraphUsingLinkllist(int nodes){
        this.adj=new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            this.adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
    }
}
