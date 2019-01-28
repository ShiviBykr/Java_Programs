import java.util.Scanner;

public class CheckEven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=Integer.parseInt(sc.nextLine());
        if(n%2==0)
        System.out.println(n+" is even");
        else 
        System.out.println(n+" is odd");
        sc.close();
    }
}