 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.stringpro;

/**
 *
 * @author akash
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "programming";

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i+1);
            if(idx==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
