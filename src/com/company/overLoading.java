//OverLoading is a Compile Time Polymorphism
//in overLoading method resolution is always done by compiler based on reference types(left side) that is why it is also called as early binding


package com.company;

class Animal{
}

class Monkey extends Animal{}

 class Test {
    public void m1()
    {
        System.out.println("void arg");
    }

    public void m1(int i)
    {
        System.out.println("int arg");
    }

    public void m1(double j)
    {
        System.out.println("double arg");
    }

    public void m2(int i ,float j)
    {
        System.out.println("int-float");
    }

     public void m2(float i, int j )
     {
         System.out.println("float-int");
     }

     public void m3(Animal a)
     {
         System.out.println("Animal");
     }

     public void m3(Monkey m)
     {
         System.out.println("Monkey");
     }


}

public class overLoading{
    public static void main(String [] args)
    {
        Test t= new Test();
        Animal a =new Animal();
        Monkey m = new Monkey();
        Animal a1 = new Monkey();
        t.m1();
        t.m1(3);
        t.m1(3.2);
        t.m1('a');              //automatic promotion will happen to next type in this case , m1(int ) will be called     (Automatic promotion in overloading)
                                  //in overloading child version is given priority over parent in case of object and string methods.
       // t.m1(null);               // in some cases where is no relation(parent-child) between method args compiler will throw error


        //t.m2(10 ,10);          //this will give us the CE as there is ambiguity.

        t.m3(a);
        t.m3(m);
        t.m3(a1);                 //output : "Animal"  as in method overloading the resolutionn takes place based on reference type

    }

}


