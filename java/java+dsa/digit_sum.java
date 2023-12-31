import java.util.Scanner;

public class digit_sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number : ");
            int n=sc.nextInt();
            int sum=0;
            int r;
            while (n>0){
                r=n%10;
                sum=sum+r;
                n=n/10;

            }
            System.out.println("The sum of the digit is  : " + sum );
        }
    }
    
}
