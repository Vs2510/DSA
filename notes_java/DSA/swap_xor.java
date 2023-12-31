import java.util.Scanner;

public class swap_xor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a: ");
        int a = s .nextInt();
        System.out.println("enter b : ");
        int b=s.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The numbers after swapping are: ");
        System.out.println(a);
        System.out.println(b);
    }
    
}
