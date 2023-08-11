import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count=count+1;
            }
        }
        if(count==0){
            System.out.println("This is prime number : ");
        }
        else{
            System.out.println("This is not prime number");
        }
    }
}
