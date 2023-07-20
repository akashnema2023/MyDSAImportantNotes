/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author akash
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={2,3,1,5,6,7,8};
        HashSet<Integer> map=new HashSet<>();
        for(int num : arr){
            map.add(num);
        }
        for (int i = 1; i < arr.length; i++) {
            if(!map.contains(i)){
                map.add(i);
            }
        }
        System.out.println(map);
    }
}
