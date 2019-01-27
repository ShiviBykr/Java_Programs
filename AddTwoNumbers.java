import java.util.Scanner;

public class AddTwoNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the value of b:");
        int b=Integer.parseInt(sc.nextLine());
        int c=a+b;
        System.out.println("sum: "+c);
        sc.close();
    }
}