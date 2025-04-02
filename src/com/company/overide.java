//In over-riding the method resolution always takes care by JVM in runtime based on run-time object , that's why method over-riding is known as late-binding



package com.company;

public class overide {

    public  void m1()
    {
        System.out.println("parent");
    }

    public static void  m2()
    {
        System.out.println("static method");
    }

    public static void main(String [] args)
    {
        child c=new child();
        overide o = new overide();
        overide o1 = new child();
        c.m1();
        o.m1();
        o1.m1();       // -> it will give "Child" as output for above reasons.
    }

}
class child extends overide{
    public void m1()             //while over-riding we cannot decrease the access modifiers but we can increase the scope of the access modifiers.
    {
        System.out.println("child");
    }

    // public void m2() { }    --->this will give error as we cannot override class level method with object level method (static to non-static or non-static to static , only from static to static(METHOD HIDING))


}


