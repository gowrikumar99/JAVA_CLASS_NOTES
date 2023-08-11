//  *****   Exception Handling  *****

/* 
Exception :-  is a  runtime error which occuressduring exception of the program. when the pexeption occures the exception of the prorgam
              stoped by abnormaly.
            
exceptions are two types :-

1).checked exception : - i).I/o exception.
                         ii).file exception.
                         iii).sql exception.

2).unchecked -exception :-
          unchecked exceptions are 5 types:-
          i).Arthematic exception
          ii).ArrayIndex exception
          iii).Number-foundation exception.
          iv).null - exception
          v).string exception
          

       
 * 1).the term exception means exception conditin it is a problem that may arise during exception of program.
 * 2).A branch of things can load to exceptions,includeing,program ,error,hardwear failures,files that need to be openedcannot be found,resourse.
 *  excusion etc.
 * 3).java provides a roubest and object oriented way of to handle exception scenarious known as java exception handling.
 * 4).when the exception occuress in a method,the process of creating the exception object and holding it over to returning
 *   environment is called throwing the exception.
 * 5).once runtime receive the exception object,it tries to find the handlar for the exception.
 * i).exception handlar is a block of code that can process the exception object.
 * ii).the handlar is said to be "catching the exception";
 * 6).NOTE := that java exception handling is a frame wprk that is used to handle runtime only.
 * compile time errors are not handle by exception handling.
 */


     /*
      * 
                                          OBJECT
                                            |
                                            |
                                            |
                                        throwable
                                            |
                                            |
                                            |
                             |--------------------------|
                             |                          |
                             |                          |
                             |                          |
                         Exception                    ERROR
                             |                          |
                             |                          |
                             |                          |
                |-----------------------|          OUT OF MEMORY ERROR
                |                       |          IO ERROR
                |                       |          STACK OVER FLOW
        COMPILE EXCEPTION       RUNTIME EXCEPTION
                |                       |
                |                       |
                |                       |
        IO EXCEPTION             NULLPOINTER EXCEPTION
    FILE NOT FOUND EXCEPTION     ARTHEMATIC EXCEPTION




      
      class Example{
        public static void main(String[] args) {
            int a=10;
            int b=20;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
      }

      o/p : error
      note := this is compile time error
              that means checked exception error

    
    class Example{
        public static void main(String[] args) {
            int a=10;
            int b=20;
            int c=a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
      }


//   ***    5  EXCEPTION KEYWORDS

//  FREE DEFINED KEYWORDS IN EXCEPTION KEYWORDS


// free definde keywords
i).try 
ii).catch 
iii).finaly

userdefined keywords
iv).throw
v).throws


//   EXCEPTION Handling keywords :

i). the "try" keyword is used to specify a block where we should plase exception code.
ii).the try block must be followed by either catch or finally.it means ,we can't use try block alone. 
iii).the 'catch' block is used to handle the exception .it must be preseded by try block which means we can't use catch block alone.it can be followed by finally block later. 
iv).the 'finaly' block is used to excute to import to importent code of the program. 
v).the 'throw' keyword is used to throw an exception. 
vi).the 'throws' keyword is used to declare exceptions.it does not throw in exception. it specifyes that there many occur an exception in the method.abstract
it is always in the with method signature.   

class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("welcome to the telugu world");
        System.out.println("dukka gowrikumar");
    }
}
o/p :-
today our topic is exception handling.
Note:- remaining is not printing.why because here that exception handling 


// 1). printStackTrace();
class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        try{ 
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        catch(ArithmeticException  ae){
            ae.printStackTrace();  // exception name,resion, line number,method
        }
        System.out.println("welcome to the programing tutorials in telugu");
        System.out.println("by gowrikumar");
}
}

o/p :-
today our topic is exception handling

arthematic exception /zero

welcome to the programing tutorials in telugu
by gowrikumar 


note: i). we can use the main method and 
      ii).useing try keyword and
      iii).after the arthmatic exception
      iv).and after the print some text 
      v).we can get the main method output and arthematicexception and
         after the arthematic exception sometext output.


//2). toString method();
class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        try{ 
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        catch(ArithmeticException  ae){
            System.out.println(ae.toString());  // exception name,resion
        }
        System.out.println("welcome to the programing tutorials in telugu");
        System.out.println("by gowrikumar");
}
}

o/p :-

today our topic is exception handling
java.lang.Arthematic exception /by zero / at exceptionDemo.main(ExceptionDemo.java:8)
welcome to programing tutorials in telugu 
by gowrikumar


// 3). getMessage();

class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        try{ 
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        catch(ArithmeticException  ae){
            System.out.println(ae.getMessage());  // resion
        }
        System.out.println("welcome to the programing tutorials in telugu");
        System.out.println("by gowrikumar");
}
}

o/p :- 
today our topic is exception handling
/ zero 
welcome to the programing tutorials in telugu
by gowrikumar

note:- only printing resion only.



// ii).user defined messages

class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        try{ 
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        catch(ArithmeticException  ae){
            System.out.println("you cant devid by with zero");  // resion
        }
        System.out.println("welcome to the programing tutorials in telugu");
        System.out.println("By gowrikumar");
}
}

o/p :-
today our topic is exception handling
you cant devide by zero 
welcome to programing tutorials in telugu
by gowrikumar 




//  without catchblock


class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        try{ 
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
       
       
        
        System.out.println("welcome to the programing tutorials in telugu");
        System.out.println("By gowrikumar");
}
}

o/p : --

syntax error


// finally block
class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        try{ 
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        
        finally{
            System.out.println("this is finally block");
        }
        System.out.println("welcome to the programing tutorials in telugu");
        System.out.println("By gowrikumar");
}
}


o/p :--

today our topic is exception handling
this is fially bock 
exception in thread main. arthematic exception


note :--

ifincase didn't exict in program(try block) and but exicute finally block


// try block and catch block and final block
class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        try{ 
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        catch(ArithmeticException  ae){
            ae.printStackTrace();
        }
        finally{
            System.out.println("this is finally block");
        }

        System.out.println("welcome to the programing tutorials in telugu");
        System.out.println("By gowrikumar");
}
}

o/p :--

today our topic is exception handling 
java.lang.athematic exception /by zero at Example

this is finally block 
welcome to the program tutorials in telugu 
by gowrikumar 


// ****   single try block and multiple catch blocks

class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        try{ 
          int arr[]={2,5};
          arr[2]=5; // here index is 2 but arr size is 1(2 index value 0,5 index value 1);
          arr[3]=3/0;    // index value is 3 but initial value is 3/0;
            
        }
        catch(ArithmeticException  ae){
            ae.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException gk){
            gk.printStackTrace();

     }      
   }
}

o/p :- today our topic is exception handling 
 ArrayIndexOutOfBoundsException: index 2 out of bounds for length 2 at

 

 //****   ONE TRY BLOCK AND MULTIPLE FINAL BLOCKS

 class Example{
    public static void main(String[] args) {
        System.out.println("today our topic is exception handling");
        try{ 
          int arr[]={2,5};
          arr[2]=5; // here index is 2 but arr size is 1(2 index value 0,5 index value 1);
          arr[3]=3/1;    // index value is 3 but initial value is 3/0;
            
        }
        
        finally{
            System.out.println("hi");
        }
        finally{
            System.out.println("bye");
        }
   }
}


o/p --syntax error on token finally, delete this token 
we cant create morethen one finally blocks



// ONE OR MORE EXCEPTIONS IN PRINTING

class Example{
    public static void main(String[] args) {
        try{
            int arr[]={2,5};
            try{
                arr[2]=3/0;
            }
            catch(ArithmeticException ae){
                ae.printStackTrace();
            }
            arr[3]=7;
        }
        catch(ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
    }
}

o/p :--
java.leng.ArithmeticException: / by zero
 at exceptionDemo.main(Exceptiondemo.java)

 ArrayindexOutOf boundresException


 
 // fixed exception
 class Example{
    public static void main(String[] args) {
        try{
            int arr[]={2,5};
            arr[2]=7;
        }
        catch(Exception ae){     // fixed exception
                ae.printStackTrace();
        }
        
        catch(ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
    }
 }


 o/p :--
 unreached exception catch block for arrayIndexoutof boundresexception
 second exception not exicute

 
// sub class exception
 class Example{
    public static void main(String[] args) {
        try{
            int arr[]={2,5};
            arr[2]=7;
        }
        catch(ArithmeticException ae){     // fixed exception
                ae.printStackTrace();
        }
        
        catch(Exception a){
            a.printStackTrace();
        }
    }
 }

 o/p :---

 ArrayIndexOutofboundresException






 i).the java throw keyword is used to explicity throw an exception
 from a method of any block of code.
 ii).we can throw either checked or unchecked exception in java by throw keyword
 iii).the throw keyword is mainly used tothrow custom exeptions.
 iV).we can define our own set of conditions or rules and throw an exception explicity using throw keyword.
 v).for example,we can throw arthematicexception when we divide number by 5, or any numbers what we need to do is just set the condition and using throw keyword.




 i).the throws is a keyword in java which is used in the signature of method to indicate that method might throw one of the listed type exceptions
 2).the caller to thase methods has to handle the exception using a try-catch block
 3).it is designed to transfore the responsibulity of exception handling to it's caller.

 

class Example{
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("you are not eligible for vote");
        }
        else{
            System.out.println("you are eligibli for vote");
        }
    }
    public static void main(String[] args) {
        validate(17);
        System.out.println("program successfully complited");
    }
}

o/p :---

exception in thread "main" java.length.arithematic exception you are not for vote.
at ExceptionDemo.validate(Exception.java:4);
at ExceptionDemo.main(Exceptiondemo.java);

NOTE :--

here we can exception user defined that
ii).we know the exception.this output user giving to to exception 

iii) we create throw new keyword and create arthematic exception.   


class Example{
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("you are not eligible for vote");
        }
        else{
            System.out.println("you are eligibli for vote");
        }
    }
    public static void main(String[] args) {
        validate(35);
        System.out.println("program successfully complited");
    }
}

o/p :--

eligible for vote

condition is currect not display any exception.



// throws keyword

class Example{
    static void display() throws ArithmeticException{
        int a=3/0;
        System.out.println(a);
    }
    public static void main(String args[]){
        try{
            display();
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        System.out.println("sucessfully printed");
    }
}

o/p :---
java.long ArthematicException :/by zero 

at Exception Demo.display("Exception demo.java 3");
at Exception Demo.main("Exception demo.java 9"); 


1).first we ctrate display and create throws keyword
2).int the value
3).and create main method and create by try block to print display catch keyword is used
4).automatically exicuted then
5.print the excution .handling
6.checked exception(compiletion time -> input and output configuration exception,sql,exceptoin


// DIFFERENCE BITWEEN THROW AND THROWS

THROW :--

I).throw keyword is used to throw an exception explicity
ii).throw keyword is followed by an instance of throwable class or one of sub-class
iii).throw keyword is declered inside a method body 
iv).we cannot multiple exceptions using keyword.

THROWS :--

I)throws keyword is used to declere an exception possible during it's exception.
ii).throws keyword is followed by one or more exception class names saparated by comas
iii).throws keyword is used with methods signateuere
iV).we can declere multiple exceptions using throws keyword.

// USER DEFINED EXCEPTIONS  

I) create the new exception class existing exception class.
ii).create a public constractor for a new class with string type of parameters
iii).pass the string parameters to the super class 
iv).declere the exception at the method level 
V).create try block inside that create that create a new exception and throw it is based  on based on same.condition.
6).catch block and some predefined exception 
7).write the optionally finaly block.  */


