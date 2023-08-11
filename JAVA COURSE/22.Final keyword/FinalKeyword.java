/*
 * 
 * 1).when a variable is declered with finalkeyword it is value can't be modified aeeentially a constant.
 * 2).final keyword which can be applied to variables,methods,and classes.
 * 3).when a class is declered with final keyword ,it is called a final class a final class cannot be extended(inhereted).
 * 4).when a method is declered with final keyword,it is called a final method.a final method cannot be override.
 * 
 * 
 * 
 * 
 * 
 *         i)    VARIABLES TO APPLY FINALKEYWORD  
 *  


 i) without final keyword
 class FinalKeyword{
 public static void main(String args[]){
 int x=20;
  System.out.println(x);
 }
 }


 o/p=20;


 //i) with final keyword
 
 class FinalKeyword{
    public static void main(String args[]){
        final int x=10;
        x=x+5;
        System.out.println(x);
    }
 }

 o/p :cannot a assign value of final keyword

 
   //     II) CLASS APPLY FINAL KEYWORD



   // i). without using finalkeyword
class FinalKeyword{
    void display(){
        int x=20;
        System.out.println(x);
    }
}
class finalDemo2 extends FinalKeyword{
    public static void main(String[] args) {
        FinalKeyword f1=new FinalKeyword();
        f1.display();
    }
}

o/p: 20;


final class FinalKeyword{
    void display(){
        int x=20;
        System.out.println(x);
    }
}
class finalDemo2 extends FinalKeyword{
    public static void main(String[] args) {
        FinalKeyword f1=new FinalKeyword();
        f1.display();
    }
}
    



            III)   METHOD USING FINALKEYWORD


I)  without using final keyword in methods


class FinalKeyword{
    void display(){ 
    int x=20;
    System.out.println(x);
}
}

class FINALKEYWORD2 extends FinalKeyword{
    public static void main(String[] args) {
        FINALKEYWORD2 f1=new FINALKEYWORD2();
        f1.display();
    }
    void display(){
        int y=10;
        System.out.println(y);
    }
}

o/p :10




class FinalKeyword{
    final void display(){ 
    int x=20;
    System.out.println(x);
}
}

class FINALKEYWORD2 extends FinalKeyword{
    public static void main(String[] args) {
        FINALKEYWORD2 f1=new FINALKEYWORD2();
        f1.display();
    }
    void display(){
        int y=10;
        System.out.println(y);
    }
}

o/p : error : finddemo2 can not override display() in over rides in final.


*/