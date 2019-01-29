import java.util.Scanner;

public class Count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int pcount=0, ncount=0, zcount=0;
        do{
            System.out.println("Enter a number of your choice:");
            int n=Integer.parseInt(sc.nextLine());
            if(n>0){
                pcount++;
            }
            else if(n<0){
                ncount++;
            }else if(n==0){
                zcount++;
            }
            System.out.println("Want to enter somemore? (y/n)");
            str=sc.nextLine();
        }while(str.equals("y"));
        System.out.println("No of positive entries: "+pcount);
        System.out.println("No of negative entries: "+ncount);
        System.out.println("No of zero entries: "+zcount);
        sc.close();
    }
}