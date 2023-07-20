/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class Rotational {
    public static void main(String[] args) {
        Rotational rotational=new Rotational();
        int arr[]={1,2,3,4,5,6,7};
        rotational.rotate(arr, 3);
    }
    public void rotate(int[] nums, int k) {
        int len=nums.length-1;
        int haf=len-k;
        for(int i=0;i<=haf;i++){
            int temp=nums[i];
            nums[i]=nums[haf];
            nums[haf]=temp;
        }
        for(int i=haf+1;i<=len;i++){
            int temp=nums[i];
            nums[i]=nums[len];
            nums[len]=temp;
        }
        for(int i=0;i<len;i++){
           System.out.print(nums[i]+" ");
        }
    }
}

