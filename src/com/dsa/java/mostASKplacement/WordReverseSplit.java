/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java.mostASKplacement;

import java.util.Stack;

/**
 *
 * @author akash
 */
public class WordReverseSplit {

    public static void main(String[] args) {
          method3();
    }

    public static void method1() {
        String inputString = "java interview question";
        String demoString[] = inputString.split(" ");

        for (String resultString : demoString) {
            char ch[] = resultString.toCharArray();
            for (int i = ch.length - 1; i >= 0; i--) {
                System.out.print(ch[i]);
            }
            System.out.print(" ");
        }
    }

    public static void method2() {
        String inputString = "java interview question";
        char ch[] = inputString.toCharArray();
        for (int i = 0; i <= inputString.length()-1; i++) {
            if (ch[i] != ' ') {
                for(int j=ch[i];j>0;j--){
                    System.out.print(ch[j]);
                }
            }
            System.out.print("  ");
        }

    }
    public static void method3(){
        Stack<Character> stk=new Stack<>();
        String inString="hello world in java";
        char ch[]=inString.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            if(ch[i]==' '){
                while(!stk.empty()){
                    char c=stk.pop();
                    System.out.print(c);
                }
            }else{
                stk.push(ch[i]);
            }
            System.out.print(" ");
        }
        while(!stk.empty()){
            System.out.print(stk.pop());
        }
    }
}
