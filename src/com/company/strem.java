package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class strem {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        int i=0;
        while (lst.size() < 10) {
            lst.add(i);
//            System.out.println(lst.get(lst.size()-1));
            i++;

        }


        List<Integer> lst1=lst.stream().filter(x->x%2==1).sorted((val1,val2)->val2-val1).map(x->x*2).collect(Collectors.toList());
        lst1.stream().forEach(x->System.out.println(x));
        int min=lst1.stream().min((val1,val2)->val1-val2).get();
        int max=lst1.stream().max((val1,val2)->val1-val2).get();
        int sum=lst1.stream().reduce(0,(a,b)->a+b);
        System.out.println("The min element is :" + min);
        System.out.println("The max element is :" + sum);


    }
}
