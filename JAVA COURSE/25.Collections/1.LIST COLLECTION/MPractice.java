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
public class MPractice{
      public static void main(String []args){
            // creation of map
            Map<Integer,String> m =new Hashtable<>();
            // addition of map elementes into the map
            m.put(5000,"hyderabad");
            m.put(200,"yadav");
            //retraval pf keys from the map
            Set<Integer> keys =m.keySet();
            for(Integer key:keys){
                  System.out.println(key);
            }

      }
}
