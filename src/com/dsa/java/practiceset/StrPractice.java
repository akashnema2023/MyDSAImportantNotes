/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.practiceset;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class StrPractice {
    
    
   public boolean istrue(){
       String demoString="nitin";  
       char demo[]=demoString.toCharArray();
       int start=0;
       int end=demoString.length()-1;
       while(start<end){
           if(demo[start]!=demo[end]){
               return false;
           }
           start++;
           end--;
       }
       return true;
   }
    public static void main(String[] args) {
        String string="helloworld";
//        for(int i=0;i<=string.length()-1;i++){
//            System.out.println(string.charAt(i));
////        }
//System.out.println("Enter name");
//Scanner sc=new Scanner(System.in);
//String str1=sc.nextLine();
//        System.out.println("you entered"+str1);
        boolean result=new StrPractice().istrue();
        System.out.println(result);
    }
}
