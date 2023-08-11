/*   what is set  :-
   =================

i).set is one of the interface provided by collection.
ii).set is a one of the structure annd store the multipleElementes of data.
iii).which only stores the unique elementes of data.which does not allowed any duplicates.
iV).
                            Collection
                            <Interface>
                                 |
                                 |
                                 |
              |-------------Set<Implementation> <---------|
              |                  |                        |
              |                  |                        |
              |                  |                        |
        HashSet<class> <-----LinkedHashSet           SortedSet<Interface>
                             <class>                      |
                                                          |
                                                          |
        
                                                     TreeSet<class>

 Java HashSet :- class is used to create a collection that uses a hash table for storage. 
                 
The important points about Java HashSet class are:-
===================================================

1).HashSet stores the elements by using a mechanism called hashing.
2).HashSet contains unique elements only.
3).HashSet allows null value.
4)HashSet class is non synchronized.
5).HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
6).HashSet is the best approach for search operations.
7).The initial default capacity of HashSet is 16, and the load factor is 0.75.
8).Difference between List and Set
9).A list can contain duplicate elements whereas Set contains unique elements only.

Hierarchy of HashSet class
The HashSet class extends AbstractSet class which implements Set interface. 
The Set interface inherits Collection and Iterable interfaces in hierarchical order.



Java LinkedHashSet Class :-
===========================
 => Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.
              It inherits the HashSet class and implements the Set interface.

The important points about the Java LinkedHashSet class are:-
=============================================================

1).Java LinkedHashSet class contains unique elements only like HashSet.
2).Java LinkedHashSet class provides all optional set operations and permits null elements.
3).Java LinkedHashSet class is non-synchronized.
4).Java LinkedHashSet class maintains insertion order.

Note: Keeping the insertion order in the LinkedHashset has some additional costs, both in terms of extra memory and extra CPU cycles. 
           Therefore, if it is not required to maintain the insertion order, go for the lighter-weight HashMap or the HashSet instead.
Hierarchy of LinkedHashSet class
The LinkedHashSet class extends the HashSet class, which implements the Set interface. The Set interface inherits Collection and Iterable interfaces in hierarchical order.




Java TreeSet class
TreeSet class hierarchy
Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.

The important points about the Java TreeSet class are:

Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quiet fast.
Java TreeSet class doesn't allow null element.
Java TreeSet class is non synchronized.
Java TreeSet class maintains ascending order.
Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quite fast.
Java TreeSet class doesn't allow null elements.
Java TreeSet class is non-synchronized.
Java TreeSet class maintains ascending order.
The TreeSet can only allow those generic types that are comparable. For example The Comparable interface is being implemented by the StringBuffer class.
Internal Working of The TreeSet Class
TreeSet is being implemented using a binary search tree, which is self-balancing just like a Red-Black Tree. Therefore, operations such as a search, remove, and add consume O(log(N)) time. The reason behind this is there in the self-balancing tree. It is there to ensure that the tree height never exceeds O(log(N)) for all of the mentioned operations. Therefore, it is one of the efficient data structures in order to keep the large data that is sorted and also to do operations on it.

Synchronization of The TreeSet Class
As already mentioned above, the TreeSet class is not synchronized. It means if more than one thread concurrently accesses a tree set, and one of the accessing threads modify it, then the synchronization must be done manually. It is usually done by doing some object synchronization that encapsulates the set. However, in the case where no such object is found, then the set must be wrapped with the help of the Collections.synchronizedSet() method. It is advised to use the method during creation time in order to avoid the unsynchronized access of the set. The following code snippet shows the same.
Advertisement



 
*/

 import java.util.*;
 class SetMethod{
    public static void main(String args[]){

        // Hashset stores the data HashMap;
        //both or same
        //Set<Integer> hs=new HashSet<>();
       /* 
        HashSet<Integer> hs= new HashSet<>();
        hs.add(10);
        hs.add(22);
        hs.add(31);
        hs.add(45);
        hs.add(52);
        System.out.println(hs);  // not-particular order mentained 2,85,9,10,12
       */


       
    }
 }