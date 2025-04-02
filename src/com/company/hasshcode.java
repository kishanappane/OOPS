package com.company;

import java.util.HashSet;

public class hasshcode {
    public static void main(String [] args)
    {
        String s="1";
        Integer  k=new Integer("1");
        String s1=new String("Kishan");
        System.out.println(s.hashCode());
        System.out.println(k.hashCode());

        HashSet<String> s9=new HashSet<>();
        s9.add(s1);
        s9.add(s);
        System.out.println(s9.size());

    }

}