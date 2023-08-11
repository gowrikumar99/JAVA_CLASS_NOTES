/*     *************   INTERFACE    *******
 * 
 * i).an interface is a collection of abstract methods
 * ii).an interface can contain both variables and methods. 
 * iii).an interface can not be instantaed
 * iv).in access in order the members of interface we need to inherit the inheretance into a class using implementes keyword.
 * v).in the sub class we have to override all the abstract methods.
 * vi).if the sub class we have to override all the abstract mwthods of an interface then it is caled as implementation class.
 * vii).a class can implement any number of interface.
 

 // 1).   EX:1   --
interface MyInterface{    // interface class
public abstract void m1();    // abstract method

}
 class InterfaceDemo implements MyInterface{   // using implements keyword
  public void m1(){                           // access modifier method using
    System.out.println("welcome");
  }
  public static void main(String args[]){
    InterfaceDemo id=new InterfaceDemo();
    id.m1();
  }
 }  
o/p  == welcome


NOTE :--
1).fixed of all we create interface class 
2).and then after we create abstract method then after
3).then after create sub-class and used to implementes keyword and inheretance to the super class
4).we create assess modifiers public 
5). we create public static main method and create an object.then after call the method 
6).object to the class.
 

 //    EXAMPLE :2   method and final keyword

 interface MyInterface{
    public static final int x=10;
    public abstract void m1();
 }
 class InterfaceDemo implements MyInterface{
   public void m1(){
    System.out.println("welcome");
   }
   public static void main(String args[]){
    InterfaceDemo id=new InterfaceDemo();
    id.m1();
    System.out.println(x);
   }
 }


 o/p---welcome

 NOTE :- we can use static method and final keyword also
 i).we can only variables and methods create in interface we not create constractor.
 ii).we can'nt create object in interface.
 iii).we  can use interface the variables in the interface. 
 


// EXAMPLE:- 3   A CLASS CAN IMPLEMENTES ANY NUMBER OF INTERFACES 

 interface MyInterface{
    public static final int x=14;
    public abstract void m1();
 }
 interface gowri{
  public static final int y=20;
  public abstract void m2();
 }
 class appanna implements MyInterface,gowri{
  public void m1(){ 
   System.out.println("welcome");
 }

 public void m2(){
  System.out.println("gowrikumar");
 }
 
public static void main(String args[]){
appanna a1=new appanna();
a1.m1();
System.out.println(x);
a1.m2();
System.out.println(y);
}

 }

 
//  ****** ONE INTERFACE TO ANOTHER INTERFACE CALL IT.  ****** 


interface MyInterface{
  public static final int x=15;
  public abstract void m1();
}
interface gowri extends MyInterface{
  public static final int y=20;
  public abstract void m2();
}
class appanna implements MyInterface{
  public void m1(){ 
  System.out.println("welcome");
}
  public void m2(){
  System.out.println("ganga");
}

public static void main(String args[]){
  appanna a1=new appanna();
  a1.m1();
  System.out.println(x);
  a1.m2();
  System.out.println(y);
}
}


//  ONE INTERFACE TO TO MANY INTERFACES CALL
interface MyInterface{
  public static final int x=10;
  public abstract void m1();
}
interface MyInterface2{
  public static final int z=20;
  public abstract void m3();
}
interface MyInterface1 extends MyInterface,MyInterface2{
  public static final int y=15;
  public abstract void m2();
}
class appanna implementes MyInterface1{
  public void m1(){
    System.out.println("welcome");
  }
  public void m2(){
    System.out.println("gowrikumar");
  }
  public void m3(){
    System.out.println("dukka");
  }
  public static void main(String args[]){
    appanna a1=new appanna();
    a1.m1();
    System.out.println("x");
    a1.m2();
    System.out.println("y");
    a1.m3();
    System.out.println("z");
  }
}


*/