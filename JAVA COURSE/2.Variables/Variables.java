/*Variables :-
A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.
Variable is a name of memory location. There are three types of variables in java: local, instance and static.
There are two types of data types in Java: primitive and non-primitive.

Variable :-
A variable is the name of a reserved area allocated in memory. In other words, it is a name of the memory location.
 It is a combination of "vary + able" which means its value can be changed.

1) Local Variable  :-
 A variable declared inside the body of the method is called local variable.
 You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
 A local variable cannot be defined with "static" keyword.

// Java Program to implement
// Local Variables  
import java.io.*;
 
class GFG {    // main class
    public static void main(String[] args)   // main method
    {
        // Declared a Local Variable
        int var = 10;
 
        // This variable is local to this main method only
        System.out.println("Local Variable: " + var);
    }
}
/* 
2) Instance Variable :-
A variable declared inside the class but outside the body of the method, is called an instance variable.
 It is not declared as static.
 It is called an instance variable because its value is instance-specific and is not shared among instances. 

class Variables{    // main class
    int x=20;      // instance variable
    public static void main(String args[]){   // main method
       Variables g1= new Variables();    // new object variable create(g1)
       System.out.println(g1.x);  // print the objext variable
    }
}

3) Static variable :-
 A variable that is declared as static is called a static variable. It cannot be local.
 You can create a single copy of the static variable and share it among all the instances of the class.
  Memory allocation for static variables happens only once when the class is loaded in the memory.  
  class Variables{    // main class
    static int x=900;   // static variable
    public static void main(String args[]){    // main method
    System.out.println(x);  // method
  }

  }

 */