/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author akash
 */
public class TwoSumProblem1 {
    public static void main(String[] args) {
        int arr[]={2,11,5,10,7,8};
        int target=15;
        int total=0;
       int result[]= solveMethod1(arr, target);
        System.out.println(result[0]+" "+result[1]);
        for(int i=0;i<result.length;i++){
            System.out.println("Index is "+result[i]+" = "+arr[result[i]]);
            total+=arr[result[i]];
        }
        System.out.println("Result is "+(arr[result[0]]+arr[result[1]]));
        System.out.println(total);
        
        System.out.println("___________________________");
        int arr1[]={11,2,0,10,7,6};
        int result1[]=solveMethod2(arr1, 17);
        for(int i=0;i<result1.length-1;i++){
            System.out.println("Index is "+result1[i]+" = "+arr[result1[i]]);
        }
    }
    public static int [] solveMethod1(int arr[],int target){
        int result[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        int numberlength=arr.length;
        for(int i=0;i<numberlength;i++){
            if(!map.containsKey(target-arr[i])){
                map.put(arr[i], i);
            }else{
                result[1]=i;
                result[0]=map.get(target-arr[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("not found");
//        return result;
    }
    public static int[] solveMethod2(int arr[],int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int[] result=new int[2];
        while(left<right){
            int sum=arr[left]+arr[right];
            if (sum==target) {
                result[0]=arr[left];
                result[1]=arr[right];
                return result;
            }else if (sum<target) {
                left++;
            }else{
                right--;
            }
            
        }
        throw new IllegalArgumentException("not found");
//return new int[0];
    }
}
