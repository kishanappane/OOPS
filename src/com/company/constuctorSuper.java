//super or this can only be used inside of the constructor but not inside methods

package com.company;

public class constuctorSuper {

    constuctorSuper(){
        System.out.println("This will give error ");
     //   super();        // --> super should be the first statement inside the constructor if we are using it.  this()  should also be in first side which means we cannot use both simultaneoulsy
    }
}
