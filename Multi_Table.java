import java.util.Scanner;

public class Multi_Table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the multiplication table of:");
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        sc.close();
    }
}