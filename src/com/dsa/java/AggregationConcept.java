/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.java;

/**
 *
 * @author akash
 */
public class AggregationConcept {

    public static void main(String[] args) {

        Address address=new Address("Delhi");
        Details objDetails=new Details(101, "shubham");
        objDetails.sdisplay();
    }
}
class Address {

    String nameString;

    public Address(String nameString) {
        this.nameString = nameString;
    }

    public void display() {
        System.out.println("Address : " + nameString);
    }
}

class Details {

    int id;
    String snameString;

    Address address;
    public Details(int id, String snameString) {
        this.id = id;
        this.snameString = snameString;
    }
    public void sdisplay(){
        System.out.println(id+" "+snameString+" "+" "+address.nameString);
    }
}
