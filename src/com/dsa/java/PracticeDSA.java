/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author akash
 */
public class PracticeDSA {

    public static void main(String[] args) {
        String inputString = "aabbcecdegjjkklomm";
        char[] ch=inputString.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (!map.containsKey(ch[i])) {//if it contain so it will give true if did'nt give us false.
                map.put(ch[i], 1);
            } else {
                int cnt = map.get(ch[i]);
                map.put(ch[i], cnt + 1);
            }
        }
        for (char cha : ch) {
            if (map.get(cha) == 1) {
                System.out.println(cha + "not repeated");
                break;
            }
        }
        printlnNonReperated();
        findSP();
    }
    public static void printlnNonReperated(){
        int[] arr={22,3,4,6,7,2,8,3,2};
        Map<Integer,Integer> mp=new LinkedHashMap<>();
        for(int i=0;i<=arr.length-1;i++){
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], 1);
            }else{
                int cnt=mp.get(arr[i]);
                mp.put(arr[i], cnt+1);
            }
        }
        System.out.println(mp);
        for(int i : arr){
            if (mp.get(i)!=2) {
                System.out.println(i);
            }
        }
    }
    public static void findSP(){
        int p=100;
        int r=10;
        int t=2;
        int result=p*r*t/100;
        System.out.println(result);
    }
    public static void primeNumber(){
        int flag=1;
        
    }
    

}
