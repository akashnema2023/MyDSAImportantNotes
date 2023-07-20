/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.practiceset;


/**
 *
 * @author akash
 */


public class SllPractice {
    
    private Node head;
    public static class Node{
        public int data;
        public Node nextNode;
        public Node(int data){
            this.data=data;
            this.nextNode=null;
        }
    }
    
    public void printsll(){
        Node tempsllPractice=head;
        while(tempsllPractice!=null){
            System.out.print(tempsllPractice.data+" ");
            tempsllPractice=tempsllPractice.nextNode;
        }
        
    }
    public void addnewnodeatposition(int vale, int position){
        Node newNode=new Node(vale);
        
        if(position==1){
            newNode.nextNode=head;
            newNode=head;
            
        }else{
            Node previNode=head;
             int count=1;
            while(count<position-1){
                previNode=previNode.nextNode;
                count++;
            }
            Node currenNode=previNode.nextNode;
           
            previNode.nextNode=newNode;
            newNode.nextNode=currenNode;
            
        }
    }
    
    
    
    public int additionsll(){
        Node temNode=head;
        int count=0;
        while(temNode!=null){
            count+=temNode.data;
            temNode=temNode.nextNode;
        }
        return count;
    }
    
    
    public static void main(String[] args) {
        SllPractice sllPractice=new SllPractice();
        sllPractice.head=new Node(10);
        Node n1=new Node(20);
        Node n2=new Node(40);
        
        sllPractice.head.nextNode=n1;
        n1.nextNode=n2;
        
        
        sllPractice.printsll();
        int result=sllPractice.additionsll();
        System.out.println(" result");
        System.out.println(result);
        
        sllPractice.addnewnodeatposition(60, 1);
        sllPractice.printsll();
    }
}
