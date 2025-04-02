package com.company;
// super and this are used to refer parent and child class variable respectively ,this is mainly used when both clasess have similar varibles.
//inside static area we cannot use this and super as they talk about object but the static area is refers to class and not objects
public class SuperThis {

    public static void main(String [] args) {
        childthis c = new childthis();
        c.m1();

    }

}

class Parent{
    String s = "This is parent variable";
}

class childthis extends Parent{

    String s="this is child class";
    public void m1(){
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
