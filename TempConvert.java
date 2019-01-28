import java.util.Scanner;

public class TempConvert{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double f=sc.nextDouble();
        double c=(5/9)*(f-32);
        System.out.println("Temperature in celsius: "+c);
        sc.close();
    }
}