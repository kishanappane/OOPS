package com.company;

class A{
    public void a1(){
        System.out.println("A1 Method");
    }
}

class B extends A{
    public void b1(){
        System.out.println("b1 Method");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        A a =new B();
        a.a1();


    }
}
