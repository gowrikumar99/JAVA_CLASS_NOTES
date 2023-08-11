import java.util.*;
public class LinkedList1 {
    public static void main(String args[]){

        /* 

        LinkedList<String> l1=new LinkedList<>();
        l1.add("y1");
        l1.add("y2");
        l1.add("y3");
        l1.add("y4");
        //System.out.println(l1); // o/p y1,y2,y3,y4

       */

        /* 
       
          // ONE LIST TO ANOTHERLIST ADDING

        ArrayList<String> a1=new ArrayList<>();
        a1.add("s1");
        a1.add("s2");
        a1.add("s3");
       
        LinkedList<String> l1=new LinkedList<>();
        l1.add("y1");
        l1.add("y2");
        l1.add("y3");
        l1.addAll(0,a1);
        System.out.println(l1);

        */

        // REMOVE METHOD

        /* 
        
        LinkedList<String> l1=new LinkedList<>();
        l1.add("y1");
        l1.add("y2");
        l1.add("y3");
        l1.add("y4");

        l1.remove(1);
          System.out.println(l1); //y2 delete


     // CLEAR METHOD

     l1.clear();
     System.out.println(l1); // o/p clear l1 list
     
    // CLEAR ALL METHOD
     
     l1.removeAll(a1);
     System.out.println(l1); // s1,s2,s3
      
    */
    // GET METHOD

      /* 
        LinkedList<String> l1=new LinkedList<>();
        l1.add("y1");
        l1.add("y2");
        l1.add("y3");
        l1.add("y4");

        System.out.println(l1.get(3));  // y4
      */

     // CONTAINS METHOD

     /* 
     LinkedList<String> l1=new LinkedList<>();
        l1.add("y1");
        l1.add("y2");
        l1.add("y3");
        l1.add("y4");
        System.out.println(l1.contains("y2"));// true
     */
     // UPDATE METHOD


      LinkedList<String> l1=new LinkedList<>();
        l1.add("y1");
        l1.add("y2");
        l1.add("y3");
        l1.add("y4");
        l1.set(2,"gowri");
        System.out.println(l1);
    }
    
}
