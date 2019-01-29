import java.util.Scanner;

public class Range{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int a=Integer.parseInt(sc.nextLine());
        int i=1;
        while(i<=a){
            System.out.println("Enter a number:");
            int n=Integer.parseInt(sc.nextLine());
            System.out.println(n);
        }
        sc.close();
    }
}