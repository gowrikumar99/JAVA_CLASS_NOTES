import java.util.Scanner;
class E1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1 Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the 2 Number: ");
        int num2=sc.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1%num2);
        System.out.println(num1/num2);
    }
}