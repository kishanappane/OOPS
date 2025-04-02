package com.company;

public class inrit {

    public  static void main(String [] args){
        A8 a=new B8();
        //a.add();

        //B8 b=new A8();
        //b.add();
    }
}

class A8{
    public void  add(){
        System.out.println("Adding A");
    }
}

class B8 extends  A8{
    public void sub(){
        System.out.println("Subtracting B");
    }

    public void add(){
        System.out.println("Adding B");
    }

}
