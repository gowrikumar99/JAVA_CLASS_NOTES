/*
 * THIS KEYWORD :-
 * ==============
 * i).this keyword refers to current instance of class.
 * ii).using this keyword we can access instance members[variables&methods],
 * iii).Specifying this keyword is sometimes optional and sometimes mandatery
 * 
 * 
 * NOTE :-
 * =======
 * 
 * i)if there is a confusion between instance variable and local variable then specifying this is mandatery.
 * ii).in such case we dont specify this keyword then the compailer will also not specify this keyword and insted access local variable.
 * iii).if we want to accesss instance variables then the programmer has to specify this keyword.
 * 
 
EX :-  
 class student{               // main class
    int x=10;                 // instance variables
    void display(){           // sub-method
        int y=20;             // local variables
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]){    // main mwthod
        student stu=new student();             // objectcreation
        stu.display();                         // object to method calling
    }
 }
 o/p :-   10
          20


Ex:-1
class student{
    int x=10;                                // instance variable
    void display(){                          // sub-method
        int x=20;                            // local variables
        System.out.println(this.x);          // in parameter passing this keyword
    }
    public static void main(String args[]){    // main method
        student stu=new student();             // object creation
        sut.display();                         // object to method call
    }
}

o/p
10

Note :-i).here that one variable is instance variable and another variable is local variable
      ii).if incase we can print instance variable in method.
      iii).then we will use this keyword.

Ex:2 :-   VALLU PASSING DIRECTLY

class student{
    int x;                                     // instance variable
    student(int y){                            // constractor having parameter and parameter having a variable.
        x=y;                                   // local variable
    }
    void display(){                            // sub-method
        System.out.println(x);
    }
    public static void main(String args[]){    // main method
        student stu=new student(5);            // new object variable creation
        stu.display();                         // call the method
    }
}


o/p :-
5

Ex:- 3  

class student{            // main class
    int x;                 // instance variable
    student(int x){        // constractor
        this.x;           // this keyword
    }
    void display(){        // sub-method
        System.out.println(x);
    }
    public static void main(String args[]){
        student stu=new student(4);
        stu.display();
    }
}



o/p
4
          */
 