package com.company;

public class methodSignature {

    public void add(int a )        //MthdSign add(int)
    {

    }

    public void add(String a)       // MthdSign add(string)
    {

    }


/*
    public int add(int j)    //this will give the error bcoz we already have a similar method signature which is add(int), so we cannot have another method with similar sign as the return type is not considered in m=method signature.
    {
        return j;
    }
*/


}
