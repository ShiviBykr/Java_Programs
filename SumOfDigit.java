import java.util.Scanner;

public class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=Integer.parseInt(sc.nextLine());
        int m=n;
        int sum=0;
        int r;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("The sum of digits of "+m+" is: "+sum);
        sc.close();
    }
}