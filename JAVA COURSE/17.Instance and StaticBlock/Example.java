/*
 i).if we specify a group of statementes with in a pair of  flower without any keyword then it is callled as instance block.
 ii).the pupose of this block is to initilize instance variablees.
 iii).if we specify a group of statementes with in a pair .
 of flower bracketes with static keyword then it is called as static block.
 iV).the purpose of this block is to initilize static variables.
 


// DEFAULT VALUES

class Example{
    int x;
    String name;
    boolean y;
    char c;
    float d;
public static void main(String args[]){
        Example e1 = new Example();
        System.out.println(e1.x);
        System.out.println(e1.name);
        System.out.println(e1.y);
        System.out.println(e1.c);
        System.out.println(e1.d);
    }
}

O/P :-- int=0;
        string=null;
        boolean = false;
        char = _ space;
        float=0.0;


        

//  INSTANCE VARIABLES ASSIGNING 3 WAYS 

//   1). at the time of declaration 
//   2).by using constractor
//   3).by using instance block

//1). AT THE TIME OF DECLERATION

class Example{
    int x=10;

public static void main(String args[]){
    Example e1=new Example();
    System.out.println(e1.x);
}
}


o/p 

10



//  2.BY USING INSTANCE VARIABLE TO THE CONSTRACTOR

   class Example{    // main class
    int x;          // instance variable
    Example(){       // constractor
        x=15;        // instance variable
    }
    public static void main(String args[]){
        Example e1=new Example();
        System.out.println(e1.x);
    }
   }

o/p

15


// 3. USING INSTANCE VARIABLE BLACK TO INSTANCE VARIABLE

class Example{
    int x;    // instance variable
    {      // instance block
        x=45;
    }
    public static void main(String args[]){
        Example e1=new Example();
        System.out.println(e1.x);
    }
}

o/P
45


NOTE :-
i).we can use more then one instance blocks to instance variables
ii).these are exicute top to bottom

// ***  STATIC VARIABLE 2 WAYS TO DECLERETION.

I). AT THE TIME OF DECLERATION 
2).BY USING STATIC BLOCK. 


I). AT THE TIME OF STATIC BLOCK  

class Example{
    static int x;
    public static void main(String args[]){
        System.out.println(x);
    }
}


o/P
0

we dont want create object and directly initilize x value.

//  AT THE TIME INITILIZE X VALUE 

 class Example{
   static int x=35;
   public static void main(String args[]){
    System.out.println(x);
   }
 }

 o/p 
 35

 S

 // 2 BY USING STATIC BLOCK

  class Example{
    static int x;
    static {
        x=55;
    }
    public static void main(String args[]){
    System.out.println(x);
    }
  }


  o/P

  55 

  
  // ***** some rools in static block ******
  class Example{
    static{
        System.out.println("this is from static block1");
    }
    public static void main(String args[]){
        System.out.println("hello from main method");
    }
    static {
        System.out.println("hello from static block 2");
    }
  }

  o/P:--

  hellow from static block-1
  hellow from main method 
  hellow from static block-2


  */