/*Collections in java
=====================

BITLABS :---------

Collections :-----
               Collection is a framework provided by java
               this framework provides many interfaces and their implemented class
               in order to store group of objectes(elementes) in a single entity.

COLLECTIONS Interface provided by collection framework
   collections having two interfaces
   i).Collection<interface>
      1.List<interface>
      2.Set<interface>
      3.Queue<interface>
   11).Map<Interface>

Classes provided by collections framework:-

1).LIST  <interface>
   i)ArrayList
   ii).LinkedList
   iii).Vector
   iV).Stack

2).SET <Interface>
   i).HashSet
   ii).LinkedHashSet
   iii).TreeSet

3).QUEUE
   i).ArrayQueue
   ii)priorityQueue

4).MAP
   i).HashTable
   ii).HashMap
   iii).LinkedHashMap
   iv).TreeMap

DIFFERENCE BETWEEN ARRAYS AND COLECTIONS :-

ARRAY :-
 i).Array size is fixed.
 ii).Hold only homogenious or similar data types of elementes.
 iii).with respect to memory usage,these are not recomended to ba used.
 iV).Hold both object and premitive datatypes.
 v).No standard data structure,inbuilt method support is not available.
COLLECTIONS :-
i).Growable in nature.
ii).Hold both homogenious and heterogeneous elementes,
iii).with respect to memory usage,these are recomended to to be used.
iV).Hold only object types but not primitive types.
V).standard data structure.inbuilt method support is available.


JAVA COLLECTION FRAMEWORK :-
  i).which is the root interface for all the collections interfaces and classes.
  ii). java collections framework provides many interfaces and defines class that impleent
      inbuilt interfaces.framework consistes of interfaces,classes,and further inbuilt methods.


                                             ITARABLE(INTERFACE)
                                                |
                                                |
                                             COLLECTION (INTERFACE)
                                                |
              __________________________________|______________________________
             |                                  |                              |
             |                                  |                              |
             |                                  |                              |
            LIST(INTERFACE)                   QUEUE(INTERFACE)                SET(INTERFACE)
             |                                  | |                           | |
             |<-----ARRAYLIST (CLASS)           | |<---Priorityqueue (CLASS)  | |<-----HASH SET (CLASS)
             |                                  |                             |
             |<-----LINKEDLIST (CLASS)          |<----deque(INTERFACE)        |<-----SORTED SET (INTERFACE)
             |                                  |                             |
             |<-----VECTOR  (CLASS)             |<---ArrayDeque (CLASS)       |<-----TREE SET (CLASS)
                      |
                      |
                  STACK(CLASS)


            Hierarchy of Map Interface :-

                  |------------> MAP(iNTERFACE)<----------------|
                  |                 |                          |
                  |                 |                          |
               HASHTABLE<class>  HashMap<class>              SortedMap<Interface>
                                    |                          |
                                    |                          |
                                 LinkedListMap<class>       NavigatingMap<Interface>

                                 
/
VECTOR :--  


 import java.util.*;
 public class Collections{ //VPractice
  public static void main(String args[]){
   Collections v1=new Collections(); // Vector, Vector
    System.out.println(v1); // output print []
  }
 }


                                 

STACK :- stack is a child class of vector class that implementes Listinterface.
          stack is LIFO(Last in first out) based structure and have operations like push,pop etc.
        
STACK METHOD :-
 //special methods available in stack.
//push,pop,peek,search,isEmpty()
import java.util.*;
class SPractice{
    public static void main(String[] args) {
        Stack<String>books= new Stack<>();
        //books.add("red");
        //books.add("black");
        //books.add("white");
        //System.out.println(books);//  print red,black,white
        //System.out.println(books.peek()); // last element print white
        //System.out.println(books);
        //System.out.println(books.pop()); // last element remove
        //System.out.println(books); // then remain red and white
         books.push("red");
        books.push("black");
        books.push("white");
        books.push("black");
        books.push(null);
        //System.out.println(books); // red,black,white
      //System.out.println(books.pop());  // push method=add method. add method to push method same output.white
      //System.out.println(books);//red,black
      //System.out.println(books);  // ptrnt red,black,white
      //System.out.println(books.search("white")); // 1  down to count
      //System.out.println(books.indexOf("white")); //upto count index starting 0 index position
      //System.out.println(books);// print red,black,white
      System.out.println(books.isEmpty());  // false .hear 3 values,red,black,white
      System.out.println(books.empty());
    }
}
QESTIONS IN STACK :-
1.WHAT IS THE DEFAULT CAPACITY?  //10.
2.WHAT IS THE INITIAL CAPACITY?  // 10
3.DOES IT ALLOW DUPLICATES ELEMENTES? // YES
4.DOES IT ALLOW NULL VALUES?  // yes
5.DOES IT MANTAIN THE INSERTION ORDER? // yes
6.DOES IT MANTAIN THE SORTED ORDER?  // no
7.DOES IT OFFER THE RANDOM ACCESS OF ELEMENTES? // yes.it will allow.we cant use random elementes
8.IS IT sYNCHRONIZED?  // yes
9.WHAT IS IT GOOD AT? //LIFO



 import java.util.*;
 public class Collections{ //VPractice
  public static void main(String args[]){
   Collections v1=new Collections(); // Vector, Vector
   v1.add("gowri");
   v1.add("appu");
    System.out.println(v1); // output print []
  }
 }
 */