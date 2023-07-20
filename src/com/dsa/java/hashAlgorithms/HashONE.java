/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.hashAlgorithms;

/**
 *
 * @author akash
 */
import java.util.HashMap;
public class HashONE {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("one", 101);
        map.put("second", 102);
        System.out.println(map);
        if (map.containsKey("second")) {
            System.out.println("found");
        }
        boolean f=map.containsValue(202);
        System.out.println(map.containsKey("second"));
        System.out.println(map.containsValue(101));
        System.out.println("Get key "+map.get("one"));
        StringBuffer sfBuffer=new StringBuffer();
        sfBuffer.append("hello");
        System.out.println(sfBuffer);
    }
}
