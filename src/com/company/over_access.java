package com.company;

public class over_access {

    public void parent(int k)
    {
        System.out.println("Public ");
    }
    public static void main(String [] args)
    {
        child_over ch= new child_over();
        ch.parent(45);
    }
}

class child_over{
     void parent(int k)
    {
        System.out.println("Private");
    }
}

