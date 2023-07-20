 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class ExcceptionHandling {

    public static void main(String[] args) {
        ExcceptionHandling ecHandling = new ExcceptionHandling();

        try {
            ecHandling.method();
        } catch (Exception e) {
            System.out.println("catch by meain method " + e);
        }

        try {
            ecHandling.method1();
        } catch (Exception e) {
            System.out.println("method1 is throw a exception : " + e);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("after exception thread");
    }

    public void method() throws ArithmeticException {
        int sum = 10 / 0;
        System.out.println("handle" + sum);
    }

    public void method1() {
        throw new ArrayIndexOutOfBoundsException();
    }
}
