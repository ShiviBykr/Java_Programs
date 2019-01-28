import java.util.Scanner;

public class AgeCompare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of Ram:");
        int r=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the age of Shyam:");
        int s=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the age of Ajay");
        int a=Integer.parseInt(sc.nextLine());
        if(r<s&&r<a){
            System.out.println("Ram is the youngest");
        }else if(s<r&&s<a){
            System.out.println("Shyam is the youngest");
        }else{
            System.out.println("Ajay is the yougest");
        }
        sc.close();
    }
}