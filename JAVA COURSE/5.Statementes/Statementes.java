/* Classification of Control Statementes are 3 types
 * 1.Conditional statementes/Decesion making
 * 2.Looping/Iterative Statementes
 * 3.Branching/Transfore Statementes
 * 
 * 1). CONDITIONAL STATEMENTES:-
 *    i).it is used for decision making
 *    ii). used when a block of code is to be exicuted only if a certain condition is true;
 *    iii).the different ways of writing conditional statementes are
 *         1) 'if' statement
 *         2).'else' statement
 *         3).'else if' statement
 *         4).'switch case' statement
 * 
 * 2).LOOPING STATEMENTES  :-
 *    i)used to exicute a set of instructions/functions repeatedly,
 *      when some conditions become true.
 *   ii).compound statementes to be executed zero or more times
 *   iii).save the time from writing similar type of statementes for multiple times.
 *        
 * 3).BRANCHING/TRANSFORE STATEMENTES :-
 *    i).the branching statemente helps to change the normal flow of execution based on some condition
 *       1).break
 *       2).continue
 * 
 * 
 * 
 * 
 * 1.1)  IF STATEMENT :-
 *        write a block of code to exicute the statementes when the condition is true.
 *  class Simple_if{
 *  public static void main(String args[]){
 * // initilizing variables
 * int x=20;
 * int y=19;
 * //checking condition x>y with if statement
 * if(x>y){
 * System.out.println("x is greater then y");
 * }
 * 
 * }
 * }
 * 
 * 
 * 1.2) IF-ELSE STATEMENT :-
     if else statement is used to test for true and false conditions
     
     // wap to check the persion is eligible for vote or not
     class vote{
        public static void main (String args[]){
            int age=19;
            if(age>=18){
                System.out.println(Eligible for vote);
            }else{
                System.out.println("eligible for vote");
            }
        }
     }
 // wap to check the persion is eligible for blood donation or not
 age>=18,weight>=50

 class BilodDonation{
    public static void main(String args[]){
        int age,weight;
        age=23;
        weight=56;
        if(age>=24 && weight >=50){
            System.out.println("Eligible");
        }else{
            System.out.println("not eligible");
        }
    }
 }



 1.3). ELSE-IF STATEMENT :-
    else-if statement ladder is used to test for various conditions
    you will have to make use of 'else' to write a block of code to exicute the statement when the
    condition is false.
/* 
 * wap to display greeting message based on time(24 hr format)
 * 1. if time between 5 to lessthan 12-"goodmorning";
 * 2. if time bitween 12 to lessthan 16-"good After noon";
 * 3. if time between 16 to lessthen 20-"good evening";
 * 4.else -"good Night";  
 * 
 * 
 * class Greating{
 * public static void main(String args[]){
 * int time=14;
 * if(time>=5 && time<12){
 * System.out.println("good morning");
 * }else if(time>=12 && time<16){
 * System.out.println("good afternoon");
 * }else if(time>16 && time<20){
 * System.out.println("good evening");
 * }else{
 * System.out.println("good night");
 * }
 * }
 * }



 /* Traffic light example condition:
  * 1.if the color is green-Go;
    2.if the color is red-Stop;
    3.if the color is orange-"ready to go";


    class TrafficLight{
        public static void main(String args[]){
            String color="red";
            if(color.equals("green")){
                system.out.ptintln("go");

            }else if(color.equls("red")){
                System.out.println(Stop);
            }else if(color.equals("orange")){
                System.out.println("Ready to go");
            }else{
                System.out.println("invalid condition");
            }
        }
    }
  
// about using if-else-if condition

// java program to learn about using if-else -if
class Gradesystem{
    public static void main(String args[]){
        // declaring and initilising markes
        int markes=84;
        // for excellent grade,markes must be85 and <=100thats why logical and && is used to compine
        if(markes>=85 && markes<=100){
            System.out.println("Grade=Excellent");
        }else if(markes>=70 && markes<85){
            System.out.println("grade =very good");
        }else if(markes>=50 && markes<70){
            System.out.println("grade=good");
        }else if(markes>0 && markes<50){
            System.out.println("Not Qualified");
            // else will be exicute if markes donot lie in any of the above condition

        }else{
            System.out.println("Irrrelevent input");
        }
    }
}

1.4) SWITCH CASE STATEMENT:-
   'switch case' statement alloes to select one action among multiple actions during the execution

class Sitchdemo{
    public static void main(String args[]){
        int markes=82;
        markes=markes/10;
        switch(markes){
            // morethen one case may be written together if the under-statement is common
            case 9;
            case 8;
            System.out.println("Grade = excellent");
            break;
            case 7;
            case 6;
            System.out.println("Grade= very good");
            break;
            case 5;
            case 4
            System.out.println("grade=good");
            break;
            // default case is just like else with if i.e optional;
            default;
            System.out.println("fail or irretative input");

        }
    }
}


2). ITERATING LOOP STATEMENTS :-
 let us now look at the statement three types of loops or iteration statementes in java
 2.1) FOR LOOP
 2.2) WHILE LOOP
 2.3) DO-WHILE LOOP

 2.1).FOR LOOP :- The 'for-loop' is a control flow statement that iterates a part
             of the program several times.
             when you know how many times task shoud be repeated.
             i) initilization of the loop variables.
             ii).Boolean expression or the test condition is evaluated
                on each iteration.
            iii).the increment/decrement part of 'for' loop ececutes.

2.1.1)// java program to demonstrate simple for loop to print 10 numbers from 0-9
public class simpleFor{
    public static void main(String args[]){
        for(int x=0; x<=10;x++){
            System.out.println(x);
        }
    }
}

2.1.2)// java program to determine for loop for peinting even numbers.
   public class Forexample{
    public static void main(String args[]){
        for(int i=0;i<=10; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
   }

   2.1.3) // wap to display multiplication table;
      import java.util.*;
      class Multiple{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            int n;
            System.out.println("Enter the number for table");
            n=sc.nextInt();
            for(int i=0;i<=10;i++){
                System.out.println(n+"*"+i+"="+(n*i));
            }
        }
      }

    2.1.4) // wap to java program demonstrate nested for loop in java. 
    public class Statementes{
        public static void main(String args[]){
            //declaring variables loop variables
            int i,k;
            // outer loop for rows;
            for(i=1;i<=5;i++){
                for(k=1;k<=i;K++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
 out put ravadam leadu  
 
 2.2) WHILE LOOP:-
   while loop also executes a block of code repeatedly based on a boolean condition.
   Entry-controlled loop like 'for' loop,which allows to repeat statement a certain number,but with a different syntax;

 2.2.1) // wap to print sum of n natural numbers
  input:
  enter a value 
  10
  output:
  the sum of first 10 natural numbers is 55  

  import java.util.Scanner;
  class Statementes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;   // 10
        int sum=0;
        System.out.println("Enter N value");
        n=sc.nextInt();
        int i=1;
        while(i<=n){  // 1<=10; 2<=10; 3<=10; 4<=10;....10<=10;  11<=10 false; print the sum
            sum=sum+i; // 0+1=1;  1+1=2 2+1=3 3+1=4;....9+1=10
            i=i+1;  //1+1=2; 2+1=3;  3+1=4; 4+1=5;  .... 10+1===
        }
        System.out.println("Total sum of 10 numbers :");
    }
  }

  2.2.2)  // WAP to find the no.of digits in a given number
    input:
    enter the number
    456
    output:
    No.of outputs in agiven number is 3   
    import java.util.Scanner;
    class Statementes{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
                int n;     // 456
                int count=0;
                System.out.println("Enter the number : ");
                n=sc.nextInt();
                while(n!=0){  // n!=456 ; 45!=0 ; 4!=0;  ; 0!=0;
                    n=n/10;  // n=456/10 = -->45 ; 45/10 = 4; 4/10=0
                    count=count+1; // 0+1=1 ; 1+1=2; 2+1=3;
                }
                System.out.println("Total digits are : "+count);
            }
        }
    
2.2.3).// java program  to demonostrate while loop;  
import java.util.Scanner;
class Statementes{
    public static void main(String args[]){
        // Initilizing the loop variables
        int i=0;
        // chicking the loop condition
        while(i<5){
              // Increment the value of i
            i=i+1;
            // printing the value of i
            System.out.println(i);
        }

    }
}


2.3).  DO WHILE LOOP :-
   Execute a part of the program at leatest once.
   Exeecution dependes upon the given boolenan condition.
  // java program to demonstrate Do while loop. 
  public class Statementes{
    public static void main(String args[]){
        // initilizing the loop variable
        int i=0;
        do{
            // print the value of i
            System.out.println(i);
            // increment the i value;
            i=i+1;
        }
        while(i<5);
    }
  }

  3.1) BRANCHING STATEMENTES :-
     I).BREAK
     II). CONTINUE


     BREAK :-To jump out of a loop followed by a condition.
             It breaks the loop;

             // java program to demonstrate break in loops
             public class Statementes{
                public static void main(String args[]){
               // Running a loop from 0 to 9
               for(int i=0; i<=10; i++){
                // checking the condition if i equals to 5
                if(i==5){
                    // breaking the loop when the condition is true
                    break;
                }
                // printing the values till 4
                System.out.println(i);
               }
             }
            }


    CONTINUE STATEMENT :-
      can be written only inside loop body followd after a if condition.

       // java program to demonstrate continue in loops 
             public class Statementes{
                public static void main(String args[]){
               // Running a loop from 0 to 9
               for(int i=0; i<=10; i++){
                // checking the condition if i equals to 5
                if(i==5){
                    // continueing the loop when the condition is true by skipping the value 5

                    continue;
                }
                // printing the values except 5
                System.out.println(i);
               }
             }
            }

            */