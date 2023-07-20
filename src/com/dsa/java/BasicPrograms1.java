package com.dsa.java;

import java.util.Scanner;

public class BasicPrograms1 {

    public static void main(String[] args) {
//        1-D array implementation
//        int i, n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of arry");
//        n=sc.nextInt();
//        int a[]=new int[n];//intializer array
//        System.out.println("Enter the values in arrays");
//        for(i=0;i<n;i++){
//            a[i]=sc.nextInt();
//            System.out.println("YOU ENTER : "+a[i]+", "+"INDEX OF : "+i);
//            System.out.println("Enter the values in arrays");
//        }
//        for(i=0; i<n;i++){
//            System.out.println(a[i]);
//        }
//        
        

         int result=new BasicPrograms1().simple(20, 30);
         System.out.println("REsult is "+result);
        
        BasicProgram3 resultBasicProgram3=new BasicProgram3();
        int result1 =resultBasicProgram3.simple(10, 30);
        System.out.println(" REsult 1 is "+result1);
        
        
        
    }
    public int simple(int a,int b){
        int a1=a;
        int b1=b;
        int sum=a1+b1;
        return sum;
    }
   

}
