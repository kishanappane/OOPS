package com.company;

//it is better to declare default constructor  like A0() just to avoid CE coz if we forgot to initialize any constructor then the default constructor will have a super() method which might cause a issue

public class Constructor2 {

    public static void main(String [] args)
    {
        B0 b =new B0();
        System.out.println("calling c object");
        C0 c = new C0(10);
    }
}

class A0{
    A0(){
        System.out.println("A0");
    }

    A0(int i){
        System.out.println("int constructor A0");
    }
}

class B0 extends A0{
    B0(){
        System.out.println("B0");
    }

    B0(int i){
        System.out.println("int constructor B0");
    }
}

class C0 extends B0{
    C0(int i){
        System.out.println("Int Constructor C0");
    }
}
