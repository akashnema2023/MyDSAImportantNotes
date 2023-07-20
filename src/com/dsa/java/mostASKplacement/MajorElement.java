/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author akash
 */
public class MajorElement {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        int[] arr={2,3,4,2,5,3,6,3,3,6,7,2,3,8,2,2,2,2};
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int n : arr){
            if (!map.containsKey(n)) {
                map.put(n, 1);
            }else{
                int cnt=map.get(n);
                map.put(n, cnt+1);
            }
        }
        System.out.println(map);
        System.out.println(map.entrySet());
      
        int a=1;
        for(int i=0;i<=arr.length-1;i++){
            if(a<map.get(arr[i])){
                a=map.get(arr[i]);
            }
        }
        for(int j : arr){
            if(1<map.get(arr[j])){
                System.out.print(arr[j]+", ");
            }
        }
    }

//        for(int i : arr){
//            
//        }
    }

