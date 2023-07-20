/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.array;

/**
 *
 * @author akash
 */
public class Palindrome {
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        boolean result=new Palindrome().isPalindrome(arr);
        System.out.println("REsult is "+result);
    }
    public boolean isPalindrome(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}
