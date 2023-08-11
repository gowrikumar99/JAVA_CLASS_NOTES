/*
STATIC VARIABLES AND STATIC METHODS:-

 * i).the static key word in java is used for memory management.
 * ii).it makes your memory effecient[i.e  it saves memory].
 * iii).It can apply for variaables,methods ,and blocks.
 * iV).the static variable can be used to refer the common property of all objectes.
 * v).static variable gets memory only once in class area at the time of class loading.
 * 
 


 //EX :-1

class Student{
    int rollno;                      // instance variables
    String name;                     // instance variables


    // static key when we used one value more times use that particular time to use static keyword

 static String college="svcet";   // static variables  (at a time morethen onetime print);
 
 Student(int r,String n){   //constractor having parameter.parameter having variables.
   rollno=r;               // local variables
   name=n;                 // local variables
 }

 void display(){           // another method
   System.out.println(rollno+" "+name+" "+college);
 }
 public static void main(String args[]){   //  main method
   Student s1=new Student(101,"gowri");   //  new object variable creation
   Student s2=new Student(102,"appanna");    //  new object variable creation
   s1.display();   // object to call methods
   s2.display();
 }
}

//output

//101  gowri svcet;
//102 appanna svcet;



// EX:-2 DIFFERENCE BETWINE INSTANCE VARIABLE AND STATIC VARIABLE :-


// INSTANCE VARIABLE
class Student{
   int count=0;

Student(){
 count++;
System.out.println(count);
}
public static void main(String args[]){
   Student s1=new Student();
   Student s2=new Student();
   Student s3=new Student();
}
}

//o/p---->1,1,1


// STATIC VARIABLE  
class Student{
   static int count=0;

Student(){
 count++;
System.out.println(count);
}
public static void main(String args[]){
   Student s1=new Student();
   Student s2=new Student();
   Student s3=new Student();
}
}

o/p-----> 1,2,3



// RULES FOR ACCESSING INSTANCE STATIC MEMBERS(VARIABLES & METHODS);

1). INSTANCE VS INSTANCE
2). iNSTANCE VS STATIC 
3).STATIC VS STATIC
4).STATIC VS iNSTANCE 

i) An instance variables method can access instance variable and methods directly they belong to same class. 
ii).otherwise they must be ACCESSED ONLY by using reference variables(object). 


i) same class



class Student{
   int x=22;
   void m1(){
      System.out.println("instance method : m1");
   }
   void m2(){
      System.out.println(x);
   }
   public static void main(String args[]){
      Student a =new Student();
      a.m2();
   }
}

//output :-22

*/


