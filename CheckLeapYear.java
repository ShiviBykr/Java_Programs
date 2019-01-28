import java.util.Scanner;

public class CheckLeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int n=Integer.parseInt(sc.nextLine());
        if(n%4==0)
        System.out.println(n+" is a leap year");
        else 
        System.out.println(n+" is not a leap year");
        sc.close();
    }
}