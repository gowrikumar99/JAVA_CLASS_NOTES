/*
1).INHERETANCE :-

   I).a process of acquiring the members of one class to another class is called inheretance.
   ii)using inheretance we can achive reusability and there by reduce the code size and developement time of the application.
   iii).java suports 4 types of inheretance
        a).single inheretance
        b).maltilevel inheretance
        c).hirarical inheretance
        d)Hibride inheretance
 
 1). SINGLE INHERETANCE :-

 class employee{
    float salary=4000;
 }
 class Example extends employee{
    int bonus=1000;
    public static  void main(String args[]){
        Example e1= new Example();
        System.out.println("Total salary : "+(e1.salary+e1.bonus));
    }
 }

 
// 2).MALTILEVEL INHERETANCE :-

class Add{
    int a=15, b=20;
    void add(){
        System.out.println(a+b);
    }
}
class sub extends Add{
    void sub(){
        System.out.println(a-b);
    }
}
class mal extends sub{
    void mal(){
        System.out.println(a*b);
    }
}
class div extends mal{
    void div(){
        System.out.println(a/b);
    }
}

class Example{
    public static void main(String args[]){
        div d= new div();
        d.add();
        d.sub();
        d.mal();
        d.div();
    }
}



// 3).IRRACLE INHERETANCE :-

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class  Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("meowing");
    }
}
class Example{
    public static void main (String args[]){
        cat c=new cat();
        c.meow();
        c.eat();
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}


//  HYBRIDE HINERETANCE




// pattrens :-

class Example{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<5;i++){
            System.out.println("* ");
        }

    }
}

o/p
*
*
*
*
*


example 2:- */

class Example{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
            System.out.println("* ");
        }
        System.out.println();
    }
    }
}


