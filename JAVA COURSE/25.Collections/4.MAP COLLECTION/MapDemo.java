/* 
what is  map ?
  map is a interface and its provided by the collections
  map is a combination of key value pairs. map is a data structure it is used to store
      key values pairs of information
 




            |--------------->  Map<Interface> <-----------|
            |                     |                       |
            |                     |                       |
            |                     |                       |
        HashTable<Class>     HashMap<Class>          SortedMap<Interface>
                                  |                       |
                                  |                       |
                                  |                       |
                            LinkedHashMap<Class>     NagavableMap<Interface>
                                                          |
                                                          |
                                                          |
                                                    TreeMap<class>
            
                                                    
1).A map contains values on the basis of key, i.e. key and value pair. 
   Each key and value pair is known as an entry. A Map contains unique keys.

2).A Map is useful if you have to search,
    update or delete elements on the basis of a key.

3).Java Map Hierarchy
   There are two interfaces for implementing Map in java: 
   Map and SortedMap, and three classes: HashMap, LinkedHashMap, and TreeMap.
   The hierarchy of Java Map is given below:

4).Java Map Hierarchy
   A Map doesn't allow duplicate keys, but you can have duplicate values. 
   HashMap and LinkedHashMap allow null keys and values, 
   but TreeMap doesn't allow any null key or value.
   Pause

5).A Map can't be traversed, so you need to convert it into Set using keySet() 
   or entrySet() method.

6).Class	Description
    HashMap	HashMap is the implementation of Map, but it doesn't maintain
    any order.
    
7).LinkedHashMap	LinkedHashMap is the implementation of Map.
   It inherits HashMap class. It maintains insertion order.

8).TreeMap	TreeMap is the implementation of Map and SortedMap.
  It maintains ascending order.


Creation of map
addition of map into the table
retraval of key from the map
retraval of values from the map
delition of elementes from the map
verfication of key in the map
verfication of values in the map
updation of elementes in the map

*/

 //HASHTABLE

 import java.util.*;

import javax.swing.RowFilter.Entry;
 public class MapDemo{
       public static void main(String []args){
            // List<String> list=new Vector<>(); //only one datatype passing
             // creation of map
             Map<Integer,String> m =new TreeMap<>();  // map having key and values,integer,string

             

             // Addition of map elementes into the map
             m.put(5000,"Hyderabad"); 
             m.put(123,"gowrikumar");
   
             //RETRAVAL OF THE KEYS FROM THE MAP BASED ON THE KEY
             
             Set<Integer> keys =m.keySet();
             System.out.println("these are keys : ");
             for(Integer key:keys){
                   System.out.println(key);  // o/p  5000,123
             }
            
            // RETRAVAL OF THE VALUE FROM THE MAP BASED ON THE VALUES
               
             Collection<String> values =m.values();
             System.out.println("this is values : ");
             for(String value :values){
                System.out.println(value); // o/p hyderabad,gowrikumar  
         }
         
        
            // above operations in must comments 

          


            // Retraval of values from the map based on a key

             Set<Integer> keysIntegers =m.keySet();
             System.out.println("these are keys : ");
             for(Integer key:keys){
                   System.out.println(key);  // o/p  5000,123
             }
            System.out.println(m.get(5000));
            for(Integer key:keys){
                System.out.println(key + " >>>>> "+m.get(key));
            }
          


          
       // DELITION OF  OPERATOR
       /* 
       System.out.println(m); // o/p 5000=hyderabad,123=gowrikumar
       m.remove(123);
       System.out.println(m);  //o/p  5000=hyderabad
                */



      // VERFICATION OF KEY AND VALUES
      /* 
        System.out.println(m.containsKey(5000));  // true
         System.out.println(m.containsKey(50001));  // false
        */



        // UPEDATION OF ELEMENTES


        /* 
        System.out.println(m);  // 5000 = hyderabad ;
        m.put(5000,"banglore");
        System.out.println(m); // 5000  = bangulore;

        */

        // REPLACE METHOD
          /* 
         System.out.println(m);  //  hyderabad
        m.replace(5000,"srikakulam");
        System.out.println(m); // srikakulam

        */
/* 
        System.out.println(m.size()); //2
         m.clear();
         System.out.println(m); //delete all

         */

         //RETRAVAL OF KEYS FROM THE MAP
         
         
       }
 
    }