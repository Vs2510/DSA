import java.util.Scanner;

public class palindromerange {

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower:");
        num1 = sc.nextInt();
        System.out.println("Enter upper limit: ");
        num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            int n = i;
            int rev = 0;

            while (n > 0) {
                rev = (rev * 10) + n % 10;
                n = n / 10;
            }
            if (rev == i) {
                     System.out.print(i+" ");
            }
        }
    }
}