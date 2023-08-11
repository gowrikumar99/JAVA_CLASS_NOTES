/*

Q1). what is java?

1)java is a general-purpose,class-based,object-oriented programing language
2).it is computing platform for application developement.
3).java is fast,secure,reliable,therefore it is widely used for developing java
4).application in laptops,data centers,games consoles,scientfic supercomputers,cell phones...etc
5)developed by sun microSystems and designed by james gosling
6)first applied may 23,1995.

Q2). Explain JDK, JRE and JVM?

JDK (Java Development Kit): JDK is a software development kit that provides a development environment required 
               to create Java-based applications. It includes JRE, compilers, tools, 
               and APIs for developing and debugging Java programs.

JRE (Java Runtime Environment): JRE is a software package that provides the environment to run Java-based applications.
                  It includes the JVM, class libraries, and other necessary files required to run Java programs.

JVM (Java Virtual Machine): JVM is a virtual machine that runs Java bytecode.
                It provides an environment that helps in the execution of Java programs across different platforms.
                The JVM is responsible for converting Java bytecode to machine-readable code and executing it.


Q3). Explain public static void main(String args[]) in Java.

Ans: The public static void main(String args[]) in Java is the starting point for any Java program.
                   It is defined with the following components:
1. Access modifier: Public is an access modifier that specifies which classes can access this method.
                    Public means that any class can access this method.
2. Keyword: Static is a keyword that identifies that it is class-based.
         The main() method is made static in Java so that it can be accessed without creating an instance of a class.
3. Return type: Void is the return type of the method. Void specifies that the method will not return any value.

4. Method name: Main is the name of the method that is searched by JVM as a starting point for an application
                with a particular signature only. It is the method where the main execution occurs.
5. Parameter: String args[] is the parameter passed to the main method. 
              It represents the command-line arguments passed to the program.

Q4). Why Java is not 100% Object-oriented?

Ans: While Java is primarily an object-oriented programming language, it is not considered 100% object-oriented 
         as it includes eight primitive data types, namely boolean, byte, char, int, float, double, long, and short, 
         which are not objects.

Q5). List the features of Java Programming language.
There are the following features in Java Programming Language.

Simple: Java is easy to learn. The syntax of Java is based on C++ which makes easier to write the program in it.

Object-Oriented: Java follows the object-oriented paradigm which allows us to maintain our code as the combination 
                 of different type of objects that incorporates both data and behavior.

Portable: Java supports read-once-write-anywhere approach. We can execute the Java program on every machine.
          Java program (.java) is converted to bytecode (.class) which can be easily run on every machine.

Platform Independent: Java is a platform independent programming language.
         It is different from other programming languages like C and C++ which needs a platform to be executed.
         Java comes with its platform on which its code is executed. Java doesn't depend upon the operating system 
         to be executed.

Secured: Java is secured because it doesn't use explicit pointers. 
         Java also provides the concept of ByteCode and Exception handling which makes it more secured.

Robust: Java is a strong programming language as it uses strong memory management.
        The concepts like Automatic garbage collection, Exception handling, etc. make it more robust.

Architecture Neutral: Java is architectural neutral as it is not dependent on the architecture. 
           In C, the size of data types may vary according to the architecture (32 bit or 64 bit)
            which doesn't exist in Java.

Interpreted: Java uses the Just-in-time (JIT) interpreter along with the compiler for the program execution.

High Performance: Java is faster than other traditional interpreted programming languages because 
       Java bytecode is "close" to native code. It is still a little bit slower than a compiled language (e.g., C++).

Multithreaded: We can write Java programs that deal with many tasks at once by defining multiple threads.
        The main advantage of multi-threading is that it doesn't occupy memory for each thread.
         It shares a common memory area. Threads are important for multi-media, Web applications, etc.

Distributed: Java is distributed because it facilitates users to create distributed applications in Java. 
        RMI and EJB are used for creating distributed applications.
         This feature of Java makes us able to access files by calling the methods from any machine on the internet.

Dynamic: Java is a dynamic language. It supports dynamic loading of classes.
         It means classes are loaded on demand. It also supports functions from its native languages,
          i.e., C and C++.

Q6). What is the platform?
A platform is the hardware or software environment in which a piece of software is executed.
There are two types of platforms, software-based and hardware-based. Java provides the software-based platform.


Q8).what is JVM ?



 java program to print simple messege
public class Introduction{
    public static void main(String args[]){
        System.out.println("SimpleMessage");
    }
}

java source code(above program(Introdection.java))--->java copmiler(javac)--->
bytecode(Non-human readable(### ****** #####*****))--->java virtuval mechine-->
Machine readable Instractions(executed by CPU(0101010001111  10
011200012 )) 


* Elementes in java:-
1.Java Tokens
2.commentes
3.white space

1). JavaTokens:- smallest element of a program which is meaningful to
                 the compailer.this includes
                 * keywords:- i).Pre-defined identifiers for a specific purpose,which informs the compailer on what the program should do.
                              ii).Reserved words with special meaning within the java language such as int,float,class ,public,etc.
                              iii).can't be used as class names,variables,or method names
                              iV).java is case sensitive,hence keywords are to be written in lower case.
                         Ex:- int,while,float
                 * Identifiers :-A java identifier is the symbalic name given to program elementes such as a variables,
                                methods,class,array,etc to uniquely them,identifiers are used for storing data values.

                     Ex:-sum,total
                 * Literals or Constants :-constant values that are assigned to variables.
                                    int x=100;
                                    int --> is datatype
                                    x ---> is variable
                                    10---> is value
                            Ex:-  10,20..
                            
                        NOTE:- a variable is a placeholder or a container that stores a value that can ba changed.

                 * Operators :- Operators are the symbles that specify an evalution to be performed on variables or operands.
                              Ex: x+y=z
                              where x,y those are Operands and z is a Result and +,= these are operators

                              ex:- 1).Assignmental operator
                                   2).arthemetic operator
                                   3).Relational operator
                                   4).logical operator
                                   5).Bitwise operator
                                   6).Ternary operator
                 Ex:- *,/,-
2).Comments:-used to make your code more readable and explain in a better way.
           ii)Are statementes that are ignored by the compailer.
           iii).two types of comments include.
           * single line comment begains with single forward Slash
           * multi line comment begains with single forword slash and
           * asterisk(/* )and ends with asterisk and single forword slash

3).Also considered as a token.this oncludes
  *Blank space
  *New line
  *Carriage return
  *horizantal tab


  */
