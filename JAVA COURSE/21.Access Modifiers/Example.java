/*
Accaess specifiers(Modifiers):
==============================

1).The access specifiers canbe used to define the level of accessibulity of either the member in the class/interface of the level of accesssibulity of class in apackage.
2).Using the assessbility specifiers we can define the scope of a class.
3)the java language provides 4 level languages of class specifiers with three kaywords,
LIST OF ACCESS MODIFIERS
 * 1).PUBLIC  (class,interfaces,variables,methods,constractors)
 * 2).PRIVATE (variables,methods,constractors)
 * 3).PROTECTED (variables,methods,constractors)
 * 4).DEFAULT (class,interfaces,variables,methods,constractors)
 * 
 * 
 * 
 * ------------------------------------------------
 
 1).Public Access modifier
The public access modifier is specified using the keyword public. 

The public access modifier has the widest scope among all other access modifiers.
   Classes, methods, or data members that are declared as public are accessible from everywhere in the program.
   There is no restriction on the scope of public data members.



//1). public modifier 

class Example1 
{ 
public void display() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
}
 
Output:

GeeksforGeeks


  2). DEFAULT ACCESS MODIFIERS :-  

 class Example{
    void display(){
        System.out.println("HELLO WORLD");
        System.out.println("MY NAME IS : ");
        System.out.println("DUKKA");
        System.out.println("GOWRIKUMAR");
    }
 }
 
 //o/p 

  HELLO WORLD 
  MY NAME IS  
  DUKKA 
  GOWRIKUMAR

  NOTE :-

  1).FIRST OFF ALL WE CREATE 2 INDIVIDUAL classes and 
  2).in first class we create one method and 
  3).in second class we create main method and create an object
  4).call to object to method.  

  
  
   // 3). PRIVETE ACCESS MODIFIER

  class Example{
    private void display(){
        System.out.println("this is privete method");
    }
  }

  o/p 

error: display() has privete access in a obj.display();

 

 // 4). PROTECTED ACCESS MODIFIERS

  class Example{
    protected void display(){
        System.out.println("this is protected method");
    }
  }

  o/p 

  this is protected method

  */

//  4) DEFAULT ACCESS MODIFIER

