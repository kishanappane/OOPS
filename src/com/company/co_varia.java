package com.company;

// since java 5 we can have a covariant return type before that we could'nt able to override the method by changing its return type.
//by using this in class hierarchy we can get away with type casting (increases readability)
//java won't allow return type based overloading(compile type ,doesn't considers method type) but JVM does with the help method signature which contains return type as well.
//covariant data types is allowed for object types not for primitive types. and for object as well the child return type should be a child of parent return type .
//while over-riding we cannot reduce the scope of access modifier but we can increase the scope of access modifier

public class co_varia {
    public Number d1(double k)
    {
        System.out.println("double method");
        return null;
    }
    public static void main(String [] args)
    {
        child1 c=new child1();
        c.c1(10);
    }
}

class child1 extends co_varia{
    public Integer c1(double k1)
    {
        System.out.println("int method");
        return null;
    }
}
