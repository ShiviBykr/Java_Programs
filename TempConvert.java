import java.util.Scanner;

public class TempConvert{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--Menu--");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Celsius");
        double c,f;
        String cr;
        do{
            System.out.println("Enter your choice:");
            int ch=Integer.parseInt(sc.nextLine());
            switch(ch){
                case 1:
                    System.out.println("Enter the temperature in F:");
                    f=Double.parseDouble(sc.nextLine());
                    c=(5*(f-32))/9;
                    System.out.println("Temperature in Celsius: "+c);
                    break;
                case 2:
                    System.out.println("Temperature in celsius:");
                    c=Double.parseDouble(sc.nextLine());
                    f=(9*c)/5+32;
                    System.out.println("Temperature in Fahrenheit "+f);
                    break;
                default: System.out.println("INVALID CHOICE");
            }
            System.out.println("Want to calculate another conversion? (y/n)");
            cr=sc.nextLine();
        }while(cr.equals("y"));
        sc.close();
    }
}