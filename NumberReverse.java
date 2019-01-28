import java.util.Scanner;

public class NumberReverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=Integer.parseInt(sc.nextLine());
        int m=n;
        int rev=0;
        int rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Interchanged number of "+m+" : "+rev);
        if(rev==m){
            System.out.println("Original and interchanged are same indeed!");
        }
        else{
            System.out.println("Both numbers are not same");
        }
        sc.close();
    }
}