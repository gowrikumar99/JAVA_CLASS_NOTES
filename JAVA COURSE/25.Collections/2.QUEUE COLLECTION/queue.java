/*   WHAT IS QUEUE ?

i).Queue is interface part of the collection frame work.
ii).queue is data one of the structure and also interfaces.
iii).queue is ueses to maltiple elementes(values) storeing.
iv).queue is introduced to FIFO principal(first in first out).

*/

/*
HIERARCHY OF QUEUE INTERFACE IN JAVA ?
i).priority queue is fure implimentation of Queue interface.
ii).

i).                        Itarable <Intraface>
                                |
                                |
                            Collections <interface> 
                                |                                                                                                  |
                                |                                 
            |------------> Queue<Interface> <------|       
            |                                      |             
            |                                      |              
            |                                Deque<interface>     
            |                                |          |         
            |                                |          |         
            |                            ArrayDeque    LinkedList<CLASS>
            |                           <CLASS>
        PriorityDeeue<CLASS>




 */

import java.util.*;
class queue{
    public static void main(String [] args){
      /*   // priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // addition - offer,add
        // retraval-peek
        // Removal-poll,removal


        // ADDITION  of the method

        pq.add(8);
        pq.add(2);
        pq.add(5);
        pq.add(7);
        // priority queue is not a sorted order.but head position is give highest priority
        //System.out.println(pq); // 2,7,5,8
        // after we take another example
        pq.add(1);
        //System.out.println(pq);// 1,2,7,5,8

      

        // RETRAVL METHOD
         //System.out.println(pq);// 1,2,7,5,8
        // System.out.println(pq.peek());  // o/p  1  //here peek is retraval method   retraval method allowes only header element.
        // System.out.println(pq);  // 1,2,7,5,8

        System.out.println(pq);// 1,2,7,5,8
        System.out.println(pq.poll());  // o/p 1 element is removed
        System.out.println(pq); // o/p 2,7,5,8



         System.out.println(pq);//  o/p  2,7,5,8
        System.out.println(pq.poll());  // 2  eliment is removed
        System.out.println(pq); // o/p   5,7,8



        System.out.println(pq);//  o/p  5,7,8
        System.out.println(pq.poll());  //  5 
        System.out.println(pq); // o/p   7,8
        
        

         System.out.println(pq);//  o/p  7,8
        System.out.println(pq.poll());  //  7
        System.out.println(pq); // o/p   8



         System.out.println(pq);//  o/p  8
        System.out.println(pq.poll());  //  8
        System.out.println(pq); // o/p   []

       

      //  CONTAINS METHOD 


       System.out.println(pq);//  o/p  1,2,5,8,7
        System.out.println(pq.contains(5));  // true
        System.out.println(pq); // o/p   1,2,5,8,7



        
       // priority with for loop

        System.out.println(pq);
        for(Integer integer: pq){
            System.out.println(integer);  //1,2,5,8,7   horizantal row
        }
       


       // WHILE LOOP

       while(!pq.isEmpty()){
        System.out.println(pq.poll());  // o/p  1,2,5,7,8 orderwise sequence printing
       }
        
     

        // clear method


        System.out.println(pq);   // 1,2,5,8,7
        pq.clear();
        System.out.println(pq);  // []

       // COMPARATOR REVERSE METHOD
      
       // priyartyQueue<Integer> pq= new priorityQueue<>(Comparator.reverseOrder());

       //while(!pq.isEmpty()){
       // System.out.println(pq.poll());  // o/p  1,2,5,7,8 orderwise sequence printing
      // }

      */











     // ARRAY DEQUE METHOD :-  ANOTHER CLASS FIRST OF HIDE THE BEFORE OBJECT
      // i). here delition is  first side insertion is last side.
      // ii).arrayduece is defalut value is 17.
      // iii).head daggra delition,insertion cheyavachu and tail daggra delition ,insertion cheyayavachu
      // iv). arraydeueu internally implimentes arrays only.
      // v).


     /* 

     ArrayDeque<String> ad=new ArrayDeque<>();
        // Addition-offer-offerFrist,offerLast,add,addAll
        // retraval-peek,peekFirst
        // poll-poll,pollFirst,pollLast,removal,remove first,remove last
        ad.add("banana");
        ad.addFirst("cherry");
        ad.addLast("Apple");
        ad.offerFirst("Kiwi");
        ad.offer("pear");
        ad.offerLast("mango");
        System.out.println(ad);// o/p  kiwi,cherry,banana,Apple,pear,mango
        System.out.println(ad.peek());   // kiwi
        System.out.println(ad.peekFirst());   // kiwi
        System.out.println(ad.peekLast());  // mango
        System.out.println(ad.poll());  // kiwi
        System.out.println(ad);    // cherry,banana,apple,pear,mango
        System.out.println(ad.pollFirst());  // cherry
        System.out.println(ad);   // banana,apple,pear,mango
        System.out.println(ad.pollLast()); // mango
        System.out.println(ad); // banana,apple,pear
        System.out.println(ad.isEmpty());
       // ad.clear();
        System.out.println(ad.size());
                
    }
}

LinkedList<String> ad=new LinkedList<>();
    1.peek();
    2.remove();
    3.offer();
    4.isEmpty();
    5.clear();
    6.add();
    }
}



 IMPORTANT POINTS
 1. what is the default capacity?  11
 2.what is the initial capacity ?. 11
 3.does it allow duplicates elementes ? yes
 4.does it allows null values  ? no
 5.does it maintain the insertion order? no
 6.does it maintain the sorted order?  no
 7.does it offer random access of elementes ? no
 8.is it synchronized? no
 what is it good at?  

*/