/* 
1).different ways to print array

class Example{
  public static void main(String[] args) {
    int a[] = new int[3];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
}

2).negitive elementes in Array

public class Example1{
    public static void main(String[] args) {
      int[] arr = {1, -2, 3, -4, 5};
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
          System.out.println(arr[i]);
        }
      }
    }
}
  
o/p -2,-4

3). Write a JAVAprogram to count total number of negative elements in an array.

import java.util.*;
class gowri{
    public static void main(String ...a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int negativeCount=0;
        System.out.println("Enter " +(n)+ " array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } 
        for(int i=0; i<arr.length;i++){
            if(arr[i]<0){
                negativeCount++;
            }
        }
        System.out.println("Total Negative Number : " + negativeCount );
    }
}

o/p
enter the size of array 5:
enter array elementes 1,-2,-3,4,-9
total negetive elementes :3

4). Write a JAVAprogram to find maximum and minimum element in an array. 

import java.util.Scanner;
class Example1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Array Size : ");
        int a=sc.nextInt();

        System.out.println("Enter The Array Elementes");
        int b[]= new int[a];
        
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
         int max=b[0];
         for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
     System.out.println("Maximum Array Element : "+max);
     int min=b[0];
         for(int i=0;i<b.length;i++){
            if(b[i]<min){
                min=b[i];
            }
        }
     System.out.println("Minimum Array Element : "+min);
    }
}


class Main{
    public static void main(String args[]){
        int a[] ={1,2,3,4,5};
        
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                max=a[i];
            }
        }
        System.out.println(max);
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
5). even and odd elements in an array.

import java.util.Scanner;
class Example1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size :");
        int a=sc.nextInt();

        System.out.println("Enter the Array Elementes :");
        int b[] =new int[a];
        
        for(int i=0;i<b.length;i++){
          b[i]=sc.nextInt();
        }
        
        System.out.println("Even numbers are : ");
        for(int i=0;i<b.length;i++){
          if(b[i]%2==0){
            System.out.println(b[i]);
          }
        }

        System.out.println("Odd numbers are : ");
        for(int i=0;i<b.length;i++){
          if(b[i]%2!=0){
            System.out.println(b[i]);
          }
        } 

    }
}

6). Write a JAVAprogram to count total number of even and odd elements in an array.

import java.util.*;
class Main{
    public static void main(String ...a){
        int arr[] = new int[]{ 1,2,3,4,5,6,7,8,9,10,11 }; 
        int evenCount=0, oddCount=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Total Even Number : " + evenCount + "\nTotal Odd Number : "+oddCount);
    }
}

o/p
total even numbers:5
total odd numbers :6

7). Write a JAVAprogram to copy all elements from an array to another array.

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        // Initilize first array
        int arr1[]= new int []{4,5,7};

        // create another array arr2 with same size as arr1
        int arr2[]=new int  [arr1.length];
        
        // copying all elementes of arr1 to arr2
        for(int i=0;i<arr1.length;i++){ // here we take i=0 .this value and we are checking arr1[]={4,5,7} 
             // and checking i<arr1.length(i=0<3) condition satisfy  then after i=0 means "i"  index value is 3
             // index value i= 0<3= satisfy (storing 4 value in arr2); 
             // i=1<3 satisfy (storing the value 5 value in arr2);the value i=2<3 (storing 7 value in arr2); i=3<3 this not satisfied loop is exit.

          arr2[i]=arr1[i]; //4;5/7
        }

        // printing the second array
       System.out.println("Display elementes of second array :");
       for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
       }
        
    }
}

8). duplicates from array

class Example1{
  public static void main(String[] args) {
    // initilize an array
    int arr[]=new int[] {4,8,3,8,2,4};
    System.out.println("Duplicate elementes in given array");
    for(int i=0;i<arr.length;i++){ // here i=0 index value i=4 and j=i+1=5 conditions
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          System.out.println(arr[j]);
        }
      }  
    }
  }
} 

9).Write a JAVAprogram to delete an element from an array at specified position.


71,23,66,99,45,56  elementes
0   1  2  3  4  5  indexes  


delection an element from array
===============================

for(i=location;i<max;i++){    // here i=2 index value maxium value =5; 2<5 condition is satisfied  then entering the loop array[2]=array[2+1],and
  moving the 3 index value 99 into 2 index value.again index value i=3 minimum value 3<5 condition is satisfied.......

  array[i]=array[i+1];    
}

max=5;

location =2;


import java.util.Scanner;
class Example1{
  public static void main(String args[]){
    int array[] = new int[5];
    int location =0;
    int max=4;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nEnter 5 integer values : ")

    for(int i=0;i<=max;i++){
      array[i] =sc.nextInt();
    }
    System.out.println("values in arrays are following : ");
    for(int i=0;i<max;i++){
      System.out.println(array[i]);
    }
   

    System.out.println("Enter the location from where you want to delete the value(index value with 0)");
    location=sc.nextInt();
    for(int i=location;i<max;i++){
      array[i] =array[i+1];
    }
    System.out.println("Values in array after deleting the value from the location"+location);


   // print values in one by one
     for(int i=0;i<max;i++){
      System.out.println(array[i]);
    }
   
  }
}

10).. reverse of the array

class Example{
  public static void main(String[] args) {
    // initilize an array
    int arr[]=new int[] {1,2,3,4};
    System.out.println("length of the array is : "+arr.length);
    System.out.println("Array reverse order : ");
    for(int i=arr.length-1;i>=0;i--){
          System.out.print(arr[i]+" ");
    } 
  }
}

11).largest element in array 

class example{
  public static void main(String[] args) {

    // initilize the values
    int arr[]=new int[] {85,25,33,405,52};

    // max value is stoterd in arr[0] means arr[85] with comparing with others elementes
    int max=arr[0]; // i=0; 85 stored;  405 stored
    for(int i=1;i<arr.length;i++){ // i=1 means ;i<2  ; i<3 ;i<4
      if(arr[i]>max){//  85<25 condition false; 85<33 condition false; 85<405  condion true now  ; 405<52 condition is false
        max=arr[i];
      }
    }
    System.out.println("Largest element in an array : "+max);
  }
}

12).  sorted elementes of an array in asending order

class Example{
  public static void main(String[] args) {

    // initilize the array
    int arr[]=new int[] {1,5,2,9,4};
    int temp=0;

    // we are printing theoriginal array
    System.out.println("Enter elementes of an array :");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
    }


    for(int i=0; i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){  //1>5  ; 1>4
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println();
    System.out.println("Enter of sorted array :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}


13). array length

import java.util.Scanner;
class Example{
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the array size : ");
    int a=sc.nextInt();

    System.out.println("Enter the elementes : ");
    int b[]= new int[a];

    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt();
    }
    System.out.println("Array Elementes are : ");

    for(int i=0;i<b.length;i++){
      System.out.println(b[i]+" ");
    }
    System.out.println("Array length : "+b.length);
  }
}




14).   reverse order


import java.util.Scanner;
class Example{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size : ");
    int a = sc.nextInt();

    System.out.println("Enter the array elementes : ");
    int b[]=new int[a];

    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt();
    }
    System.out.println("Array reverse elementes");
    for(int i=b.length-1;i>=0;i--){
      System.out.print(b[i]+" ");
    }
  }
}


15). add and sum of all array elementes


  //   *find sum of array elementes  *

  import java.util.Scanner;
  class Example{
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the Array size : ");
      int a=sc.nextInt();

      System.out.println("Enter the array elementes :");
      int b[] =new int[a];

      for(int i=0;i<b.length;i++){
        b[i]=sc.nextInt();
      }

      System.out.println("Array elementes : ");
      int sum=0;
      for(int i=0;i<b.length;i++){
        sum=sum+b[i];
        System.out.println(b[i]+" ");
      }
     System.out.println("ADDITION OF ARRAY ELEMENTES : "+sum);
    }
  }

  

16).  SEARCH ELEMENTES IN ARRAY
  
import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Elamentes : ");
    int a[]= new int[5];

    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Array Elementes : ");
    
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]+" ");
    }
    System.out.println("\nEnter search Element :");
    int n=sc.nextInt();

     int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]==n){
        count++;
      }
    }
    if(count>0){
      System.out.println("Element Is Found ");
    }else{
      System.out.println("Element Is NotFound");
    }
  }
}


17). find average of array elementes :

import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elementes :");
    int a[]=new int[5];
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Array elementes");
    for(int i=0;i<5;i++){
      System.out.println(a[i]+" ");
    }
    int sum=0;
    for(int i=0;i<5;i++){
      sum=sum+a[i];
    }
    int average=sum/5;
    System.out.println(sum+" "+average);
  }
}



18). array ascending order

import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter elementes in array : ");
    int temp;
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
      for(int j=i+1;j<5;j++){
        if(a[i]>a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=0;i<5;i++){
      System.out.println(+a[i]+" ");
    }
  }
}



19). array descnding order

import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter elementes in array : ");
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    int temp;
    for(int i=0;i<5;i++){
      for(int j=i+1;j<5;j++){
        if(a[i]<a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=0;i<5;i++){
      System.out.println(+a[i]+" ");
    }
  }
}


// 20). insert item in array particular position


import java.util.Scanner;
class Element1{
    public static void main(String[] args) {
        int size,loc,item,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size : ");
        size=sc.nextInt();
        int a[]=new int[size+1];
        System.out.println("Enter Array Elementes : ");

        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
       System.out.println("Enter Array Location : ");
       loc=sc.nextInt();
       System.out.println("Enter new item : ");
       item=sc.nextInt();

       for(i=size;i>loc;i--){
         a[i]=a[i-1];
       }
      a[loc]=item;
      size++;

      for(i=0;i<size;i++){
            System.out.println(a[i]+" ");
        }

    }
}

//21). Write a JAVAprogram to find second largest element in an array.


import java.util.Scanner;
class Example1{
    public static void main(String[] args) {
        int arr[]={8,2,5};
        int temp,size;
        size=arr.length;  // 3
        System.out.println("Array size is "+size);

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        System.out.println();
        System.out.println("Elementes of array in ascending order");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Second Largest Number is : "+arr[size-2]);
    }
}


22).Write a JAVAprogram to count frequency of each element in an array.

import java.util.Scanner;
class Example1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size : ");
    int a=sc.nextInt();
    System.out.println("Enter the elementes: ");
    int b[]=new int[a];   // 1,2 3 4,1,2,3
    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt(); 
    }
    boolean c[]=new boolean[a];
    for(int j=0;j<c.length;j++){
      c[j]=false;
    }
    for(int i=0;i<c.length;i++){
      int count=1;
      if(c[i]==true){
        continue;
      }
      for(int j=i+1;j<b.length;j++){
        if(b[i]==b[j]){
          count++;
          c[j]=true;
        }
      }
       System.out.println(b[i]+" "+count); 
    }
  }
}



//23).Write a JAVAprogram to print all unique elements in the array.

// 24).find single missing number in array
*/
class Elementes1{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,4,5};
         // 1 ,2,3,4,5
        int sum=0;
        int n=arr.length;
        System.out.println("Length of the array is : "+n);

        int totalSum=(n+1)*(n+2)/2;
        System.out.println("sum of all the numbers : "+totalSum);

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int missingNumber=totalSum-sum;
        System.out.println("Missing number : "+missingNumber);
    }
}


