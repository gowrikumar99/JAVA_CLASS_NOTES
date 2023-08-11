/*  

  //   ********* SUPER KEYWORD :--

 i).the super keyword is used for accissing parent class instance members(instance variable and instance methods) and constractors.
 ii).the super keyword can be specified eather in child class constractors or child instance methods.
 iii).the super keyword cannot be specified in child class static methods. 


EX:--1       ***** SUPER KEYWORD ******
 
class Example{                       // super class
    int x=30;                        // instance variable
}
class gowrikumar extends Example{    // sub class

    int x=10;                        // instance variable
    void m1(){                       // sub-method
        int x=20;                    // local variables
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }

public static void main(String args[]){   // main method
    gowrikumar a = new gowrikumar();      // main method
    a.m1();

}}

o/p :-
20
10
30 

NOTE :--   


// EX:-2 *****    USING THE SUPER KEY WORD WITHMETHOD ********

class Example{

    void m1(){
     System.out.println("Hello from parent");
    }

} 
class gowri extends Example{

    void m1(){
      super.m1();
      System.out.println("Hello from the child");
    }
    public static void main(String args[]){
        gowri g1=new gowri();
        g1.m1();
    }
}

o/p 

Hellow from the parent
Hellow from the child   


EX-3 ***** USING CONSTRACTOR WITH SUPER KEYWORD  ***** //

class Example{
    Example(){
        System.out.println("Parent");
    }
}
class gowri extends Example{
    gowri(){
        super();
        System.out.println("child");
    }

    public static void main(String args[]){
        gowri g1=new gowri();
    }
}

o/p --->
parent
child 

*/