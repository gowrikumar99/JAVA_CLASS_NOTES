
/* 
//  *******  ABSTRACTION CLASS IN JAVA ******

1). A class that is declared using "abstract" keyword is issu know as abstract class
2).it can have abstract methods(methods without body) as well as as concreat methods(regular methods with body).
3).an abstract class can not an object an object of it.
4).A class deliverd from the abstract class must implement all those methods are declared as abstract in the parent class.


//  ***** ABSTRACT METHOD IN JAVA ****

1).abstract method has no body(only decleration no dfinition).
2).always end the decleration with a semicolan(;). 
3).It must be overhidden.an abstract class must be overridden
   and in a same way abstract method must be overridden.
4).A class has to be declered abstract to have abstract methods.

///   *** important points  **** 

1).an abstract class may also have concrate(complite) method.
2).for design a class can be declered abstract even if it does not contain any abstract method.
3).reference of an abstract class can point to obstract of the it's sub-class there by achiving run-time polymorpisim. 
4). A class must be complesery labeled abstract ,if it has one or more abstract methods. 
5).it can have constractor and static methods also.



 abstract class Example{       // abstract class
    abstract void Sound();     // abstract method
        void display(){       // concreat method
        System.out.println(" I am from animal class");
        }
    }
    class dog extends Example{     // inheretance
        void Sound(){              // method overriding
            System.out.println("barking");
        }
        public static void main(String args[]){
            dog d=new dog();
            d.Sound();
        }
    }

    o/p---barking 



    Note :-
    i). we have create abstract class and create abstract method and concreat method also. 
    ii).and another sub class and overloading the abstract method  
    iii).create main method and create object also 
    iV). we can not create abstract class to create object
    and must and should be use abstract method in sub method override
    
    
    // Ex:- ABSTRACT CLASS WITH REFERENCE VARIABLES :-  

    abstract class Example{
        abstract void sound();
        void display(){
            System.out.println("i am from animal class");
        }
    }

    class dog extends Example{
        void sound(){
             System.out.println("Barking");
        }
    public static void main(String args[]){
        Example e=new dog();
        e.sound();
        e.display();
    }
    }

    o/p--->
  barking 
  i am from animal class

  Note :--
  1.we can create abstract class and abstract method and constractor class
  2).we can extends sub class to main class .
  3).we can create main method 
  4.we can create object also here we reference to abstract class to sub class. 
  5).and then after object also to all call abstract method and constractor method.
  6).we cannot create abstract class object like(anima a -new animal());




  NOTE :-
  1).abstract keyword +final key word at a time method we cnot usins that.

  Ex:-
  abstract class Example{
    abstract final void sound();
    void display(){
        System.out.println("i am from animal class")
    }
  }
o/p  ---Error

2).abstract keyword+static keyword at a time method we not using that. 
abstract class Example{
    abstract static void sound();
        void display(){
            system.out.println("I am from animal class");
        }
    }


    o/p--- ERROR 

3). abstract class+ finalkeyword at a time we not using that abstract class Example. 
abstract final class Example{

}
  o/p--- Error

  

4). we can use abstract class to in  
i).abstract method
ii).concreate method 
iii).constractor 
iV).static method 



EX:-- 


abstract class Example{   // abstractor class
    abstract void sound();   //abstractor method
        void display(){    // concreat method
System.out.println("i am from animal class");
} 
Example (){         // constractor
    System.out.println("constractor");
}
  static void m1(){           // static method
    System.out.println("this is static method");
}
}
class dog extends Example{      // inheretance method
    void sound(){
        System.out.println("barking");
    }
    public static void main(String args[]){   // main method
        dog d=new dog();
        d.sound();
    }
}

o/p barkingconstractor */


    

 
