/* 
 1).What is datatypes :-

i).Any variable in java should be a specified with a data type. 
ii).These data types tell the compiler about the size and type of values 
    that can be stored in a variable.
 

2).Classification of data types:-
 
i).Primitive datatype
ii).Non-primitive datatype

i).Primitive datatypes are the most basic and predefined datatypes in java that specify
   the value or data that is directly stored in variable. 
   EX:- int x=8,where value 7 gets stored in the int type variable x.
    
  Primititve Datatypes are 3 types:-
  1).Boolean----->boolean  size = 1 , range = true or false ,example= boolean_eligible_to-vote=true;
  2).Character--->char  size=16 ,range=0 to 65535, real example= char gender='F';
  3).Numeric ----->Integral
                  Integral datatype is two types:-
                  1).Integer 
                     Integer datatype is again 4 types
                     ----->  byte  size=8,range=-128 to 127, ex= byte age=21;
                     ----->  short  size=16 ,range= -32768 to 32767 ex= sort
                     ----->  int
                     ----->  long
                  2).Floating-Point
                     Floating data-type is 2 types
                     ---->  float
                     ---->  double
ii).Non-Primitive Data Types are Hold address or reference of value that is stored in the
    variable,hence known as Reference Data Type.
    i).String
    ii).Array
    iii).Interface
    iv).Class

   PRIMITIVE DATA TYPES :-

    type        size                  range
    i).  boolean     1                     true or false
    ii). character   16                    0 to 65535
    iii).byte        8 bits(1 byte)       -128 to 127
    iv).short        2 byts               -32768 to 32767
    v). int          4 bytes              -2,147,482,648 to 2,147,482,647
    vi).long         8 bytes              -9,223,372,036,854 to 9,223,372,036,853
    vii).float       4 bytes               3.420282347*10^38.1.40239846*10^-45
    viii).double     8 bytes               1.79769313486*10^308

   NON-PRIMITIVE DATATYPES :-
   i).String
   ii).Array


   
class datatypes{
   public static void main(String args[]){
      boolean x=true;
      System.out.println(y);
   }
}

class datatypes{
   public static void main(String args[]){
      char y='A';
      System.out.println(y);
   }
}


class datatypes{
   public static void main(String args[]){
      byte y=120;
      System.out.println(y);
   }
}


class datatypes{
   public static void main(String args[]){
      short y=12765;
      System.out.println(y);
   }
}


class datatypes{
   public static void main(String args[]){
      int x=1234567890;
      System.out.println(x);
   }
}


class datatypes{
   public static void main(String args[]){
      long x=9123456789L;
      System.out.println(x);
   }
}



class datatypes{
   public static void main(String args[]){
      double  y =12.34d;
      System.out.println(y);
   }
}


class datatypes{
   public static void main(String args[]){
      float x=123.453f;
      System.out.println(y);
   }
}



3). What is Type casting:-
   i).Store data into the variables of different ranges.
   ii). A bigger value cannot be stored in smaller sized data type.
   iii). sometimes you will need to convert one datatype into another
        without any error or loss and this can be handled using typecasting.

    Typecasting is two-types:-1).widening typecasting
                                 it is convert small data type to bigger data type
                                 ex:- int datatype to double datatype easily 
                                 double-->float-->long-->int-->char-->short-->byte

                              ex1:  class widening{
                                    public static void main(String args[]){
                                       //widening casting
                                       int a=10;
                                       double d;
                                       d=a;   // widening typecasting
                                       System.out.println(d);
                                    }
                                 } 
                                 out put is 10.
                              ex:2   windening typecasting
                                  
                              2).Narrowing typecasting
                                 it is larger datatype to smaller data type 
                                 ex:- double datatype to int data type
                                 
                                 class Introduction{
                                    public static void main(String args[]){
                                       // Narrow typecasting
                                       double d=10.78;   // here double is 8 bytes
                                       int a;   // here int is 4 bytes
                                       a=(int)d;
                                       System.out.println(a);

                                    }
                                 }
                                 output is 10.  
                                 ex:-2 
                                   class Introduction{
                                    public static void main(String args[]){

                                       // initilizing variavles radius and pie
                                       int radius=3;
                                       float pie=3.14f;

                                       //calculating the area of circle
                                       float area =2*pie*radius;

                                       //printing the floating point area value
                                       System.out.println("area of the cycle="+area);

                                       // casting the floating point area value to int
                                       int newarea=(int)area;

                                       //printing the casted area value from float to int
                                       System.out.println("area of the cycle ="+newarea);
                                    }
                                   } 
                                 //byte-->short-->char-->int-->long-->float--double
  
                                 

To convert an integer to a string in Java, you can use the Integer.toString() method or the String.valueOf() method. 

has context menu
public class E1 {

    public static void main(String[] args) {

        int x=123;

        String y=Integer.toString(x);

        System.out.println(x);

        System.out.println(y);

    }

}

[2:56 PM] Pavan Kumar Allada

To convert a string to an integer in Java, you can use the Integer.parseInt() method or the Integer.valueOf() method
//WAP TO CONVERT INTEGER TO A STRING

 

class Casting{
  public static void main(String args[]){
    int num=245;
    String y=Integer.toString(num);
  System.out.println(num);
  System.out.println(y);
  }
}


byte=nextByte()

int=nextInt()
float=nextFloat()
long=nextLong()
String=nextLine()
char=new char.charAt(i)



nextByte();
nextShort();
nextInt();
nextLong();
nextFloat();
nextDouble();
CharAt();
next();
nextBoolean();

has context menu

has context menu
wapper class is : conver to primitive data type values to the object and object values convert to Primitive data type values this is called wapper class
*/
                                 

 