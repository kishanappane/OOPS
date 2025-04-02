//Constructors are used to initialize the objects .
// the access modifier of the default constructor is same as class modifier


//recursive constructor will give compile time error;
//the default constructor will always have one line which is super()
package com.company;

public class Constructor {

    public static void main(String [] args)
    {

    }
}


class parent{


    void parent()            //we can have a method name same as class name but it is not advisable
    {
        System.out.print("Parent ");
    }

    public parent()         // we can assign modifiers to the constructor as well public ,protected , private and default are allowed. private access modifiera are used in singleton classess
    {
        System.out.println("Parent constructor with access modifier");
    }

}
