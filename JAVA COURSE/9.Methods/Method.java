/*
 //  HOW TO USE METHODS IN JAVA :-

 METHOD :- group of statementes worked together to perform an operation.
          methodes are 4 types :
          1).without return value and without parameters.
          2).with return value and without parameters
          3).without returntype with parameters
          4).with returntype and with parameters


          1.)  // without return value and without parameters
          class Method1{       // main class
            void add(){        // return type method
                int a=10;      // instance variable
                int b=20;      // instance variable
                int c=a+b;     // instance variable
                System.out.println(c);    // print variable
            }
            public static void main(String args[]){     // main method
                Method1 m1=new Method1();         // main method
                m1.add();              // object to add method
            }
          }
 
          output :- 30;
        //2). // with return value and without parameters
        class Method{
            int add(){
                int a=10;
                int b=20;
                int c=30;
                return c;
            }
            public static void main(String args[]){
                Method ad=new Method();
                int result=ad.add();
                System.out.println(result);
            }
        }

        3). // without returntype with parameters.
        class method3{
            // void add ( datatype var name/parameters name)
             void add( int x,int y){
                int z=x+y;
                System.out.println(z);
             }
             public static void main(String args[]){
                method3 m3 =new method3();
                m3.add(10,20);
             }
        }


    4). //  with return type and with parameters

     class method4{
        int add(int x,int y){
            int z=x+y;
            return z;
        }
        public static void main(String args[]){
            method4 m4=new method4();
            int result=m4.add(10,20);
            System.out.println(result);
        }
     }

5). // method taking array as a parameter  :-

class ArrayDemo{
    public static void main(String args[]){
        int []arr={11,22,33,44};
        arrayDemo ad=new arrayDemo();
        ad.display(arr);
    }
    void display(int [] temp){      // temperary Array
        for(int z:temp){           // temperary array stores in z
           System.out.println(z);
        }
    }
}


output :-
11
22
33
44

NOTE:-
1.first of all create class and create main method then after create integer arr.that means int []arr={11,22,33,44}.
2.then arr. we create a object(ad) and then after we create another method void dispay.in this method we store the temperary variable
3.store the temperary array in integer type int[] temp
  and this step after we can take for loop there that temperary array variable stores in "z" after that print the "z" value
this step after reference variable to call this display method and store the arr.(add.display(arr));
 here value pass the parameter(arr).


6.// return type value

class arrayDemo{
    int sum;
    public static void main(String args){
        int[]arr={11,22,33,44};
        ArrayDemo ad=new ArrayDemo();
        int total=ad.display(arr);
        System.out.println(total);
    }
    int display(int[] temp){
        for(int x:temp){
            sum=sum+x;
        }
        return sum;
    }
}

Note :-1).first of all we can create class and then after create main method.
       2).and create array variable and store the valuees.then after we create object variable(ad).
       3).here that we take an integer datatype method and we take inside
         the parameter initilize the array type temp variable and
         4). then after we can create for loop to store temp variable value in "x"
         5).then after we cantake int sum after the main class why because instance variable above the main method and after the class
         6).we can take sum value initilise sum=sum+x;
         7).first off all sum value=0; then after sum=sum+x;
         8).after the for loop return sum
         9). we can take (int total) create total variable call the display method and pass the(arr).
         10).then after print the total value.



         
RALEADU MAR OKASARI CHUDALI
class method{
    int rollno=101;
    double markes=9.8;
    String name="gowri";
}
class objectDemo{
    public static void main(String args[]){ 
    method s1= new method();
    objectDemo od=new objectDemo();
    od.display(s1);

    }
    void display(student s2){
      System.out.println("student name is : +s2");
      System.out.println("his roll nuber is :+ s2.rollno");
      System.out.println("his markes is :+s2.markes");
    }
    }
}
*/