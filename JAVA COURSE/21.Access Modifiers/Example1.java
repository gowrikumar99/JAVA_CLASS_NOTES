/* 

// 1). PUBLIC ACCESS MODIFIER

class Example{
    public static void main(String args[])
    {
        Example1 obj = new Example1();
        obj.display();
    }
}

//2).DEFAULT :-  

class Example1{
public static void main(String args[]){
  Example e1=new Example();
  e1.display();
}
}



//3).PRIVATE MODIFIER

class Example1{
    public static void main(String[] args) {
        Example e1=new Example();
        e1.display();
    }
}

o/p 

error: display() has privete access in a obj.display();




// 4). PROTECTED ACCESS MODIFIERS

 class B extends Example{
    public static void main(String[] args) {
        Example e1=new Example();
        e1.display();
    }
 }

 */

 
