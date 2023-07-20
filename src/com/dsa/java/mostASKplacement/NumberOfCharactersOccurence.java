/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author akash
 */
public class NumberOfCharactersOccurence {

    public static void main(String[] args) {
        String inputString = "hello";//example h-1,e-1,l-2,0-1 key contains characters and values contains number of ocurence
//        Map<Character, Integer> map = new HashMap<>();//HashMap is a interface so we couldn't create the object and it is not follow the sequence order to store the character.
        Map<Character, Integer> map = new LinkedHashMap<>();//its follow sequence.
        char[] cha = inputString.toCharArray();
        for (char ch : cha) {
            System.out.println("Character is : "+ch);
            if (!map.containsKey(ch)) {//ager l present hai toh true nhi false return krdo that could go througth the else part
                map.put(ch, 1);
            } else {
                int cnt = map.get(ch);
                map.put(ch, cnt+1);
            }
        }
        System.out.println(map);
    }
}
