
import java.util.Scanner;
class Sample{
    public static void main(String[] args) {
    int sal; double tax;
    System.out.println("Enter salary : ");
    Scanner sc=new Scanner(System.in);
    sal=sc.nextInt();
    if(sal<=10000){
        System.out.println(sal+"No tax");
    }else if(sal>10000 && sal<=100000){
        tax=sal*0.10;
        System.out.println(sal+" "+tax);
    }else{
         tax=sal*0.20;
        System.out.println(sal+" "+tax);
    }
    
    }
}