import java.util.Scanner;

public class SwapNumbers{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=Integer.parseInt(input.nextLine());
        System.out.println("Enter the second number:");
        int b=Integer.parseInt(input.nextLine());
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+a+"\t"+"b= "+b);
        input.close();
    }
}