/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class InheritancePractice {
    public static void main(String[] args) {
        ChildClass1 cc=new ChildClass1();
        cc.resultC1();
        ChildClass2 cc1=new ChildClass2();
        cc1.resultc2();
        ChildClass3 cc2=new ChildClass3();
        cc2.resultC3();
        
        //interface
        
        Parent2Class objClass=new Parent2Class();
        int result=objClass.multiply(2, 4);
        System.out.println("REsult is "+result);
            
    }
}
class ParentClass{
    public int additionp(int a, int b){
        return a+b;
    }
}
class ChildClass1 extends ParentClass{
    public void resultC1(){
        System.out.println("Child1 class method is Started");
        int result=additionp(20, 20);
        System.out.println(result);
    }
}
class ChildClass2 extends ChildClass1{
    public void resultc2(){
        resultC1();
    }
}
class ChildClass3{
    ParentClass objClass=new ChildClass1();
    ChildClass2 obChildClass2=new ChildClass2();
    public void resultC3(){
        System.out.println("Child class 3 is getting start");
        int result=objClass.additionp(20, 30);
        System.out.println(result);
        obChildClass2.resultc2();
    }
}
interface Grandfather{
    public int multiply(int a,int b);
    public void resultgp();
}
class Parent2Class implements Grandfather{
    @Override
    public int multiply(int a,int b){
        return a+b;
    }
    @Override
    public void resultgp(){
        System.out.println("succcessfully interface");
    }
}