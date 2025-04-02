package com.company;

class a2{
    public  int add(int a,int b,int c)
    {
        return a+b+c;
    }

}

class B2 extends a2{
    public int add(int a,int b,int c)
    {
        System.out.println(a+b+c);
        return 0;
    }
}

public class mthdsignat  {


    public static void main(String [] args)
    {
        int a=10;
        int b=20;
        int c=30;

        B2 C=new B2();


        int k=C.add(a,b,c);
    }


}
