/* 
// 1 ) even  and odd numbers array
import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Even numbers :");
        for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0){
            System.out.println(arr[i]);
          }
        }
        System.out.println("odd numbers :");
        for(int i=0;i<arr.length;i++){
          if(arr[i]%2!=0){
            System.out.println(arr[i]);
          }
        }
    }
}


//2.) copy all elementes one  array into another array


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


// 3).find duplicate elementes of array

class Example{
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


//4). reverse of the array

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


// 5).largest element in array 

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


// smallest number in array

class Example{
  public static void main(String[] args) {
    int arr[]=new int[]{85,35,23,12,34};

    int min=arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]<min){

        min=arr[i];

      }
    }
    System.out.println("smallest number in array : "+min);
  }
}

// 6).  sorted elementes of an array in asending order

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

// 7).freqency of array in java

class Example{
  public static void main(String[] args) {
    int arr[]={1,2,3,4,2,2,3,1};
    output
     *  Element              Frequency            
     *       1                  2                  
     *       2                  3  
     *       3                  2 
     *       4                  1 
     * 
     * count=1
     * 1-
     * 2-
     * 3-
     * 4-                
     
    int freq[]=new int[arr.length];
    int visited=-1;  // that means this element is visited we dont want to visited again
    for(int i=0;i<arr.length;i++){

      int count=1;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          count++;
          freq[j] = visited;
        }
        if(freq[i] !=visited){
          freq[i]=count;
        }
      }
    }
    for(int i=0;i<freq.length;i++){
      if(freq[i]!=visited){ 
      System.out.println(arr[i]+" |"+freq[i]);
      }
    }

  }
}




// 8.) different ways to print array
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


class Example{
  public static void main(String[] args) {
    int a[] = new int[3];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    for(int b:a){
      System.out.print(b+" ");
    }
  }
}



// 9). print array elementes using array class
// toString()      asList()    deepToString()
import java.util.Arrays;
class Example{
  public static void main(String[] args) {
    String a[]={"learning","coading","keypoints","Education"};
    System.out.println("toString : "+Arrays.toString(a));
     System.out.println("asList : "+Arrays.asList(a));
      System.out.println("deepToString : "+Arrays.deepToString(a));
  }
}


// 10). array length

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




//  11).   reverse order


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


// 12). add and sum of all array elementes
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

  

  // 13).  SEARCH ELEMENTES IN ARRAY
  
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


// 14). find average of array elementes :

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



// 15) array ascending order
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



// 16). array descnding order

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
*/


