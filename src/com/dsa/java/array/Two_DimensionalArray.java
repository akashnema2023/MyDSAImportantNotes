
package com.dsa.java.array;

import java.util.Scanner;


public class Two_DimensionalArray {
    public static void main(String[] args) {
        int i, j,m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of ROW");
        m=sc.nextInt();
        System.out.println("Enter the size of COLUMN");
        n=sc.nextInt();
        
        int a[][]=new int[m][n];
        System.out.println("Enter the value");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                System.out.println("YOU ENTERD THE VALUE OF { "+i+" "+j+" }");
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Check Size of Column Manually  "+a[0].length);
        System.out.println("Search column wise matrix");
        Two_DimensionalArray bp=new Two_DimensionalArray();
//        bp.searchColwise(a, 4, 33);
//        bp.findElement(a, 33, m, n);
//        bp.additionofRow(a, m, n);
         int result= bp.largestElement(a,m);
         System.out.println("Index is "+result);
        
    }
    public void searchColwise(int[][] matrix, int n,int key){
        int i=0;
        int j=n-1;
        while(i<4&&j>=0){
            if(matrix[i][j]==key){
                System.out.println("found at "+i+" , "+j);
            }
            if(matrix[i][j]>key){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("NOt found");
    }
     public void additionofRow(int[][] arr,int m,int n){
        int i,j;
        for(i=0;i<m;i++){
           int sum=0;
            for(j=0;j<n;j++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
    }
    public void findElement(int[][] arr,int key,int m,int n){
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(arr[i][j]==key){
                    System.out.println("found at this place"+"{"+i+","+j+"}");
                }
            }
        }
    }
    public int largestElement(int [][] arr,int m){
        int maxi=Integer.MIN_VALUE;
        int rowIndex=-1;
        for(int row=0;row<m;row++){
            int sum=0;
            for(int col=0;col<arr[0].length;col++){
                sum+=arr[row][col];
            }
            if(sum>maxi){
                maxi=sum;
                rowIndex=row;
            }
        }
        System.out.println("Maximum value is "+maxi);
        return rowIndex;
    }
}
