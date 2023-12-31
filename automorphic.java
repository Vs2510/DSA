import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int s=num*num;
        System.out.println(s);
       int  r1=num%10;
       int r2=s%10;
       if (r1==r2){
        System.out.println("Automorphic");
       }
       else{
        System.out.println("Not automorphic");
       }

    }
}
