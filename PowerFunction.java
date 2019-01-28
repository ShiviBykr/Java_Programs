import java.util.Scanner;

public class PowerFunction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of base:");
        int a=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the value of index:");
        int n=Integer.parseInt(sc.nextLine());
        int temp=1;
        for(int i=1;i<=n;i++){
            temp=temp*a;
        }
        System.out.println("The value of "+a+" raised to the power of "+n+" : "+temp);
        sc.close();
    }
}