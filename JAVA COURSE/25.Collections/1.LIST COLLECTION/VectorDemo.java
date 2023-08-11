/* 
import java.util.*;
public class VectorDemo{
public static void main(String args[]){
    Vector v1=new Vector();
    //v1.add("Gowrikumar");
    //v1.add("amma");
    //System.out.println(v1);// output is gowrikumar,amma;

    //v1.add("appanna");
    //v1.add("ganga");
    //v1.add(0,"gowri");// index position we give firstposition 0;
    //System.out.println(v1);// o/p gowri,appanna,ganga;

    //v1.add("y1");
    //v1.add("y2");
    //v1.add("y3");
    //v1.add("y4");
    //v1.add("y5");
    //v1.add("y6");
    //v1.add("y7");
    //v1.add("y8");
    //v1.add("y9");
    //v1.add("y10");
    //v1.add("y1");  // duplicatea are allowed
    //size-no of elementes present in list
    //capacity-array capacity
    //System.out.println(v1);      //y1,y2,y3,.....y11;
    //System.out.println("size : "+v1.size());   // 11
    //System.out.println("capacity : "+v1.capacity());  //   20


   // Duplicates are allowed and null values
    //v1.add("y1");
    //v1.add("y2");
    //v1.add("y3");
    //v1.add("y3");
    //v1.add("y5");
    //v1.add("y5");
    //v1.add("y7");
    //v1.add("y7");
    //v1.add("y9");
    //v1.add(null);
    //v1.add(null);  // duplicatea are allowed
    //size-no of elementes present in list
    //capacity-array capacity
    //System.out.println(v1);      //y1,y2,y3,.....y11;
    //System.out.println("size : "+v1.size());   // 11
    //System.out.println("capacity : "+v1.capacity());  //   20


// ADDITION OF ELEMENT INTO THE LIST

 /* 
    addAll method

    v1.add("gowri");
    v1.add("Appanna");

    Vector v2=new Vector();  // creates second objects
    v2.add("suresh");
    v2.add("yadav");

   System.out.println(v1);   // print first object variable

    v1.addAll(v2);   // print first object variable to second variable

    System.out.println(v1);  // after add two methods and print v1

  */



    // RETRAVAL OF ELEMENT FROM THE LIST



  /* 
    v1.add("appayyamma");
    v1.add("sanysi");

   Vector v2 = new Vector();  // create second object

    v2.add("pavan");
    v2.add("kalyan");

    System.out.println(v1); // o/p appayyamma,sanyasi

    v1.addAll(v2);  // assess to one object to another object

    System.out.println(v1);  // o/p   appayyamma,sanyasi,pavan,kalyan

    System.out.println(v1.get(2));  // o/p  pavan
     
    */





    // DELETION OF ELEMENT FROM THE LIST

 /* 
 
    v1.add("appayyamma");
    v1.add("sanyasi");

    Vector v2 = new Vector();  // create second object.

    v2.add("pavan");
    v2.add("kalyan");

    System.out.println(v1); // o/p appayyamma,sanyasi.

    v1.addAll(0,v2);  // assess to one object to another object and print second object variables in first

    System.out.println(v1);  // o/p   pavan,kalyan,appayyamma,sanyasi.

    v1.remove(0); //remove the pavan.
    System.out.println(v1);
    v1.remove("sanyasi");//remove sanyasi name.
    System.out.println(v1);  // o/p kalyan,appayyamma,sanyasi.  
    v1.removeAll(v2);
    System.out.println(v1); // o/p appayyamma
    v1.clear();
    System.out.println(v1);


*/


  //VERFICATION OF ELEMENTES OF LIST


  /* 
   v1.add("appayyamma");
    v1.add("sanyasi");

    Vector v2 = new Vector();  // create second object.

    v2.add("pavan");
    v2.add("kalyan");

    System.out.println(v1); // o/p appayyamma,sanyasi.

    v1.addAll(0,v2);  

  System.out.println(v1);  // o/p   pavan,kalyan,appayyamma,sanyasi.
  System.out.println(v1.contains("sanyasi"));  //  o/p  true.
  System.out.println(v1.contains("hani")); // o/p  false.
  System.out.println(v1.containsAll(v2)); // true
    */


// UPDATION OF ELEMENTES IN THE LIST
  /* 
    v1.add("RAMCHARAN");
    v1.add("SANTOSH");

    System.out.println(v1); // o/p RAMCHARAN,SANTOSH

    Vector v2 = new Vector();  // create second object.

    v2.add("ALLUARJUN");
    v2.add("SAIDARAM TEJ");

    System.out.println(v2);//ALLUARJUN,SAIDHARAM TEJ

    v1.addAll(0,v2);  

  System.out.println(v1);  // o/p   ALLUARJUN,SAIDHARAM TEJ,RAMCHARAN,SANTOSH

  System.out.println(v1.get(1)); //   o/p SAITARAM TEJ
  v1.set(2,"vasanta");
  System.out.println(v1);//ALLUARJUN,SAIDARAM TEJ,vasanta,SANTOSH
  System.out.println(v1.get(2));  // vasanta
  System.out.println(v1.indexOf("SANTOSH"));   //  o/p 3.index method position findout
   System.out.println(v1.firstElement()); //ALLUARJUN
    System.out.println(v1.lastElement()); // SANTOSH


  */


  //   ARRAY CONVERSION

  /* 

  v1.add("kumar");
  v1.add("gowri");

  System.out.println(v1);

  Vector v2=new Vector();
  v2.add("appu");
  v2.add("ganga");

  System.out.println(v2);

  v1.addAll(0,v2);

  System.out.println(v1);

 // Object[]arr = v1.toArray();  // convert to array
  //System.out.println(Arrays.toString(arr));// o/p kumar,gowri,appu,ganga;  */

  //SIZE CORVERSION


  /* 
  Vector v2=new Vector(20);
  v2.add("appu");
  v2.add("ganga");
  System.out.println(v2.size()); 2
  System.out.println(v2.capacity());// 20
  
}
} 
*/
//---------------------------------------------------------------------


/* 
import java.util.*;

public class VectorDemo{
    public static void main(String args[]){

      Object[]arr=new Object[]{1,2,3,4,5,6,7,8,9};
      Vector v1=new Vector(Arrays.asList(arr));

  System.out.println(v1); o/p 1,2,3,4,5,6,7,8,9
  System.out.println(v1.size());  9
  System.out.println(v1.capacity());  9
    }
}
 */

 // GENERICS


 /* 
 import java.util.*;

public class VectorDemo{
    public static void main(String args[]){

      Object[]arr=new Object[]{1,2,3,4,5,6,7,8,9};
      Vector<Integer> v1=new Vector<>();    // integer array
      v1.add(12); //adda method
      v1.add(null); //null values allowed
      v1.add(null);  // duplicate values allowed
     v1.add(12);//duplicates allowed

  System.out.println(v1);//12,null,null,13
  System.out.println(v1.size());//4
  System.out.println(v1.capacity());//10
    }
}

*/
/*what is the default capacity of vector? 10
  what is the initial capacity?  10
  does it allow duplicates elementes?  yes
  Does it allow null values ? yes
  does it mentain the insertion order  ? yes
  does maintain the sorted order?no
  does it offer the random access of elementes?? yes
  is it synchronised? yes
  what is it good at? multithreading,data is incresed exponentially
 * 
 * 
 * 
 * 
 * 
 */

   //   ARRAYLIST CONCEPT IN COLLECTIONS  :---