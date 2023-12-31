import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            p=(p*10)+rem;
            n=n/10;
        }
        System.out.println(p);
        if (p==temp){
            System.out.println("We have a palindrome number");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}