   /*  
   
   //    Encapsulation     // 
    /*
     * encapsulation is a process of binding the variables and methods into a single entity.
     * using the we can implement abstraction
     * using this we can implement mentanance of application
     * 
     * Ex :-
    
      class Example{
      String name="Gowrikumar";
     }
      class Example2{
         public static void main(String args[]){
         Example a = new Example() ;
         System.out.println(a.name);
        }
       
}


o/p  gowrikumar


Ex:2

 class Example{
      private String name="Gowrikumar";   // we have some sequrity in privete
     }
      class Example2{
         public static void main(String args[]){
         Example a = new Example() ;
         System.out.println(a.name);
        }
       
}

o/p 

//the field encapsulation .name is not visible



//EX:-3   GETTER METHOD

class Example{
      private String name="Gowrikumar1"; 

      public String getName(){
        return name;
      }  
     }
      class Example2{
         public static void main(String args[]){
         Example a = new Example() ;
         System.out.println(a.getName());
        }
       
}

o/p gowrikumar1


Ex:-4 SETTER METHOD


class Example{
      private String name; 

      public String getName(){
        return name;
      }  
      public void setName(String name){
             this.name=name;
      }
     }
      class Example2{
         public static void main(String args[]){
         Example a = new Example() ;
         a.setName("amma");
         System.out.println(a.getName());
        }
       
}

o/p  amma

NOTE :--
i).modify the value user setter method intension
ii).user given to value.



EX:-- 5  

class Example{
  private String name;
  public String getName(){
    System.out.println("some one is accssing your data");
    return name;
  }
    public void setName(String name){
      System.out.println("some one is changing your name");
      this.name=name;
    }
  }
class Example1{
  public static void main(String args[]){
    Example e1=new Example();
    e1.setName("amma");
    System.out.println(e1.getName());
  }
}


o/p  

some one accessing the data
some one is changing the data
amma

Note :--

i).first off all we create class and we have public access modifier type data
 and we want call this data another method 
ii) must and shoud we create another class and method in first class we create getter method.
  return type of setter method also create.
iii).and we create object. object through call setter method



class Example{
  private String name;
  private int id;
  private double amount;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public double getAmount() {
    return amount;
  }
  public void setAmount(double amount) {
    this.amount = amount;
  }
}

class Example1{
  public static void main(String args[]){
    Example e1=new Example();
    e1.setName("dukka gowrikumar");
  System.out.println(e1.getName());
  }
}
*/
