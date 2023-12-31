import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome: ");
        int n= sc.nextInt();
        int r;
int s =0;
int c=n;

        while (n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (c==s){
            System.out.println("Palindrome");

        }
        else
             System.out.println("Not a Palindrome");
        
    }
    
}
