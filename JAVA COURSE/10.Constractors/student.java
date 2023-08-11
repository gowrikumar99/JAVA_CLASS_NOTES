/*  

CONSTRACTORS  :-



i). It is a special type of method.
ii).it is used to initilize an instance variables.
iii).Name must be same as class name. 
iv).it cont contain return type. 
v).it will exicute during object creation time. 
Vi).it will exicute onetime for every object created.

vii).it can contain any number of parameters a).zero b).perameterized c).default parameter 

viii).A class can contain any number of constractors(we can apply different parameter values). 




// 1). using instance variable to create constractors call by method. 

class student{                                       // main class
    int a;                                           // instance variables
    public static void main(String args[]){          // main method
        student s1 = new student();                  // create object
        s1.display();                                // call object to display method
    }
    student(){                                       // constractor
        a=10;                                        // local variable
    }
    void.display(){                                  // return type of method
        System.out.println(a);                       // print the value
    }
}




o/p=10;






// ii).   Using instance variable to create constractor.call by constractor.

calss student{
    int a=35;                                  // instance variables
    public static void main(String args[]){    // main method
        student s1 =new student();             // create object
    }
    student(){                                 // Constractor
        System.out.println(a);                 // print the result
    }
}






o/p    35.





iii).  PARAMETERIZED CONSTRACTOR :-

class student{                                       // main class
    int      roll_no;                                // instance variables
    String   name;                                   // instance variables
    public static void main(String args[]){          // main method

        student s1=new student(101,"gowrikumar");    // initilizing the values with constractor
    }

    student(int x, String y){                        // constractor with parameter within the values.


        Roll_number = x;                             // local variables
        Name = y;                                    // local variables
        System.out.println("Name : "+ Name + " RollNo : " +Roll_number);    // print the value.
    } 
}

NOTE :-

 i).if incase we want create more objectes and initilize the more values

 student s2=new student(102,"appanna");
 student s2=new student(103,"ganga");
 student s2=new student(104,"appu");
 student s2=new student(105,"sanyasi");

 output :-

101 gowrikuar
102 appanna
103 ganga
104 appu
105 sanyasi



iV).DIFFERENT DATA TYPES OF PARAMETERIZED CONSTRACTORS :-  

class student{                                   // main class
    String name;                                 // instance variables
    int rollno;
    String Branch;
    public static void main(String args[]){          // main method
        student s1=new student("gowri");             //objectes with parameters
        student s2=new student("appu",102);
        student s3=new student("ganga",101,"mech");
    }

    student(String x){                              // constractor with parameter values
        name=x;                                      // local variable;
        System.out.println("1 constractor");
        System.out.println(name);
    }
    student(String x,int y){                         // second constractor
        name=x;                                       // local variables
        rollno=y;                                     // local variables
        System.out.println("2 Constractor");
        System.out.println(name+" "+rollno);
        

    }
    student(String x,int y,String z){                 // 3 constractor
        name=x;                                       // local variables
        rollno=y;                                     // local variables
        Branch=z;                                     // local variables
        System.out.println( " 3 constractor");
        System.out.println(name+" "+rollno+" "+Branch);
    }

}

  output :-

  1 constractor
   gowri
  2.constractor
  appu 102
  3.constractor
  ganga 103 mech


*/