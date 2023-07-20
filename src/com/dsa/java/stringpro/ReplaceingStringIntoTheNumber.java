/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stringpro;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author akash
 */
public class ReplaceingStringIntoTheNumber {

    public static void main(String[] args) {
        String str = "opentext";
        char occu = 't';

        //check
        /*
        if (str.indexOf(occu) == -1) {
            System.out.println("Not found repeated occurence");
        }
        char[] ch = str.toCharArray();
        int count = 1;
        for (int i = 0; i <= ch.length - 1; i++) {
            if (ch[i] == occu) {
                ch[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i <= ch.length - 1; i++) {
            System.out.print(" " + ch[i]);
        }
        */
        
        char[] arr=str.toCharArray();
        char chartoreplace='t';
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            char ch=str.charAt(i);
            if(ch==chartoreplace){
                str = str.replaceFirst(String.valueOf(chartoreplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
     }
}
