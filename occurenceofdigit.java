import java.util.Scanner;

public class occurenceofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter number to check occurrence");
        int d=sc.nextInt();
        int c=0;
        while(n>0){
            int rem=n%10;
            if (rem==d){
                c++;
            }
            n=n/10;

        }
        System.out.println(c);
        
    }
}
