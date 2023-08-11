/*import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(5);
        System.out.println(al1);
        System.out.println(al1.size());
    }
    
}

 // ADD METHOD

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListDemo {
    public static void main(String args[]){
        Integer[] arr=new Integer[]{1,2,3,4,5};
        ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(arr));
        al1.add(5);
        System.out.println(al1); // o/p 1,2,3,4,5,6
        System.out.println(al1.size());  //6
    }
    
}


//  RETRAVAL METHOD

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListDemo {  
    public static void main(String args[]){
         Integer[] arr=new Integer[]{1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(arr));
        al1.add(5);
        System.out.println(al1);  // 1,2,3,4,5,6,7,8,9,5
        System.out.println(al1.size());// 10
        System.out.println(al1.get(3));  // 4
    }
}

*/
/* 
// DELITION OF ELEMENT
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListDemo {  
    public static void main(String args[]){
         Integer[] arr=new Integer[]{1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(arr));
        al1.add(5);
        System.out.println(al1);  // 1,2,3,4,5,6,7,8,9,5
        System.out.println(al1.size());// 10
        al1.set(0,23);
        System.out.println(al1);// 23,2,3,4,5,6,7,8,,95
        al1.remove(2);  
        System.out.println(al1);// 23,2,4,5,6,7,8,9,5
        for(int i=0;i<al1.size();i++){
            System.out.print(al1.get(i)+ " "); //
        }
    }
}

*/

//VERFICATION METHOD :-
/* 
 import java.util.ArrayList;
 import java.util.Arrays;
 public class ArrayListDemo {  
    public static void main(String args[]){
         Integer[] arr=new Integer[]{1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(arr));
        al1.add(5);
        System.out.println(al1);  // 1,2,3,4,5,6,7,8,9,5
        System.out.println(al1.size());
        al1.contains
      
        
        
    }}

    */
 
    
/*
 * what is the defaut capacity ?  0
 * what is the initial capacity  ?  10
 * does it allow duplicates elementes?
 * does it allow null values?
 * does it maintain the insertion order?
 * does it maintain the sorted order?
 * does it offer sorted order?
 * does it offer the random access of elementes
 * is it synchronized?
 * what is it good at?
 */