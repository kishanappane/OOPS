//as both the methods have static it is method hiding , the  method resolution is takes care with the help of reference type in compile time



package com.company;

public class method_hide {
    public static void m1()
    {
        System.out.println("parent static");
    }

    public static void main(String [] args)
    {
        method_hide p=new method_hide();
        p.m1();   //parent

        cil c=new cil();
        c.m1(); //child

        method_hide p1=new cil();
        p1.m1(); //parent
    }
}
class cil extends method_hide{
    public static void m1()
    {
        System.out.println("Child static");
    }

}
