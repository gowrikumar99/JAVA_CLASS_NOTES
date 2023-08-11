/*  
1). CLASS :-
    i). A class is a collection of common propertyes and common actions of gropu of objectes
    ii).A class can be  considered as a plan or a model or a blueprint for creating an object.
    iii).for a class we can create any number of objectes.
    iV).without class the object creation is not possible.
    v).An object is a instance of class.
    vii) class is non-premitive data type
        EX:- Bike myFirstBike = new Bike(); here bike is class name,
             myFirstBike is object variable name,new is keywod,Bike() constractor
    vi).mixed case with the first letter of each internal word capitalized.


 2) OBJECT :- 

    i) an entity that existes physical in the real world which requires some
       memory will be called as an object
    ii).every object is contain some "properties" and some "actions".
    iii).the properties are the data or information which describes the object
        and they are represented by variables.
    iv).Action are the taskes or the operations performed by the
        object they are reoresented by methods  
   
   
// java program todemonstrate bike class,its member variables and objectes. 
 public class Objectes{
    // class member variables decleration
    String model;
    String color;
    public static void main (String args[]){
        // creating first object called"myFirstBike" and assigning the value to model and color
        Objectes myFirstBike = new Objectes();
        myFirstBike.model="pulsar";
        myFirstBike.color="Red";
        // creating second object called "myNewBike" and assigning the value to model and color
        Objectes myNewBike=new Objectes ();
        myNewBike.model="dominer";
        myNewBike.color="blue";
        // printing the value of attributes for myFirstBike
        System.out.println("myFirstBike: "+""+ myFirstBike.model+" "+myFirstBike.color);
        System.out.println("myNewBike: "+""+myNewBike.model+" "+myNewBike.color);
    }
 }

   */
   
   
   
    
