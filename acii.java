import java.util.Scanner;

public class acii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        int i=ch;// for typecasting ascii conveter
        System.out.println(i);
    }
    
}
