/* Operators are 6 types
1).Assignmental Operators
2).Arthematic Operators
3).Relational Operators
4).Logical Operators
5).Bitwise Operators
6).Ternary Operators
7).Unary operators


1).ASSIGNMENTAL OERATOR :-  +=,-=,*=,%=,/+
    assignmental operators are used to assign value to variable. 
    symble +=,-=,*=,%=,/+
    public  class Operators{
        public static void main(String args[]){
            // Declering variable
            int a=10;
            int b=20;
            int c=30;
            int d=10;
            int e=20;
            a=a+3;
            b=b-3;
            c=c*2;
            d=d/2;
            e=e%2;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e); 
        }
    }  
2). ARTHEMETIC OPERATOR : +,-,*,%./
 arthematic operators are addition,substraction,divison,multiplication,
 modulus,increment,and decrement operators. 
 class Operators{
    public static void main(String args[]){
          int x=35;
          int y=55;
          System.out.println(x+y);
    }
 } 
 
 3).RELATIONAL OPERATORS :-  <,>,==,!=,<=,>=
   Relational operator determine the relationship b/w the two operantes. 
   it checks if an operand is greaterthen,lessthen,equals to,not equals to,
   less then or equales to,greaterthen equalses to
   class Operantes{
    public static void main(String args[]){
        int x=12;
        int y=13;
        if(x>y){
            System.out.println(" x is greaterthen number");
            else{
                System.out.println("y is greaterthen number");
            }
        }
    }
   }

   4).LOGICAL OPERATORS :- &&,||,!
    lOGICAL OPERATOR ARE TO TEST AND COMBINE CONDITIONS RESPICTIVELY
    Double ampresent && is is logical AND operator  that evalution an expression and returns true or false

    || logical OR
    Not logical operator ! (Exclamator mark!)it is reverse or negetive condition

   // AND OPERATOR

    class operator{
        public static void main(String args[]){
            int x = 5, y = 7;  
            if (x > 3 && y < 10) {  
            System.out.println("Both conditions are true");  
            }  
        }
    }
    // OR OPERATOR

    class operator{
        public static void main(String args[]){
            int x = 5, y = 7;  
            if (x > 3 || y < 10) {  
            System.out.println("Both conditions are true");  
            }  
        }
    }
    // NOT OPERATOR  

     class Operators{
        public static void main(String args[]){
            boolean x = true;  
         if (!x) {  
              System.out.println("The value of x is false");  
         } else {  
              System.out.println("The value of x is true");  
         }  
        }
     }
 
     5).BITWISE OPERATOR :-  &,|,^
      bitwise operator works on bit pattern and perform bit-by bit operator  

       class Operators{
        public static void main(String args[]){
            int a = 5, b= 7;
            System.out.println("a&b ="+(a&b)); 
            System.out.println("a|b ="+(a|b)); 
            System.out.println("a^b =" +(a^b) );
            } 
        }
    
6).TERNARY OPERATOR:-

 ternary or conditional operator consistes of three operandes is used to 
  evalute boolean expression. 

  import java.util.Scanner;

class Operators {
  public static void main(String[] args) {
    
    // take input from users
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your marks: ");
    double marks = input.nextDouble();

    // ternary operator checks if
    // marks is greater than 40
    String result = (marks > 40) ? "pass" : "fail";

    System.out.println("You " + result + " the exam.");
    input.close();
  }
}

import java.util.Scanner;
class Operators{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter th 1 number : ");
    int num1=sc.nextInt();
    System.out.println("Enter th 2 number : ");
    int num2=sc.nextInt();
    System.out.println("Enter th 3 number : ");
    int num3=sc.nextInt();
     int maximum;
     maximum=( num1>num2  &&  num1>num3 ) ? (num1) : ((num2>num3) ? (num2) : num3 );
     System.out.println("maximum number is : "+maximum);
 }
}


7).UNARY OPERATOR :- +,-,++,--  

 class Operators{
        public static void main(String args[]){
           //int x=-2;
//System.out.println(x);
//int x=-2;
//System.out.println(-x);
//int x=1;
//System.out.println(x++);
//System.out.println(x++);
//int=3;
//System.out.println(x--);
//System.out.println(x--);

//int x=30;
//System.out.println(++x);   //preincrement
//int x=20;
//System.out.println(x++); // postincrement
            
            } 
        }

*/
import java.util.Scanner;
class Operators{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter th 1 number : ");
    int num1=sc.nextInt();
    System.out.println("Enter th 2 number : ");
    int num2=sc.nextInt();
    System.out.println("Enter th 3 number : ");
    int num3=sc.nextInt();
     int maximum;
     maximum=( num1>num2  &&  num1>num3 ) ? (num1) : ((num2>num3) ? (num2) : num3 );
     System.out.println("maximum number is : "+maximum);
 }
}
