package com.company;

import  java.util.*;                                               //comparable modifies the original class but comparator doesn't
//package com.company;                                             //comparable uses compareTo while comparator uses Compare
class Student implements Comparable<Student>{                      //to sort in comparable we need to use Collections.sort(lst) , while in comparator we use Collections.sort(lst,new NameComp()<>)
    String name;                                                   //we can only sort by using only one parameter in comparable, but in comparator we can use many parameter by having different comparators for each parameter.
    int age;

    Student(String name,int age){
    //  this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student that)
    {
        if(this.age%10>that.age%10)
            return 1;
        else
            return -1;
    }

    public String toString(){
        return name + " "+ age;
    }
}


class Namecomp implements Comparator<Student>
{
    public int compare(Student i,Student j)
  {
    if(i.name.length()>j.name.length())
    {
        return 1;
    }
    else
        return -1;
  }

}

public class compare {
    public static void main(String [] args)
    {
        List<Student> lst=new ArrayList<>();
        lst.add(new Student("kishan",20));
        lst.add(new Student("appane",25));
        lst.add(new Student("Ram",19));
        lst.add(new Student("karan",33));

// Collections.sort(lst,new Namecomp());
   Collections.sort(lst);
        for(Student i:lst)
        {
            System.out.println(i);

        }
    }
}
