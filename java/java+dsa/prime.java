import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime: ");
        int n= sc.nextInt();
        int r;
        int count =0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count ++;

            }
        }
        if (count ==2){
            System.out.println("Number is prime ");
        }
        else
            System.out.println("not prime");
    }
    
}
