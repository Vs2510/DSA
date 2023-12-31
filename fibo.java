import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n=sc.nextInt();
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        int a=0,b=1;
        int c;
        for (int i=0;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
         System.out.print(c +" ");
        }
    }
    
}
