/*
 * ARRAY :- array is Orderly collection of homogeneous or similar values
            Each element is referenced by array name and its index.
            Array is fixed in size.
            one are more values stored at a time in the variable.

   TYPES OF ARRAY :-
      I). SINGLE DIMENSIONAL ARRAY
      II). Maltidimensional DIMENSIONAL ARRAY

    I).SINGLE DIMENSIONAL ARRAY :- A single Dimensional array is like a row of similar type of 
        glasses arranged on tray.
       ---> where as the two-dimensional array means Array of Arrays.

      syntax :-
        
          datatype arrayname[] = new datatype [size] ;

         ex:- ex of single dimensional array

         int[] numbers; where numbers is the name of array variable.
         numbers=new int[7]; where 7 is the length of the array.

         10   20   30   40   50   60   70-------> variables
         [0]  [1]  [2]  [3]  [4]  [5]  [6] -----> int array objects
    
    1). // java program to demonstrate one dimensional Array in java 
        public class Strings{
            // array in method argumentes can be doneted by 3 dots also
            public static void main(String args[]){
                // Declearing and creating an array of length?
                // int arr[] = new int[7];
               //  declearing and Initilizing an array,it initileze the length with number of number
                 int arr[]={1,2,3,4,5,6,7};
                 // looping down the array.
               for(int i=0;i<arr.length;i++){
                   System.out.println(arr[i]);
               }
            }
        }

class Testarray{  
public static void main(String args[]){  
int a[]=new int[5];//declaration and instantiation  
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}
} 






 2) TWO-DIMENSIONAL ARRAY :-
   Can also be multi-dimensional,like matrix or rubiks cube.
   Array of arrays.
   Cab be refered in the form of rows and columns.
 
   Syntax :-
         arrayName=new dataType[arrayLength_row][arrayLength_Col];
         int[][] numbers=new int[2][2];
  EX:-
    // java program to demonstrate two demensional Array in java.  
    public class Strings{
        public static void main(String...x){
            // Declering a two demensional with 3 rows and 3 columns and initilizing it
            // default value of each element is zero until it is initilated.
            // int number[][]=new int[3][3];
            // Declering a Two Demnsional with 3 rows and 3 columns and initilizing it.
            int numbers[][]={{1,2,3},{4,5,6},{7,8,9}};
            // Looping Down the array to print the values.
            // Row loop runs till lessthen array.length.
            for(int i=0;i<numbers.length;i++){
                // column loop runs lessthen each row length
                for(int j=0;j<numbers[i].length;j++){
                    System.out.print(numbers[i][j]+" ");
                }
                // new line after each row to show output in a matrix format
                System.out.println();
            }
        }
    }
      
    
    FOR-EACH LOOP IN ARRAY :-
      1).Special type of control statement.
      2).One more way of traversing array just like using for loop,while loop.

 Syntax :-
   for(datatype var: array){statements using var};  
 
   class Strings{
    public static void main(String args[]){
        // declering an array
        int arr[];
        // creating an array
        arr=new int[3];
        // initilizing array elementes
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        for(int var : arr){
           System.out.println(var);
        }
    }
   }
 

   
 class Array{
    public static void main(String[] args) {
        int[] arr={1,9,8,2,3,4};
        System.out.println("array elementes ofter the sorting");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                int temp=0;
                if(arr[i] > arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
 }  


 class Array{
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
 }

 // using for loop for(int i:arr);
 

 
 class DuplicateElementes{
    public static void main(String[] args) {
        int []arr ={1,2,2,3,4,5,3};
        System.out.println("duplicate elementes in given array");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
       if(arr[i]==arr[j]){
        System.out.println(arr[j]);
       }
            }
        }
    }
 }



 import java.util.Scanner;
class Swap{
  public void swapStrings(String str1,String str2){
    str1=str1+" "+str2;
    String words[]=str1.split(" ");
    str1=words[1];
    str2=words[0];
    System.out.println(str1+"\n"+str2);
  }
}
class SwappingString{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Swap s=new Swap();
    System.out.println("Enter the two Strings");
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    s.swapStrings(str1, str2);
  }
}


class Swap
{   
    public static void main(String args[])
    {
        // Declare two strings
        String a = "Hello";
        String b = "World";
         
        // Print String before swapping
        System.out.println("Strings before swap: a = " +
                                       a + " and b = "+b);
         
        // append 2nd string to 1st
        a = a + b;
         
        // store initial string a in string b
        b = a.substring(0,a.length()-b.length());
         
        // store initial string b in string a
        a = a.substring(b.length());
         
        // print String after swapping
        System.out.println("Strings after swap: a = " +
                                     a + " and b = " + b);       
    }   
}
 */