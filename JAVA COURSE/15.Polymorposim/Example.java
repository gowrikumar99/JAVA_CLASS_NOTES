/*
  POLYMORPISIM:--

  i). if a single entity shows multiple forms or maltiple behaviours then it is called as polymorphism.
  ii) polymorpisim is two types :-
   a). compiler time polymorpism
   b). runtime polymorpisim

a).COMPILER TIME POLYMORPISM :-
 i).if the polymorpism nature of an entity is devided by the compiler during the compiler time then it is called as compiler time polymorpism
 ii).we will use method overloadimg to active CTP .

b).RUN TIME POLYMORPISM :--
i).if the polymorpism nature of entity is decided by the jvm during runtime then it is called run time polymorpism
ii).we will use method overriding to achive RTP




METHOD OVERLOADING :=
=> the process of specifying multiple methods,having diffferent signature with same name is called as method overloading.
=> we can apply this overloading method 4 
  i).instance method
  ii).static method
  iii).main method
  iv).Constractor method


METHOD OVERRIDING :--
the signature include three partes.
i).number of parameters
ii).types of parameters
iii).order of parameters


i).Number of parameter instance method :- 

class Example{                                    // main class

    void add(int x,int y){                       // sub method-1
        System.out.println("result1"+(x+y));
    }

    void add(int x,int y,int z){                // sub method-2
        System.out.println("result2 :"+(x+y+z));
    }

    public static void main(String args[]){       // main method
        Example e1=new Example();                 // object creation
        e1.add(1,2,3);                      // add method to object values passing
        e1.add(4,5);                          // add method to object values passing
    }
}
 
opyput :--
result :-6
result :-9

NOTE:-
      i) more then one method
      ii).method names or same and different types of parameters and different types of paramerets
     iii).call the methods at a time all methods
     iV).same type parameters are not allowed
           (int x, int y)
           (int x, int y)

 
ii).TYPES OF PARAMETERS METHOD :--

  class Example{
    void add(int x,int y){
        System.out.println("result1 :"+(x+y));
    }
    void add(int x,double y){
        System.out.println("Result2 :"+(x+y));
    }
    public static void main(String args[]){
        Example e1=new Example();
        e1.add(56,9.6);
        e1.add(12,13);
    }
  }


  output :-

  i).65.6
  ii).25


iii). ORDER of parameters :-  

class Example{

    void add(double x,int y){
        System.out.println("result1:"+(x+y));
    }

    void add(int x , double y){
        System.out.println("Result2 :"+(x+y));
    }
    public static void main(String args[]){
        Example e1=new Example();
        e1.add(4.7,5);
        e1.add(9,8.9);
    }
}

output :-
result : 9.7;
result : 17.9;



// 2.STATIC METHOD OVERLOADING:-
class sample{
    static void show(int x){
        System.out.println("welcome to the int parameter :");
    }
    static void show(double x){
        System.out.println("welcome to double parameter");
    }
    public static void main(String args[]){
        show(12.3);
        show(2);
    }
}

output :-
welcome to the int parameters
welcome to the double paramers

NOTE :-
1). we not need to createobject calling for methods
2).we can take method here
3). one main method also. 



// MAIN METHOD OVERLOADING

class Example {

    public static void main(int args[]){
        System.out.println("int array");
    }

    public static void main(int args){
        System.out.println("int parameters");
    }

    public static void main(String args[]){
        main(10);
    }
}

output :-
int args


// Iv). CONSTRACTOR OVERLOADING :-

ravadam leadu okasari chudali

class Example{

    Example(){
        System.out.println("zero parameter constractor");

    }

    Example(String name){
        System.out.println("my nameis :"+name);
    }
    public static void main(String args[]){
        
        Example s1=new Example();
        Example s1=new Example("gowri");
    
    }
}


// NODE :-- 
// over loading 2 types a).main clas and inner class
class Example{
    void display(){
        System.out.println("parent class");
    }
}
    class perfect extends Example{
        void display(int x){
            System.out.println("child class");
        }
      public static void main(String args[]){
        perfect p=new perfect();
        p.display();
        p.display(6);
      }
    }

output :--parent class
          child class
NOTE :--
i).here we have two classes 1 st one is super class and secondclass is sub class
2.we call to child class method super classs method
3.)we create main method create object 



      // METHOD OVERLOADING

//1).compailer(voerloading) method name same but different parameters and return type different.
//2).Runtime(Overriding)method name same and parameters also same return type same.

//  OVERLOADING                                                   // OVERRIDING
i).method name same                                               I).same method names
ii).parameters are different                                      ii).parameters also same. 
iii).return types are different                                   iii).return types are same. 
iV).we can use instance and satatic and main and                  iV).only instance method only
    constractor method to use overloading                         
V).two methods are same class (or) child class another           V).must and shoud one class parent class another class child class.
     method parent parent class 

vi).static /early loading                                         v).dynamic loading/late binary
vii).jvm compalition time                                         vii).jvm run time 



  ***** METHOD OVERLOADING  *****

class Example{
    void msg(){
        System.out.println("Parent class");
    }
}
    class Demo extends Example{
        void msg(){
            System.out.println("child method");
        }
      public static void main(String args[]){
        Example e1=new Example();
        e1.msg();
        Demo d1 = new Demo();
        d1.msg();

      }
    }


    o/p --
    i).parent class 
    ii).child class

    NOTE :-

    I).here two classes and two method are there 
       but 2 methods are same and two methods return type are void same(void). 
    2).ond one main method there
    3).we call sub class method and create one object. 
    4).we call super class method create oe new object. 
    5).we requird to call required object.
    6).only we can only instance method only. 




       //  OVERHIDING

       IMP POINTS
       1).PARENT TO CHILD RELATIONSHIP
       2).SAME METHOD NAME
       3).SAME RETURN TYPES
       4).SAME PARAMETERS

    class  Example{

        static void m1(){
            System.out.println("hello from parent");
        }

    }
    class overhiding extends Example{

        static void m1(){
        System.out.println("helow from child");
        }
        public static void main(String args[]){
            Example e1=new Example();
            e1.m1();
            overhiding o1=new overhiding();
            o1.m1();
        }
    }
    

    o/p  hello from parent
         helow from child

         */