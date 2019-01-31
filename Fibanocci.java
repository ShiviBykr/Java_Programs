import java.util.Scanner;

public class Fibanocci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of your choice:");
        int n=Integer.parseInt(sc.nextLine());
        int n1=0, n2=1, temp=0, i=1;
        System.out.println("Fibanocci Series:");
        while(i<=n){
            n1=n2;
            n2=temp;
            temp=n1+n2;
            System.out.println(n2);
            i++;
        }
        sc.close();
    }
}